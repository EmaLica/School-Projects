package domain;

import java.time.LocalDate;

/**
 *
 * @author EM.LICATA
 */
public class Authentication {
    
    private Certificate certificate;
    private String privateKey;

    public Authentication(String name, String publicKey, String privateKey, String entityName) {
        certificate = new Certificate(name, LocalDate.now().plusYears(1) , entityName, publicKey, "");
        this.privateKey = privateKey;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
    
}
