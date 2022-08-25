package LetsGOGUI;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation   {
    int x = 200;
    int y = 700;
    int deltaX = 5;
    int deltaY = 5;

    private JFrame frame;


    public void go(){
        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,1000);
        frame.setVisible(true);

        frame.getContentPane().add(BorderLayout.CENTER, new DrawPanel());
        for (int i = 0; i < 130; i++) {
            x--;
            y++;
            frame.repaint();
            try {
                Thread.sleep(5);
            } catch (Exception e){ }
        }
    }
    public static void main(String[] args) {
        var anim = new SimpleAnimation();
        anim.go();
    }

    class DrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.ORANGE);
            g.fillOval(x,y,100,100);
        }
    }

}
