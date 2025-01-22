package jpa;

import controller.Controllore;
import view.GUI;
import view.IView;

/***
 * 
 * @author emanu
 */
public class Main {
    
    public static void main(String[] args) {
        GUI view = new GUI();
        Controllore controllore = new Controllore(view);
    }
    
}