/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.net.DatagramPacket;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JComboBox;
import view.View;

/**
 * Il Controller deve contenere tutta la logica di funzionamento e
 * sovraintende al funzionamento dell'applicazione. Ad esempio l'invio di un
 * messaggio deve seguire il seguente percorso logico: User Interface --->
 * Controllore ---> Network e analogamente la ricezione di un messaggio deve
 * seguire il seguente percorso logico: Network ---> Controllore ---> User
 * Interface
 * @author emanu
 */
public class Controller implements Serializable{
    
    private static final List<String> pcList = new LinkedList<>();
    private static View finestra = new View();
    
    public static void main(String[] args) throws InterruptedException {
        finestra.setClientsComboBox((JComboBox<String>) pcList);
    }
    
    public void sendPacket(){
        String str = finestra.getSendTextField().getText() + "\n";
        finestra.getReceiveTextArea().append(str);
    }
    
}
