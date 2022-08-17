package SeaBattleSimple.Complicated;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;


    public static String getUserInput(String input) {
        System.out.println(input);
        String userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine().toLowerCase();
        scanner.close();
        return userInput;
        
        
    }

    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String[comSize]; // для координат CHAR+NUMBER aka F6
        String temp = null; // пустая строка для конкатенации
        int [] coords = new int[comSize]; // кооры текущего сайта
        int attempts = 0;  // счетчик текущих попыток ?
        boolean success = false; // нашли подходящее местоположение?
        int location = 0; // текущие начальное положение?

        comCount++; // N-ый сайт для размещения
        int incr = 1;  // устанавливаем горизонтальный инкремент

        if ( comCount % 2 == 1){ // для вертикального - буква одна и та же
            incr = gridLength;      // для горизонтального - цифра одна и та же
        }

        while ( !success & (attempts++ < 200 ) ){
            location = (int) (Math.random() * gridSize); // так как 49 ячеек максимум
            System.out.println("пробуем "+ location);
            int x = 0;
            success = true;

            // comSize - размер корабля!
            while ( success && ( x < comSize ) ){
                if ( grid[location] == 0) {  // не занята!
                  coords[x++] = location; // добавляем новые координаты в массив для них, после инкеремент для икс
                  location += incr; // переходим на след ячейку по вертикали/горизонтали

                  if (location >= gridSize){ // вышли за рамки? плохо
                    success = false;
                  }  
                  if ( x>0 && (location % gridLength ==0)){ /// правй край, что ха?
                    success = false;
                  }
                } else {
                    System.out.println("используется "+ location);
                    success = false;
                }
            }
        }
        // Переводим числа в символьные координаты!
        int x = 0;
        int row = 0;
        int column = 0;
        System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;  // использованные ячейки!
            row = coords[x] / gridLength; // строка значение
            column = coords[x] % gridLength; // столбец
            temp = String.valueOf(alphabet.charAt(column)).toUpperCase(); // в символ
            alphaCells.add(temp.concat(Integer.toString(row))); // к temp соединили
            x++;
            System.out.println("  cords" + " x " + alphaCells.get(x-1));
    
        }
        //System.out.println("/n");
        return alphaCells;

    }

    public static String[] generateLocations(int length){
        // ABCDEFGH 12345678
        String[] result = new String[length];
        Random r = new Random();
        String x = "ABCDEFGH";
        String y = "12345678";
        char xcor = x.charAt(r.nextInt(x.length()));
        char ycor =  y.charAt(r.nextInt(y.length()));
        //if (x != )
        result[0] = x+y;
        result[1] = x+ String.valueOf(Integer.parseInt(y)+1)  ;
        result[2] = x+ String.valueOf(Integer.parseInt(y)+2)  ;
        return result;


        
        

        
    }

}
