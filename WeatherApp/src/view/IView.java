/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllore.Controller;

/**
 *
 * @author emanu
 */
public interface IView {

    public void mostraMessaggio(String msg);

    public void setControllore(Controller controllore);

}
