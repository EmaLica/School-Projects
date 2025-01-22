/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.User;
import libCrittografia.EccezioneCripto;
import service.Authenticator;
import service.Controller;

/**
 *
 * @author EM.LICATA
 */
public class Main {
    
    public static void main(String[] args) throws EccezioneCripto {
        
        Controller controller = new Controller();
        Authenticator authenticator = new Authenticator();
        User u1 = new User(controller, authenticator, "Alice");
        User u2 = new User(controller, authenticator, "Bob");
        controller.insertUsers();
    }
    
}
