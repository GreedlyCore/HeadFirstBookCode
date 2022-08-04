package SeaBattleSimple.Complicated;

public class Ship {

    private String name;
    private int length;
    private int cost; // how much points for destruction?
    private String[] locations;
    

    // also add ограниченное кол-во ходов и суммарное колво очков за сбитые корабли / их куски
    // Два поля, где робот твои корабли атакует и ты их сам выставляешь!!
    // Два поля, где робот твои корабли атакует и ты их сам выставляешь!!
    //

    // static final String[] shipNames = {"Google","Amazon","Apple", "Starbucks","Yandex","DeliveryCLub","Meta"};

    public void setName(String name) {
        this.name = name;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public int getLength() {
        return length;
    }

    public Ship(){
    //
    }
}
