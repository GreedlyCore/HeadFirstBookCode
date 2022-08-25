package LetsGOGUI;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer3 {

    static JFrame frame = new JFrame("My 1st musical clip");
    static MusicDrawPanel panel;

    public static MidiEvent makeEvent (int cmd, int chan, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(cmd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) { }
        return event;
    }

    public static void main(String[] args) {
        var mini = new MiniMusicPlayer3();
        mini.go();
    }
    public void setupGUI(){

        try{

            panel = new MusicDrawPanel();
            frame.setContentPane(panel);
            frame.setBounds(30,30,300,300);
            frame.setVisible(true);

        } catch (Exception e){ }
    }
    public void go(){
        setupGUI();
        try {
            var sequencer = MidiSystem.getSequencer();
            sequencer.open();


            sequencer.addControllerEventListener(panel, new int[] {127} );

            var seq = new Sequence(Sequence.PPQ, 4);
            var track = seq.createTrack();
            int r;
            for (int i = 5; i < 60; i+=4) {
                r = (int) ( (Math.random() * 50) + 1);
                track.add(makeEvent(144,1,r,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1, i, 100, i+2));

            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(120);
            sequencer.start();

        } catch (Exception e) { e.printStackTrace();}
    }




    class MusicDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;


        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint(); // mother
        }

        @Override
        public void paintComponents(Graphics g) {
            if (msg){
                Graphics2D g2 = (Graphics2D) g;

                int red = (int) ( Math.random()*250);
                int green = (int) ( Math.random()*250);
                int blue = (int) ( Math.random()*250);

                g.setColor(new Color(red, green, blue));

                int ht = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);
                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);
                g.fillRect(x,y,ht,width);
                msg = false;
            }
        }
    }



}


