package service;

import dominio.Utente;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import persistenza.PersistenzaUtente;
import qrLib.QR;
import sicurezza.Controllore;

/**
 * 24-feb-2023
 * @author emanu
 */

@ApplicationPath("app")
@Path("/")
@ServerEndpoint("/web")
public class MyApp extends Application {
    static HashMap<String, Session> sessioniAttive = new HashMap<>();
    PersistenzaUtente p = PersistenzaUtente.creaIstanza();
    
    public MyApp() {
    }
    //elenco di tutte le connessioni attive con websocket.id 
    //il server deve segnarsi da qualche parte l'id di questo socket con un hashmap
    //poi manda un mess al client che si puo caricare un qr code (mandando un messaggio)

    //1 chiama il server e fa eseguire onopen
    //2 ws.onmessage riconosce di aver ricevuto un messaggio 1: comando da eseguire 2: parametri
    //alert(event.data);
    //comandi[1] dentro ce il token di sessione
    @OnOpen
    public void OnOpen(Session sessioneWebSocket) throws IOException {
        sessioniAttive.put(sessioneWebSocket.getId(), sessioneWebSocket);
        String URL = "qr;http://localhost:8080/QR/app/qr/" + sessioneWebSocket.getId();
        sessioneWebSocket.getBasicRemote().sendText(URL);
        System.out.println("Sono stato contattato da un client");
    }

    @OnClose
    public void onClose(Session s) {
        sessioniAttive.remove(s.getId());
    }

    //prendiamo con postman la richiesta che dovrebbe mandare la nostra app
    @GET
    //ognuno di questi deve essere pathparam
    @Path("auth/{idWebSocket}/{username}/{password}/{idApp}")
    //va a vedere nell hashmap se esiste una sessione con questo id
    public Response autenticazione(
            @PathParam("idWebSocket") String idWebS,
            @PathParam("username") String username,
            @PathParam("password") String password,
            @PathParam("idApp") String idApp
    ) throws URISyntaxException, MalformedURLException, IOException {
        String url = "http://localhost:8080/qr/app/tmphome/";
        Utente userLogin = new Utente(username, password);
        NewCookie autheticationCookie = Controllore.controllo(userLogin, p);
        //sessioniAttive.get(idWebS).getBasicRemote().sendText("home;" + url + cookie);
        if (autheticationCookie == null) {
            return Response.ok().status(Response.Status.UNAUTHORIZED).build();
        }
        return Response.ok("Benvenuto " + username).cookie(autheticationCookie).build();
    }

    @GET
    @Path("tmphome/{cookie}")
    public Response tmpHome(@PathParam("cookie") String cookie) throws URISyntaxException {
        return Response.seeOther(new URI("me")).cookie(
            new NewCookie("cookieSessione", cookie, "/qr/app/me", null, null, 3600, false)).build();
    }

    @GET
    @Path("me")
    public Response getHome(@CookieParam("cookieSessione") String cookie) {
        return Response.ok(cookie).build();
    }
    
    @POST
    @Path("prova")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response prova(String libro) {
        return Response.ok().status(Response.Status.CREATED).build();
    }

    @GET
    @Path("qr/{codice}")
    @Produces("image/png")
    public Response getQr(@PathParam("codice") String testoDaStampare) {
        return Response.ok(QR.createQRCodeBufferedImage(testoDaStampare, 400)).build();
    }
    //pagina di login ha un web socket che contatta il nostro server quindi dobbiamo mettere una classe che faccia da server endpoint
}