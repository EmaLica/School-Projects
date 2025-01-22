package controller;

import dominio.Persona;
import persistenza.PersistenzaPersona;
import view.IView;

/**
 *
 * @author emanu
 */
public class Controllore {

    private final PersistenzaPersona dbAlunno = new PersistenzaPersona();
    private final IView view;

    public Controllore(IView view) {
        this.view = view;
        view.setControllore(this);
    }

    public void salvataggioAlunno(Persona alunno) {
        try {
            dbAlunno.create(alunno);
            view.mostraMessaggio("Persona salvata correttamente");
        } catch (IllegalArgumentException e) {
            view.mostraMessaggio("Si è verificato il seguente errore: " + e.getMessage());
        }
    }

}
