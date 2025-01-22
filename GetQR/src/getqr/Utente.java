/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getqr;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author emanu
 */
@Entity
public class Utente implements Serializable{
    
    
    @Id
    private String username; 
    private String password, chiaveSegreta, nome;

    public Utente() {
    }

    public Utente(String username, String password, String chiaveSegreta, String nome) {
        this.username = username;
        this.password = password;
        this.chiaveSegreta = chiaveSegreta;
        this.nome = nome;
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

    public String getChiaveSegreta() {
        return chiaveSegreta;
    }

    public void setChiaveSegreta(String chiaveSegreta) {
        this.chiaveSegreta = chiaveSegreta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
