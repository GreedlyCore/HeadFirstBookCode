package LetsGOGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickColorChange implements ActionListener {

    JButton btn;
    JFrame frame;

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        btn = new JButton("click to change");
        btn.addActionListener(this);

        var panel = new Panel();

        frame.getContentPane().add(BorderLayout.SOUTH, btn);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(300,300);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        ClickColorChange gui = new ClickColorChange();
        gui.go();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
class Panel extends JPanel{

    public void paintComponent(Graphics g){
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int)  (Math.random() * 255);
        int blue = (int)  (Math.random() * 255);

        Color rcolor = new Color(red, green, blue);
        g.setColor(rcolor);
        g.fillOval(70,70,100,100);
    }
}