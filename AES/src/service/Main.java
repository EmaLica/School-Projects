package service;

import view.*;

public class Main {
    public static void main(String[] args) {
        IView finestra = new View();
        IView finestra2 = new View2();
        Controllore controllore = new Controllore(finestra, finestra2);
    }
}