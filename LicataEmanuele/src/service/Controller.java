/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.User;
import gui.IView;
import gui.View;
import java.util.HashMap;
import libCrittografia.EccezioneCripto;
import libCrittografia.Hash;

/**
 *
 * @author EM.LICATA
 */
public class Controller {

    private final HashMap<Integer, User> userList;
    private final HashMap<String, IView> viewList;

    public Controller() {
        userList = new HashMap<>();
        viewList = new HashMap<>();
    }

    public void addUser(User user) {
        userList.put(user.getCode(), user);
        IView view = new View(user.getName());
        view.setController(this);
        viewList.put(user.getName(), view);
    }

    public void insertUsers() {
        for (int i = 0; i < userList.size(); i++) {
            User u = userList.get(i);
            viewList.get(u.getName()).addUser(u.getName());
        }
    }

    public void sendMessage(int value, String text) throws EccezioneCripto {
        String cipherText = userList.get(value).cipher(text);
        viewList.get(userList.get(value).getName()).printMsg(value, cipherText);
    }

    public void sendDocument(int value, String text) throws EccezioneCripto {
        String cipherDocument = userList.get(value).cipher(text);
        viewList.get(userList.get(value).getName()).printMsg(value, cipherDocument);
    }

    public void generateDocSign(int value, String text) {
        switch (value) {
            case 1:
                Hash h = new Hash();
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default: System.out.println("Valore errato per il tipo di hash");
        }
    }

    public HashMap<Integer, User> getUserList() {
        return userList;
    }

    public HashMap<String, IView> getViewList() {
        return viewList;
    }

}
