import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        //
        int w = 1024;
        int h = 768;

        JFrame jf = new JFrame();
        jf.setSize(w,h);
        DrawingCanvas drawingCanvas = new DrawingCanvas(w,h);
        jf.add(drawingCanvas);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("Test GUI");
        jf.setVisible(true);

    }
}
