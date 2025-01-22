package esempiodrawimage;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.List;
import javax.swing.JPanel;

public final class MyPanel extends JPanel {

    private final List<MyImage> images;
    private MyImage selImage;

    public MyPanel(List<MyImage> images) {
        setSize(600, 600);
        this.images = images;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                selImage = null;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                selImage = selezionaImage(e.getPoint());
            }

            private MyImage selezionaImage(Point point) {
                for (MyImage i : images) {
                    if ((point.x >= i.getStartPosition().x && point.y >= i.getStartPosition().y)
                            && (point.x <= i.getEndPosition().x && point.y <= i.getEndPosition().y)) {
                        return i;
                    }
                }
                return null;
            }

        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                if (selImage != null) {
                    selImage.setPosition(e.getPoint());
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        images.forEach((i) -> {
            g2d.drawImage(i.getImage(), i.getStartPosition().x, i.getStartPosition().y, this);
        });
        g2d.dispose();
    }

}
