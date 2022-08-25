package NumbersMatters;

public class TestMath {

    public static void main(String[] args) {
        /**
         * Никаких переменных экземпляра
         * Поведения метода не меняется вместе с состоянием переменной!
         * Зависит от аргументов метода только
         * ****************************
         *
         * Статический метод вызывается с помощью имени класса!
         * Обычный метод вызывается с помощью имени ссылочной переменной
         *
         * ****************************************8
         * Статический метод подразумевает, что его поведение не зависти от переменных экземпляра,
         * поэтому нет необходимости в объекте, нужен просто класс
         *
         * Статический метод не видит состояние полей
         */

        System.out.println(Math.min(100,102));
        System.out.println(Math.abs(-100));
        System.out.println(Math.round(-19.23232f));
        System.out.println(Math.PI);
        //Math obj = new Math();
        System.out.println("Some sinus + " +Math.asin(Math.PI/2));;
        System.out.println("Some sinus + " +Math.acos(Math.PI/2));;
        System.out.println("Math round + " +Math.round(Math.PI/2));;
        System.out.println("Math round + " +Math.round(Math.PI/4));;



        //CoolModule coolModule = new CoolModule();
        CoolModule.doStuff();

        CoolModule coolModule = new CoolModule();
        String[] s = {};
        // Вызываем СТАТИЧЕСКИЙ метод через  ссылку??? ... ну да
        // Однако эта ссылка заменяется классом, поэтому ничего не ломается
        coolModule.main(s);

        Duck duck = new Duck();
        System.out.println(Duck.usual);
    }


}


