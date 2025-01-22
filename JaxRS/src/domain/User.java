package domain;

import java.io.Serializable;

/**
 * @date 14-mar-2023
 * @author emanu
 */

public class User implements Serializable{
    
    private String username;
    private String password;
    private String secretKey;
    private String fullName;

    public User(){
        
    }
    
    public User(String username, String password, String secretKey, String fullName) {
        this.username = username;
        this.password = password;
        this.secretKey = secretKey;
        this.fullName = fullName;
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

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    
    
}
