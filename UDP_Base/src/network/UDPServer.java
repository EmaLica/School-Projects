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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanu
 */
public class UDPServer extends Thread {

    public final int PORTA_INVIO = 50000;
    public final int PORTA_RICEVI = 50001;

    public UDPServer() throws SocketException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        DatagramSocket socket = new DatagramSocket(PORTA_RICEVI);

                        byte[] buffer = new byte[256];

                        DatagramPacket richiesta = new DatagramPacket(buffer, buffer.length);
                        socket.receive(richiesta);

                        InetAddress clientAddress = richiesta.getAddress();
                        int clientPort = richiesta.getPort();

                        String data = "Messaggio dal server";
                        buffer = data.getBytes();

                        DatagramPacket risposta = new DatagramPacket(buffer, buffer.length, clientAddress, clientPort);
                        socket.send(risposta);
                    } catch (SocketException ex) {
                        Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

}
