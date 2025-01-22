package service;

import view.IView;

public class Controllore {
    private final IView finestra;
    private final IView finestra2;

    public Controllore(IView finestra, IView finestra2) {
        this.finestra = finestra;
        finestra.setControllore(this);
        this.finestra2 = finestra2;
        finestra2.setControllore(this);
    }
    
    public void cifra(String messaggio) {
        
    }
    
    public void decifra() {
    
    }
}