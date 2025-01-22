package main;

import encryption.AESCrypter;
import javax.crypto.SecretKey;
import secretKey.AESGenerator;


/**
 * @author emanu Date: 18-apr-2023
 */
public class Main {

    public static void main(String[] args) {
        final String secretKey = AESGenerator.generateAESKey().toString();
        String originalString = "Buongiorno Pescheriaaaaaaaa";
        String encryptedString = AESCrypter.encrypt(originalString, secretKey);
        String decryptedString = AESCrypter.decrypt(encryptedString, secretKey);
        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);
    }

}
