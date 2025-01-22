package domain;

import java.time.LocalDate;
import libCrittografia.Hash;

/**
 *
 * @author EM.LICATA
 */
public class Certificate {
    
    private String name;
    private LocalDate expireDate;
    private String entityName;
    private String publicKey;
    private String certificateSign;

    public Certificate() {
    }

    public Certificate(String name, LocalDate expireDate, String entityName, String publicKey, String certificateSign) {
        this.name = name;
        this.expireDate = expireDate;
        this.entityName = entityName;
        this.publicKey = publicKey;
        this.certificateSign = certificateSign;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getCertificateSign() {
        return certificateSign;
    }

    public void setCertificateSign(String certificateSign) {
        this.certificateSign = certificateSign;
    }
    
    public String getSha256(){
        return Hash.SHA256(name + expireDate + entityName + publicKey);
    }
    
    public String getSha1(){
        return Hash.SHA1(name + expireDate + entityName + publicKey);
    }
    
    public String getSha512(){
        return Hash.SHA512(name + expireDate + entityName + publicKey);
    }
    
    public String getMD5(){
        return Hash.MD5(name + expireDate + entityName + publicKey);
    }
    
}
