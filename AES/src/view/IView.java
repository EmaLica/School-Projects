package view;

import service.Controllore;

public interface IView {
    public void setControllore(Controllore controllore);
    public void stampa(String msg);
}