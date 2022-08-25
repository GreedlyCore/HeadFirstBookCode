package LetsGOGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Обработка событий и внутренние классы
 */
public class LetsGoGUI implements ActionListener{

    JButton btn;

    public static void main(String[] args) {
        LetsGoGUI gui = new LetsGoGUI();
        gui.go();
    }

    public void changeTXT(JButton btn){
        btn.setText("I've been clicked!");
    }
    public void go(){

        // Как прозрачная доска, на которую можно добавлять элменты ( карандашом, временно )
        JFrame frame = new JFrame();

        btn = new JButton("click on me");
        btn.setSize(100,200);
        btn.addActionListener((ActionListener) this);

        frame.getContentPane().add(btn);
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        btn.setText("I've been clicked!");
    }
}
