package HandleException;

import javax.sound.midi.*;


public class MusicTest1 {

    public void play(){

        try {

            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("got sequencer!");
            sequencer.open();

            float timing = Sequence.PPQ;
            Sequence seq = new Sequence(timing, 4);

            Track t = seq.createTrack();
            /**
             * MidiEvent - когда проигрывать
             * Message - что проигрывать
             */
            ShortMessage a = new ShortMessage();
            ShortMessage b = new ShortMessage();
            // Выбираем ноту №44
            // 144 - тип сообщения  / data2 - скорость и сила нажатия клавиши
            // 144 - начало проигрывания ноты - CMD
            // 128 - конец проигрывания ноты - CMD
            // 0 до 127 - выбор ноты с низких до высоких - data1
            a.setMessage(144,1,20,100);
            b.setMessage(192,1,102,0);
            // tick - первый такт

            MidiEvent noteOn = new MidiEvent(a,1);
            //MidiEvent noteOn = new MidiEvent(a,1);
            t.add(noteOn);
            sequencer.setSequence(seq);

            sequencer.start();
            sequencer.stop();


            t.add(new MidiEvent(b,3));
            sequencer.setSequence(seq);

            sequencer.start();



        } catch (MidiUnavailableException | InvalidMidiDataException ex) {

            System.out.println("Failed! " + ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();

        } finally { // действие нужно выполнить не смотря ни на что, даже return не помешает!
            //
        }



    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }

}
