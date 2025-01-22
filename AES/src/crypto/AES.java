package crypto;

import java.security.*;
import java.util.Base64;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public final class AES {
    private SecretKey key;

    public AES() {
        try {
            generaChiave();
        } catch(NoSuchAlgorithmException e) {
        }
    }
    
    public AES(String chiave) {
        byte[] aesKey = Base64.getDecoder().decode(chiave);
        key = new SecretKeySpec(aesKey, "AES");
    }
    
    public String decifra(String msg) {
        return decifra((Base64.getDecoder().decode(msg)));
    }
    
    private String decifra(byte[] msgByte) {
        try {
            Cipher aesCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            aesCipher.init(Cipher.DECRYPT_MODE, key);
            return new String(aesCipher.doFinal(msgByte));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
        }
        return null;
    }
    
    public String cifra(String msg) {
        return Base64.getEncoder().encodeToString(cifraToByte(msg));
    }
    
    private byte[] cifraToByte(String msg) {
        try {
            Cipher aesCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            aesCipher.init(Cipher.ENCRYPT_MODE, key);
            return aesCipher.doFinal(msg.getBytes());
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
        }
        return null;
    }
    
    public String getChiave() {
        return Base64.getEncoder().encodeToString(key.getEncoded());
    }
    
    public void generaChiave() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        key = keyGen.generateKey();
    }
}