package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author emanu
 */
public class TCPClient {

    public final static int PORTA_SERVER = 50000;

    public static void main(String[] args) {
        String hostname = "localhost";
        try (Socket socket = new Socket(hostname, PORTA_SERVER)) {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());
            String str = "Ciaooooo";
            byte[] buffer = str.getBytes();
            output.write(buffer);
            output.close();
            input.close();
            socket.close();
        } catch (IOException ex) {
            System.out.println("Errore in input/output: " + ex.getMessage());
        }
    }

}
