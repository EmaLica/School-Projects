package secretKey;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * @author emanu
 * Date: 18-apr-2023
 */

public class AESGenerator {
    
   public static SecretKey generateAESKey() {
      try {
         // Crea un oggetto KeyGenerator per l'algoritmo AES
         KeyGenerator keyGen = KeyGenerator.getInstance("AES");
         
         // Imposta la lunghezza della chiave AES (128, 192 o 256 bit)
         keyGen.init(192);
         
         // Genera una nuova chiave segreta AES
         SecretKey secretKey = keyGen.generateKey();
         
         return secretKey;
      } catch (Exception ex) {
         ex.printStackTrace();
         return null;
      }
   }
   
}

