
import javax.swing.*;
import java.awt.geom.*;
import java.awt.*;
import java.util.Random;

public class DrawingCanvas extends JComponent {
    private int width;
    private int heigth;

    public DrawingCanvas(int w, int h){
        this.width = w;
        this.heigth = h;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D grph = (Graphics2D) g;

        for(int i=0;i<200;i++){
            Random numberRnd = new Random();
            int posX = numberRnd.nextInt(0,1024);
            int posY = numberRnd.nextInt(0,768);
            int sizeW = numberRnd.nextInt(0,80);
            int sizeH = numberRnd.nextInt(0,80);
            int r= numberRnd.nextInt(0,255);
            int gr= numberRnd.nextInt(0,255);
            int b= numberRnd.nextInt(0,255);
            Ellipse2D.Double e = new Ellipse2D.Double(posX,posY,40,40);
            BasicStroke bs = new BasicStroke(2);
            grph.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            grph.setStroke(bs);
            grph.setColor(new Color(r,gr,b));
            grph.draw(e);

        }
    }
}
