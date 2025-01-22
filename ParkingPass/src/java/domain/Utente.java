package domain;

import java.io.Serializable;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author emanu Date: 29-apr-2023
 * junit,       uml, dovrebbe andare offline, documentazione
 */
@Entity
@XmlRootElement
public class Utente implements Serializable {

    @Id
    private String username;
    private String password;
    private String nome;
    private String cognome;
    //Tre targhe massime per utente, per rispettare la prima forma normale abbiamo tolto l'hashmap
    private String targa1;
    private String targa2;
    private String targa3;
    
    
    public String getNome() {
        return nome;
    }
    
    public String getNomeCompleto() {
        return nome + cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTarga1() {
        return targa1;
    }

    public void setTarga1(String targa1) {
        this.targa1 = targa1;
    }

    public String getTarga2() {
        return targa2;
    }

    public void setTarga2(String targa2) {
        this.targa2 = targa2;
    }

    public String getTarga3() {
        return targa3;
    }

    public void setTarga3(String targa3) {
        this.targa3 = targa3;
    }

    

}
