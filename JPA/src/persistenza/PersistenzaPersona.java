package persistenza;

import dominio.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author EM.LICATA
 */
public class PersistenzaPersona implements IPersistenza<String, Persona>{
    
    private static EntityManager em = Persistence.createEntityManagerFactory("PersistanceUnit").createEntityManager();
    //private static ArrayList<Alunno> elenco = new ArrayList<>();
    
    @Override
    public void create(Persona obj) throws IllegalArgumentException {
        em.getTransaction().begin(); //DA QUI LA TRANSAZIONE HA UN INIZIO
        em.persist(obj); //POSSONO VERIFICARSI EXCEPTION
        em.getTransaction().commit(); //DA QUI LA TRANSAZIONE HA UNA FINE
    }

    @Override
    public Persona read(String idObject) throws IllegalArgumentException {
        return em.find(Persona.class, idObject); //SE L'OBJ E' NULL EXCEPTION
    }

    @Override
    public void update(Persona Obj) throws IllegalArgumentException {
        em.getTransaction().begin();
        em.merge(Obj);
        em.getTransaction().commit(); 
    }

    @Override
    public void delete(Persona obj) throws IllegalArgumentException {
        em.getTransaction().begin();
        em.remove(obj);
        em.getTransaction().commit(); 
    }

    @Override
    public List<Persona> elencoCompleto() {
        //QUI DOVREI SCRIVERE IL CODICE SQL
        return em.createQuery("SELECT a FROM Persona AS a ORDER BY A.cognome ASC").getResultList();
    }
}
