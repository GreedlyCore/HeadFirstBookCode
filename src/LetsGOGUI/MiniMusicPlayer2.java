package LetsGOGUI;

import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {


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
        var mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go(){

        try {
            var sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsWait = {127};
            sequencer.addControllerEventListener(this, eventsWait);

            var seq = new Sequence(Sequence.PPQ, 4);
            var track = seq.createTrack();

            for (int i = 5; i < 60; i+=4) {
                //176 - special code for Controll Event - means no Sound
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1, i, 100, i+2));

            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (Exception e) { e.printStackTrace();}
    }

    @Override
    public void controlChange(ShortMessage event) {
        System.out.println("ля");
    }
}
