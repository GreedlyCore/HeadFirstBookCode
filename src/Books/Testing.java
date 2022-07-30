package Books;

/**
 * Не забываем, что все объекты хранятся в ЕДИНОЙ куче под управлением сборщика мусора
 */

public class Testing {
    public static void main(String[] args) {

        //Объявляем ссылку b и говорим ей ссылаться на новый объект класса Book
        Book b = new Book();
        Book c = new Book();
        // Объявляем новую ссылку d и говорим ей сыылаться=указывать на объект с
        Book d = c;

        // Три ссылки и два объекта щас

        c = b; // ссылка С на объект book больше не ссылается, значит объект одинокий.. сборщик мусора рядом
        c = null; // ссылка теперь ни на что не указывает. НО ОНА ПО ПРЕЖНЕМУ ССЫЛОЧНАЯ ПЕРЕМЕННАЯ
        c = new Book(); // ссылаем на новый объект? третий!


        // Массив - тоже ссылочный тип данных
        // Но при этом он может хранить в себе ссылки на другие объекты
        //Arrays of pointers!
        Dog[] pets = new Dog[7];

        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2] = pets[1]; // pets[1] pets[2] ссылаются на один и тот же объект!

        pets[0].setName("Jack");
        pets[1].setName("Mary");
        System.out.println(pets[0].getName());
        System.out.println(pets[2].getName());
        System.out.println(pets[1].getName());

        //long t = 42; Too MUCH
        byte t = 42;

        System.out.println(Calculator.calcArea(t, 50));
    }

}


