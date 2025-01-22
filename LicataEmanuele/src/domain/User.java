package domain;

import libCrittografia.EccezioneCripto;
import libCrittografia.Rsa;
import service.Authenticator;
import service.Controller;

/**
 *
 * @author EM.LICATA
 */
public class User {
    
    private final Controller controller;
    private final Authentication authentication;
    private final Authenticator authenticator;
    private String name;
    private final Rsa cifr;
    private final int code;
    private static int codeCounter = 0;

    public User(Controller controller, Authenticator authenticator, String name) throws EccezioneCripto {
        this.controller = controller;
        this.authenticator = authenticator;
        this.name = name;
        authentication = authenticator.createCertificate(this.name);
        cifr = new Rsa(authentication.getCertificate().getPublicKey(), authentication.getPrivateKey());
        code = codeCounter;
        codeCounter++;
        controller.addUser(this);
    }

    public Controller getController() {
        return controller;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public Authenticator getAuthenticator() {
        return authenticator;
    }

    public Rsa getCifr() {
        return cifr;
    }

    public int getCode() {
        return code;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCodeCounter() {
        return codeCounter;
    }

    public static void setCodeCounter(int codeCounter) {
        User.codeCounter = codeCounter;
    }
    
    public String cipher(String text) throws EccezioneCripto{
        return cifr.cifraPubblica(text, cifr.getChiavePubblica());
    }
    
    public String decipher(String text) throws EccezioneCripto{
        return cifr.decifraPrivata(text, cifr.getChiavePrivata());
    }
    
}
