package Magnets;

import java.util.*;

public class ArrayListMagnet{


    public static void printAL(ArrayList<String> al) {

        // only print way look at name
    }

    public static void main(String[] args) {

    ArrayList<String> b = new ArrayList<String>(); 
    printAL(b);

    ArrayList<String> a = new ArrayList<String>();
        
        //a.remove(2);
        a.add(0, "ноль");
        a.add(1, "один");
        a.add(1, "один_new");
        for (String element: a){
            System.out.println(element);
        }
        
    }
}