
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;

public class View extends JPanel {
    public BufferedImage image = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
    public int width;
    public int height;

    public View(int width, int height) {
        this.width = width;
        this.height = height;
        JFrame aJFrame = new JFrame();
        aJFrame.setLayout(new BorderLayout());
        aJFrame.add(this);
        aJFrame.setSize(width, height);
        aJFrame.setVisible(true);
        aJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);

    }



    public void draw(int[] getsort){
        Graphics gr = image.getGraphics();
        gr.setColor(new Color(0,0,0));
        gr.fillRect(0,0,width,height);
        gr.dispose();
        this.repaint();
        for(int i = 0;i<width;i++){
            Graphics gr2 = image.getGraphics();
            gr2.setColor(new Color(255,255,255));
            gr2.fillRect(i,0,1,getsort[i]);
            gr2.dispose();
            this.repaint();
        }

    }
}
