package NumbersMatters;

public class FormarNumbers {

    public static void main(String[] args) {

        int integer = 100000000;
        // Первый аргумент - инструкция, второй - с чем уже работаем
        /**
         *  % says - Вставьте сюда аргумент и отформатируйте его по инструкции
         */
        String s = String.format("%, d", integer);
        System.out.println(s);
        System.out.println(String.format("%, d wrewr", integer));
        System.out.println(String.format("Мне нужно исправить %.2f ошибки.", 420.44343f));
        System.out.println(String.format("Мне нужно исправить %,.2f ошибки.", 420.44343f));
        System.out.println(String.format("Мне нужно исправить %,.2f, ошибки.", 420.44343f));

        /**
         *  %,d      d - для расстановки десятичных
         *  %.2f    .2f - округляем до 2-х знаков
         *  %,.4f      ,  - еще и запятые расставляем
         *
         *  % [Номер аргумента][флаги - выравнивание/вставка ","][ширина - мин колво символов][.разрядность - колво знаков после ","] тип  - d / f
         *
         */

        System.out.println(String.format("Мне нужно исправить %,6.12f ошибки.", 45520.44343f));

        // ДРУГИЕ СИСТЕМЫ СЧИСЛЕНИЯ ....
        // 10 -> 16
        System.out.println(String.format("%x", 412));
        System.out.println(String.format("%x", 42));

        // СИМВОЛЫ кодировачные

        System.out.println(String.format("%c", 420));
        System.out.println(String.format("%c", 42));

        // Множественное форматирование

        System.out.println(String.format("Уровень %,d из %,.3f", 3434, 10000.34434f));
    }
}
