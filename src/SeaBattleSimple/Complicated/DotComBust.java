package SeaBattleSimple.Complicated;

import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;


    private void  setupGame(){

        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("Google.com");
        DotCom three = new DotCom();
        three.setName("Amazon.com");

        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Наша цель - потопить три сайта");
        System.out.println("..............................");
        System.out.println("Постарайся сделать это за мин кол-во ходов");

        for (DotCom dotComToSet: dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }

    }

    private void startPlaying(){

        while (!dotComList.isEmpty()){
            String userGuess = GameHelper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }

    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо...!";

        for (DotCom dotComToTest:
             dotComList){
            result = null;//dotComToTest.checkYourself(userGuess);

            if ( result.equals("Попал!") ){
                break;
            } else if (result.equals("Потопил!")){
                dotComList.remove(dotComToTest); // корабль умер
                break;
            }
            
        }


    }
}
