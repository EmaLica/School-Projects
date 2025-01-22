package server;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dominio.Message;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.websocket.*;
import javax.websocket.server.*;

@ServerEndpoint(value = "/chat/{username}", decoders = MessageDecoder.class, encoders = MessageEncoder.class)
public class ChatEndpoint {

    private Session session;
    private static final Set<ChatEndpoint> endpoints = new CopyOnWriteArraySet<>();
    private static final HashMap<String, String> listaUtenti = new HashMap<>();

    @OnOpen
    public void onOpen(Session session, @PathParam("username") String username) throws IOException, EncodeException {
        this.session = session;
        endpoints.add(this);
        listaUtenti.put(session.getId(), username);
        Message message = new Message();
        message.setFrom(username);
        message.setContent("Ciao a tutti!");
        broadcast(message);
    }

    @OnMessage
    public void onMessage(Session session, String message) throws IOException, EncodeException {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(message, JsonObject.class);
        Message msg = new Message();
        String date = new Date().toString();
        msg.setFrom(listaUtenti.get(session.getId()));
        msg.setContent(jsonObject.get("content").getAsString());
        msg.setTo(jsonObject.get("username").getAsString());
        msg.setDate(jsonObject.get("date").getAsString());
        System.out.println(message);
        if (msg.getTo().equals("")) {
            broadcast(msg);
        } else {
            sendMessageToUser(msg.getTo(), msg);
        }
    }

//    @OnMessage
//    public void onMessage(String message, Session sender) throws IOException {
//        JsonObject jsonMessage = Json.createReader(new StringReader(message)).readObject();
//        String recipientId = jsonMessage.getString("recipient");
//        String text = jsonMessage.getString("text");
//        LocalDateTime timestamp = LocalDateTime.now();
//
//        for (Session client : clients) {
//            if (client.getId().equals(recipientId)) {
//                JsonObject json = Json.createObjectBuilder()
//                        .add("sender", sender.getId())
//                        .add("text", text)
//                        .add("timestamp", timestamp.toString())
//                        .build();
//                client.getBasicRemote().sendText(json.toString());
//            }
//        }
//    }
    @OnClose
    public void onClose(Session session) throws IOException, EncodeException {
        endpoints.remove(this);
        Message message = new Message();
        message.setFrom(listaUtenti.get(session.getId()));
        message.setContent("Devo andare!");
        broadcast(message);
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        System.out.println("Si è verificato un errore nella sessione " + session.getId() + ": " + throwable.getMessage());
        try {
            session.close();
        } catch (IOException e) {
            System.out.println("Errore durante la chiusura della sessione " + session.getId() + ": " + e.getMessage());
        }
    }

    private static void broadcast(Message message) throws IOException, EncodeException {
        endpoints.forEach(endpoint -> {
            synchronized (endpoint) {
                try {
                    endpoint.session.getBasicRemote().sendObject(message);
                } catch (IOException | EncodeException e) {
                }
            }
        });
    }

    private static void sendMessageToUser(String username, Message message) throws IOException, EncodeException {
        endpoints.forEach(endpoint -> {
            synchronized (endpoint) {
                try {
                    if (listaUtenti.get(endpoint.session.getId()).equals(username)) {
                        endpoint.session.getBasicRemote().sendObject(message);
                        return;
                    }
                } catch (IOException | EncodeException e) {
                }
            }
        });
    }
}
