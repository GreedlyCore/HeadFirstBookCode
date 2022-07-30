package SeaBattleSimple;

import java.util.Random;
import java.util.Scanner;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        int length = 8;
        SimpleDotCom game = new SimpleDotCom();
        Random rand = new Random();

        int num = rand.nextInt(length-1);
        int [] ship = {num, num+1, num+2};
        game.setShip(ship);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Старт игры!-----");
        while (!game.isFinished()){
            boolean flag = false;

            while (!flag){
                System.out.println("Введи позицию от 0 до " + (length-1) );
                try{
                    int pos = Integer.parseInt(scanner.nextLine());
                    flag = true;
                    game.doShot(pos);
                } catch (Exception e){
                    System.out.println("Неверный формат данных, попробуй еще раз");
                }
            }



        }
    }


}
