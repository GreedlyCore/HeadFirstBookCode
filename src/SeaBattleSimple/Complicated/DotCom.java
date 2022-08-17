package SeaBattleSimple.Complicated;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells = new ArrayList<String>();
    private String name;

    public DotCom(){

    }

    public void setLocationCells(ArrayList<String> loc){
        this.locationCells = loc;
    }

    public void setName(String name){
        this.name = name;
    }




    public String  checkUserGuess(String userGuess){
        //this.attempts++;
        String result = "Мимо...!";
        int index = locationCells.indexOf(userGuess);

        if (index >= 0){
            locationCells.remove(index);
        }
        if ( locationCells.isEmpty() ){
            result = "Ух ты! Потопил...";
            System.out.println("Ой! Кажись, вы потопили " + this.name);
        } else{
            result = "Попал!";
        }
        return result;
    }






}
