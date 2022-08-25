package Magnets;

// Полнолуние бывает раз в 29.52 дня
// Полнолуние было 7 янв 2004 года
// Надо вывести много полнолуний

import static java.lang.System.out;
import static java.lang.System.setOut;

import java.util.*;


class FullMoons{

    static int DAY_IM = 1000*60*60*24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40);
        //c.set(2004,1,7,15,40);
        long day1 = c.getTimeInMillis();


        for (int x = 0; x < 60; x++) {
            day1 += (DAY_IM * 29.52f);
            c.setTimeInMillis(day1);

            out.println(String.format("full moon on %tc", c));
        }
    }
}

