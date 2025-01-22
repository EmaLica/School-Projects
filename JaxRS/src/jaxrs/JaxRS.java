package jaxrs;

import domain.User;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import view.View;
import totp.ServerTOTP;

/**
 *
 * @author emanu
 */
public class JaxRS {
    /***
     * Metodo main che istanzia un User, una View e "builda" un client.
     * Successivamente si dovrebbero salvare utenti su un database con tutti i dati
     * Quindi usiamo la persistenza con JPA
     */
    public static void main(String[] args) {
        View view = new View();
        User user = new User("pluto@gmail.com", "12345", ServerTOTP.generaChiaveSegreta(), "Giuseppe Rossi");
        String chiaveSegreta = ServerTOTP.generaChiaveSegreta();
        String stringaQr = ServerTOTP.getCodiceGoogleAuthenticator(chiaveSegreta, chiaveSegreta, chiaveSegreta);

        Client client = ClientBuilder.newClient();
        Response response = client.target("https://itismagistri.ddns.net")
                .queryParam("s", ServerTOTP.getCodiceGoogleAuthenticator(user.getSecretKey(), user.getUsername(), "magistri"))
                .queryParam("size", 300)
                .request().get();
        if(response.getStatus() == 200){
            view.i.setIcon(new ImageIcon(response.readEntity(BufferedImage.class)));
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {                        
                        view.TOTP.setText(ServerTOTP.getCodiceTOTP(user.getSecretKey()));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(JaxRS.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }).start();
        }
        view.setVisible(true);
    }
    
}
