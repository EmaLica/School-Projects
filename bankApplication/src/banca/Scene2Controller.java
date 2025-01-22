package banca;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Scene2Controller implements Initializable {
    
    @FXML
    TextField idLoggedIn, nameLoggedIn, mailLoggedIn, phoneLoggedIn, withdrawTextField, depositTextField;
    
    @FXML
    TextArea balanceTextArea;
    
    private float balance;
    
    
    public void displayId(String id){
        idLoggedIn.setText(id);
    }
    
    public void displayName(String name){
        nameLoggedIn.setText(name);
    }
    
    public void displayMail(String mail){
        mailLoggedIn.setText(mail);
    }
    
    public void displayPhone(String phone){
        phoneLoggedIn.setText(phone);
    }
    
    public void withdrawMethod(){
        balance = balance - Float.parseFloat(withdrawTextField.getText());
        if(balance < 0){
            balanceTextArea.setText("You run out of money");
        } else{
            balanceTextArea.setText(String.valueOf(balance));
        }
    }
    
    public void depositMethod(){
        balance = balance + Float.parseFloat(depositTextField.getText());
        balanceTextArea.setText(String.valueOf(balance));
    }
    
    public void exitMethod(){
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
