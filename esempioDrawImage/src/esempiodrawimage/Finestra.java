package esempiodrawimage;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Finestra extends JFrame {
    private MyPanel panel;
    
    public Finestra() {
        inizializza();
    }

    private void inizializza() {
        List<MyImage> images = new ArrayList<>();
        images.add(new MyImage(new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\esempioDrawImage\\src\\esempiodrawimage\\heart.png").getImage(), 120, 120));
        images.add(new MyImage(new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\esempioDrawImage\\src\\esempiodrawimage\\heart.png").getImage(), 180, 180));
        images.add(new MyImage(new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\esempioDrawImage\\src\\esempiodrawimage\\heart.png").getImage(), 240, 240));
        panel = new MyPanel(images);
        
        add(panel);
        setSize(panel.getWidth(),panel.getHeight());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }    
    
}