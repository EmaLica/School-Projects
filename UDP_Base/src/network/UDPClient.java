/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

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
public class UDPClient extends Thread {

    public final int PORTA_INVIO = 50000;
    public final int PORTA_RICEVI = 50001;

    public UDPClient() {;

        new Thread(
                new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        String hostname = "Emanuele";

                        InetAddress address = InetAddress.getByName(hostname);
                        DatagramSocket socket = new DatagramSocket();

                        byte[] buffer = new byte[512];

                        DatagramPacket richiesta = new DatagramPacket(buffer, buffer.length, address, PORTA_RICEVI);
                        socket.send(richiesta);
                        DatagramPacket risposta = new DatagramPacket(buffer, buffer.length);
                        socket.receive(risposta);

                        String quote = new String(buffer, 0, risposta.getLength());

                        System.out.println(quote);
                    } catch (SocketException ex) {
                        Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        ).start();
    }
}
