/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp_base;

import java.net.SocketException;
import network.UDPClient;
import network.UDPServer;

/**
 *
 * @author emanu
 */
public class UDP_Base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException {
        UDPClient client = new UDPClient();
        UDPServer server =  new UDPServer();
        
        
    }
    
}
