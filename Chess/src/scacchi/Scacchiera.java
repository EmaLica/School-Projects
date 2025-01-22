package scacchi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pezzi.Pezzo;

/**
 * @date 11-feb-2023
 * @author emanu
 */
public class Scacchiera {

    public static LinkedList<Pezzo> ps = new LinkedList<>();
    public static Pezzo selectedPiece = null;

    public static void main(String[] args) {

        Image icone[] = new Image[12];
        Image alfiereN = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\BlackBishop.png").getImage();
        Image alfiereB = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\WhiteBishop.png").getImage();
        Image torreN = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\BlackRook.png").getImage();
        Image torreB = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\WhiteRook.png").getImage();
        Image reginaN = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\BlackQueen.png").getImage();
        Image reginaB = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\WhiteQueen.png").getImage();
        Image cavalloN = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\BlackHorse.png").getImage();
        Image cavalloB = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\WhiteHorse.png").getImage();
        Image pedoneN = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\BlackPond.png").getImage();
        Image pedoneB = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\WhitePond.png").getImage();
        Image reN = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\BlackKing.png").getImage();
        Image reB = new ImageIcon("C:\\Users\\emanu\\Documents\\NetBeansProjects\\Chess\\src\\immagini\\WhiteKing.png").getImage();

        icone[0] = alfiereN;
        icone[1] = alfiereB;
        icone[2] = torreN;
        icone[3] = torreB;
        icone[4] = reginaN;
        icone[5] = reginaB;
        icone[6] = cavalloN;
        icone[7] = cavalloB;
        icone[8] = pedoneN;
        icone[9] = pedoneB;
        icone[10] = reN;
        icone[11] = reB;

        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 512, 512);
        JPanel chess = new JPanel() {
            @Override
            public void paint(Graphics g) {
                boolean white = true;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (white) {
                            g.setColor(new Color(238, 238, 210));
                        } else {
                            g.setColor(new Color(118, 150, 86));

                        }
                        g.fillRect(i * 100, j * 100, 100, 100);
                        white = !white;
                    }
                    white = !white;
                }
                for (Pezzo p : ps) {
                    int ind = 0;
                    if (p.nome.equalsIgnoreCase("Alfiere")) {
                        ind = 0;
                    }
                    if (p.nome.equalsIgnoreCase("Pedone")) {
                        ind = 8;
                    }
                    g.drawImage(icone[ind], p.x, p.y, this);
                }
            }
        };
        frame.add(chess);
        frame.setSize(850, 850);
        frame.setTitle("Scacchi");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
