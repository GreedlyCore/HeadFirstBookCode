package LetsGOGUI;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);

        g.fillRect(20,50,100,122);

        paintComponentGradientRandom(g);
        paintComponentImages(g);
        paintComponentOvals(g);
        paintComponentGradient(g);
    }

    public void paintComponentImages(Graphics g){
        Image image = new ImageIcon("cs_logo.png").getImage();
        g.drawImage(image, 30, 40, this);
    }

    public void paintComponentOvals(Graphics g){
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int)  (Math.random() * 255);
        int blue = (int)  (Math.random() * 255);

        Color rcolor = new Color(red, green, blue);
        g.setColor(rcolor);
        g.fillOval(70,70,100,100);
    }

    public void paintComponentGradient(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70,70,Color.blue, 150,150, Color.orange);
        g2d.setPaint(gradient);
        g2d.fillOval(50,50,300,300);


    }

    public void paintComponentGradientRandom(Graphics g){

        int red = (int) (Math.random() * 255);
        int green = (int)  (Math.random() * 255);
        int blue = (int)  (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        int red2 = (int) (Math.random() * 255);
        int green2 = (int)  (Math.random() * 255);
        int blue2 = (int)  (Math.random() * 255);
        Color endColor = new Color(red2, green2, blue2);

        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(50,50,300,300);


    }

    public static void main(String[] args) {
        var panel = new MyDrawPanel();
        panel.setBackground(Color.GREEN.darker());

        var frame = new JFrame("A simple program");
        frame.setSize(900,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        //Graphics g = new Graphic
        //panel.paintComponent();
    }
}
