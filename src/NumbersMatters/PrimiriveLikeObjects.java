package NumbersMatters;

import kotlin.ranges.CharRange;

import java.util.ArrayList;

public class PrimiriveLikeObjects {

    public static void main(String[] args) {
        int x = 32;
        ArrayList list = new ArrayList();
        list.add(x);


        int i = 244;
        Integer iWrapOld = new Integer(i);
        Integer iWrapNew = i;
        int unWrapped = iWrapOld.intValue();

        boolean flag = false;

        Boolean var = new Boolean(flag);
        System.out.println(var.booleanValue());

        // В объект класса Integer помещаем значение примитива int
        // Применили обертку... до JAVA 5.0

        // После же процесс упростили - напрямую можно добавить Integer/int
        // Автоматическая упаковка
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(3);
        ints.add(4);
        System.out.println(ints.get(1));

        ArrayList<Character> coolName;

        System.out.println(var);

        // so odd! но на самом деле меняется примитив, ухищрения компилятора
        Integer z = new Integer(10);
        z++;

        /**
         * Some useful methods from Integer....etc
         */

        double d = Double.parseDouble("420.45454");
        boolean bool = Boolean.parseBoolean("true");
        //reverse that!
        System.out.println(Double.toString(d));
    }
}
