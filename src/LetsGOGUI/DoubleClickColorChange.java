package LetsGOGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoubleClickColorChange {

//    JButton colorBtn;
//    JButton textBtn;
    JLabel label;
    JFrame frame;

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton colorBtn = new JButton("click to change");
        colorBtn.addActionListener(new ColorButtonListener());

        JButton textBtn = new JButton("click");
        textBtn.addActionListener(new LabelListener());

        label = new JLabel("It's me!!!!!!");

        var panel = new MyDrawPanel();

        //frame.getContentPane().add(BorderLayout.SOUTH, colorBtn);
        frame.getContentPane().add(BorderLayout.SOUTH, textBtn);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(300,300);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        ClickColorChange gui = new ClickColorChange();
        gui.go();
    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == colorBtn){
//            frame.repaint();
//        } else if (e.getSource() == textBtn){
//            label.setText("Dont touch me!");
//        }
//    }



    class LabelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Dont touch me!");
        }
    }

    class ColorButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

}

