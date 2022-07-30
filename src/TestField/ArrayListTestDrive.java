package TestField;

import java.util.ArrayList;

public class ArrayListTestDrive {

    public static void main(String[] args) {

        // <.....> - Параметризованные типы, означает список объектов STRING
        ArrayList<String> names = new ArrayList<String>();

        names.add("Anton");
        names.add("Sasha");
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.remove(1));
        System.out.println(names.contains("Artur"));
        System.out.println(names.contains("Sasha"));

    }

}
