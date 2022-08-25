package NumbersMatters;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FormatDates {

    public static void main(String[] args) {

        /**
         * ДЛЯ ТЕКУЩИХ ВРЕМЕННЫХ ОТМЕТОК -> Date
         * Для ВСЕГО ОСТАЛЬНОГО --> Calendar
         */


        System.out.println(String.format("%c", 420));
        System.out.println(String.format("%c", 42));



        System.out.println(String.format("Уровень %,d из %,.3f", 3434, 10000.34434f));


        // full date in java
        System.out.println(String.format("%tc", new Date()));
        // make it simple - only time
        System.out.println(String.format("%tr", new Date()));

        Date today = new Date();
        // tA день недели // %tB месяц // день месяца %rd
        System.out.println(String.format("%tA  %tB %td", today, today, today));
        System.out.println(String.format("%td, %tB", today, today, today));

        // Упрощенная форма записи
        // "<" используй пред аргумент еще раз
        System.out.println(String.format("%td, %<tB but simpler", today));

        ////////////////////////////////////////////////////////////////////////////////////
        System.out.println("-----------------------------------------------------------------");
        // Вызываем статическую дочку этого класса, ведь он абстрактный
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());

        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());

        long day1 = 1000*60*60*24; //in millis
        calendar.setTimeInMillis(calendar.getTimeInMillis() + day1);

        System.out.println(calendar.getTime());

        System.out.println("What's the hour?: " + calendar.get(calendar.HOUR_OF_DAY));

        calendar.add(calendar.DATE, 35); // added 35 days! with month changing
        System.out.println(calendar.getTime());

        calendar.add(calendar.DATE, -35*2); // backed 35 days! with month changing
        System.out.println(calendar.getTime());

        calendar.roll(calendar.DATE, 35); // added 35 days! withOUT month changing
        System.out.println(calendar.getTime());

        calendar.set(calendar.DATE, 1); // set day 1
        System.out.println(calendar.getTime());

        System.out.println(Calendar.getInstance().MONTH);

        // 27 february - 5 august
        Calendar feb = Calendar.getInstance();
        Calendar aug = Calendar.getInstance();
        feb.set(2022, 1,27);
        aug.set(2022, 7,5);
        System.out.println(feb.getTime());
        System.out.println(aug.getTime());
        System.out.println("Count of days is " + ( aug.getTimeInMillis()-feb.getTimeInMillis() )/(1000*60*60*24) );

        //////////////////////

        Date dateBefore = new Date(2022, Calendar.FEBRUARY, 27);
        Date dateAfter = new Date(2022, Calendar.AUGUST, 5);

        long dateBeforeInMs = dateBefore.getTime();
        long dateAfterInMs = dateAfter.getTime();

        long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);

        long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
        // Alternatevly:
        // int daysDiff = (int) (timeDiff / (1000 * 60 * 60 * 24));
        System.out.println(" The number of days between dates: " + daysDiff);
    }
}
