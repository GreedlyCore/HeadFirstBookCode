package SeaBattleSimple.Simple;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
    private int attempts;
    private int catched;
    private boolean isFinished;

    public SimpleDotCom(){
        this.locationCells = new ArrayList<String>();
        this.attempts = 0;
        this.catched = 0;
        this.isFinished = false;
    }

    // 0 - нету корабля, 1 - есть корабль, "-1" - место уже выстрелившее
    public void doShot(String userInput){

        attempts++;
        String status = "Мимо! Осталось: "+ (3-catched);

        int index = locationCells.indexOf(userInput);

        if (index >=0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                System.out.println("Потопил!");
                isFinished = true;
                System.out.println("Игра завершена! Ваша статистика");
                System.out.println("Кол-во попыток: " + attempts);

            } else {
                status = "Попал! Осталось: "+ (3-catched);
                catched++;
            }
        }


        //status = "Уже выбирал, пробуй другую ячейку! Осталось: "+ (3-catched);

        if (!isFinished){
            System.out.println(status);
        }




    }

    public void setShip(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getHits() {
        return catched;
    }

}
