/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanu
 */
public class Client extends Thread {

    public Client() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        DatagramSocket clientSocket = new DatagramSocket();
                        InetAddress address = InetAddress.getLocalHost();
                        String str = "Ciaooooo";
                        byte[] buffer = str.getBytes();
                        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 50000);
                        clientSocket.send(packet);
                        clientSocket.close();
                    } catch (SocketException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnknownHostException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
}
