package SeaBattleSimple.Complicated;

import java.util.ArrayList;

public class DotCom {

    private int attempts;
    private int hitsCounter;
    private boolean isFinished;
    private ArrayList<Ship> ships = new ArrayList<Ship>();

    public DotCom(){
        this.attempts = 0;
        this.hitsCounter = 0;
        this.isFinished = false;
    }

    public void setupGame(){
        
        

        Ship one = new Ship();
        one.setName("Pets.com");
        Ship two = new Ship();
        two.setName("Google.com");
        Ship three = new Ship();
        three.setName("Amazon.ru");
        ships.add(one);
        ships.add(two);
        ships.add(three);

        System.out.println("Ваша цель - потопить три сайта....");
        for (Ship elem : ships) {
            System.out.println(elem.getName());
        }
        System.out.println("За меньшее число попыток! Удачи");

    }

    public void startGame(){
        while (!ships.isEmpty()){
            try {
                String userGuess = GameHelper.getUserInput();
                checkUserGuess(userGuess);
            } catch (Exception e) {
                System.out.println("IOexception " + e);
            }
            
            
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess){
        this.attempts++;
        String result = "Мимо..";
        for (Ship ship : ships) {
            //ship.getLocation()
            
        }

    }

    public void finishGame(){

    }




}
