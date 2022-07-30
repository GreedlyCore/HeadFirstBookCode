package SeaBattleSimple;

public class SimpleDotCom {
    private int [] locationCells;
    private int attempts;
    private int catched;
    private boolean isFinished;

    public SimpleDotCom(){
        this.locationCells = new int[3];
        this.attempts = 0;
        this.catched = 0;
        this.isFinished = false;
    }

    // 0 - нету корабля, 1 - есть корабль, "-1" - место уже выстрелившее
    public String doShot(int chosen){

        attempts++;
        String status = "Мимо! Осталось: "+ (3-catched);

        for (int i = 0; i < locationCells.length; i++) {
            int cell = locationCells[i];

            if (cell == chosen){
                catched++;
                locationCells[i] = -cell; // убираем следы
                status = "Попал! Осталось: "+ (3-catched);

                break;

            } else if (-cell == chosen){
                status = "Уже выбирал, пробуй другую ячейку! Осталось: "+ (3-catched);
                break;

            }

        }
        if (catched == 3){
            isFinished = true;
            System.out.println("Потопил!");
            System.out.println("Игра завершена! Ваша статистика");
            System.out.println("Кол-во попыток: " + attempts);
        }else{
            System.out.println(status);
        }

        return status;

    }

    public void setShip(int[] locationCells) {
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
