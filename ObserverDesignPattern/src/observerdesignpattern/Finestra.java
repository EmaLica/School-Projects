package observerdesignpattern;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Finestra extends JFrame implements ActionListener{
    
    private JButton btn1 = new JButton("Bottone 1");
    private JButton btn2 = new JButton("Bottone 2");
    private JButton btn3 = new JButton("Bottone 3");
    private JButton btn4 = new JButton("Bottone 4");

    public Finestra(AltroAscoltatoreDiBottoni altroAscoltatore) {
        //settiamo il layout
        setLayout(new BorderLayout());
        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.EAST);   
        add(btn3,BorderLayout.SOUTH);
        add(btn4,BorderLayout.WEST);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //registrare la finestra come ascoltatore
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn1.addActionListener(altroAscoltatore);
        btn2.addActionListener(altroAscoltatore);
        btn3.addActionListener(altroAscoltatore);
        btn4.addActionListener(altroAscoltatore);
        
        
        pack();
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton chiEStato = (JButton)e.getSource();
        if(chiEStato.equals(btn1)){
            System.out.println("Era il bottone 1");
        }
        if(chiEStato.equals(btn2)){
            System.out.println("Era il bottone 2");
        }
        if(chiEStato.equals(btn3)){
            System.out.println("Era il bottone 3");
        }
        if(chiEStato.equals(btn4)){
            System.out.println("Era il bottone 4");
        }
    }
    
    
    
    
}
