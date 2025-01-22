/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Authentication;
import java.util.HashMap;
import libCrittografia.EccezioneCripto;
import libCrittografia.Rsa;

/**
 *
 * @author EM.LICATA
 */
public class Authenticator {
    
    private final HashMap<Integer, Authentication> certificateList;
    private final Rsa keys;
    private int code;
    private static int codeCounter = 0;

    public Authenticator() throws EccezioneCripto {
        certificateList = new HashMap<>();
        keys = new Rsa();
    }
    
    public Authentication createCertificate(String name) throws EccezioneCripto{
        Rsa userKeys = new Rsa();
        Authentication authentication = new Authentication(name, userKeys.getChiavePubblica(), userKeys.getChiavePrivata(), "Comune");
        authentication.getCertificate().setCertificateSign(keys.cifraPrivata(authentication.getCertificate().getSha256(), keys.getChiavePrivata()));
        code = codeCounter;
        certificateList.put(code, authentication);
        codeCounter++;
        return authentication;
    }
    
    
    
}
