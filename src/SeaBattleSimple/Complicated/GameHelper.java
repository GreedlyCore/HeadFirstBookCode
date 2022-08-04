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


    public static String getUserInput() throws IOException{
        String userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine().toLowerCase();
        scanner.close();
        return userInput;
        
        
    }

    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String[comSize];
        String temp = null;
        int [] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        //int locations = 0;

        comCount++;
        int incr = 1;

        if ( comCount % 2 == 1){
            incr = gridLength;
        }

        while (!success & attempts++ < 200){
            int location = (int) (Math.random() * gridSize);
            System.out.println("пробуем "+ location);
            int x = 0;
            success = true;
            while ( success && x < comSize){
                if ( grid[location] == 0) {
                  coords[x++] = location;
                  location += incr;

                  if (location >= gridSize){
                    success = false;
                  }  
                  if ( x>0 && (location % gridLength ==0)){
                    success = false;
                  }
                } else {
                    System.out.println("используется "+ location);
                    success = false;
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;
        while (x < comSize) {
            grid[coords[x]] = 1;
            row = (int) (coords[x] /gridLength);
            column = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            //System.out.println("  cords" + "x" + alphaCells.get(x-1));
    
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
