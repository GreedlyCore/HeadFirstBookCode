package LetsGOGUI;

import javax.sound.midi.*;

public class MiniMusicPlayer {


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

        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            var seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 64; i+=4) {
                //start --> stop
                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(128,1,i,100,i+5));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (MidiUnavailableException | InvalidMidiDataException e) { }
    }
}
