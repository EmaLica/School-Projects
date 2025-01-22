package banca;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    TextField bankIdTextField, clientNameTextField, clientMailTextField, clientPhoneTextField;
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void changeScene(ActionEvent event) throws IOException {
        if(bankIdTextField.getText().isEmpty() == true ){
            System.out.println("Hai lasciato un campo vuoto!");
            System.exit(0);
        }
        if(clientNameTextField.getText().isEmpty() == true ){
            System.out.println("Hai lasciato un campo vuoto!");
            System.exit(0);
        }
        if(clientMailTextField.getText().isEmpty() == true ){
            System.out.println("Hai lasciato un campo vuoto!");
            System.exit(0);
        }
        if(clientPhoneTextField.getText().isEmpty() == true ){
            System.out.println("Hai lasciato un campo vuoto!");
            System.exit(0);
        }
        
        String id = bankIdTextField.getText();
        String name = clientNameTextField.getText();
        String mail = clientMailTextField.getText();
        String phone = clientPhoneTextField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));	
	root = loader.load();	
        Scene2Controller scene2Controller = loader.getController();
	scene2Controller.displayId(id);
        scene2Controller.displayName(name);
        scene2Controller.displayMail(mail);
        scene2Controller.displayPhone(phone);	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
    }
    
    
    public void exitMethod(){
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
