/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getqr;

import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.ws.rs.client.*;
import javax.ws.rs.core.Response;
import totp.ServerTOTP;

/**
 *
 * @author emanu
 */
public class GetQR {

    public static void main(String[] args) {
        View view = new View();
        Utente utente = new Utente("admin@sus.", "1234", ServerTOTP.generaChiaveSegreta(), "Giorgio Genovesi");
        Client client = ClientBuilder.newClient();
        
        Response r = client.target("https://itismagistri.ddns.net/qr/app")
                .queryParam("s", ServerTOTP.getCodiceGoogleAuthenticator(utente.getChiaveSegreta(), utente.getUsername(), "Magistri"))
                .queryParam("size", 400)
                .request().get();
        
        if(r.getStatus() == 200){
            view.i.setIcon(new ImageIcon(r.readEntity(BufferedImage.class)));
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){
                        view.totp.setText(ServerTOTP.getCodiceTOTP(utente.getChiaveSegreta()));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                    }
                }
            }).start();
        }
        
        view.setVisible(true);
    }
    
}
