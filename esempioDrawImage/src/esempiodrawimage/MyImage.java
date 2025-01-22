package esempiodrawimage;

import java.awt.*;

public class MyImage {
    
    private final Image image;
    private Point leftTop;
    
    public MyImage(Image image, int x, int y){
        this.leftTop = new Point();
        leftTop.x = x;
        leftTop.y = y;
        this.image = image;
    }
    
    public void setPosition(Point p){
        leftTop = p;
    }
    
    public Point getStartPosition(){
        return leftTop;
    }
    
    public Point getEndPosition(){
        Point p = new Point();
        p.x = leftTop.x + image.getWidth(null);
        p.y = leftTop.y + image.getHeight(null);
        return p;
    }
    public Image getImage(){
        return image;
    }
}
