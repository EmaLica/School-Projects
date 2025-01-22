package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanu
 */
public class TCPServer {

    public final static int PORTA_SERVER = 50000;
    public final static int PORTA_CLIENT = 50001;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORTA_SERVER)) {
            System.out.println("Server in ascolto sulla porta numero: " + PORTA_SERVER);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Un nuovo client si è appena collegato.");
                DataInputStream is = new DataInputStream(socket.getInputStream());
                DataOutputStream os = new DataOutputStream(socket.getOutputStream());
                System.out.println("Dal client: " + os);
                os.close();
                is.close();
                socket.close();
            }
        } catch (IOException ex) {
            System.out.println("Errore generato dal server: " + ex.getMessage());
        }
    }

}
