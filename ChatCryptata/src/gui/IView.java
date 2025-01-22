package gui;

import service.Controllore;

/**
 * @author emanu
 * Date: 16-mag-2023
 */

public interface IView {
    public void addUser(String name);
    public void printClearMessage(int valore, String testo);
    public void setController(Controllore controllore);
}