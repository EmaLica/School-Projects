package gui;

import service.Controller;

/**
 *
 * @author EM.LICATA
 */
public interface IView {
    public void setController(Controller controller);
    public void addUser(String name);
    public void printMsg(int value, String text);
    public void printDocument(int value, String text);
}
