package ZooOfInheritance;



public class Duck extends Animal{

    private int size;

    public Duck(){
        super(); // вызвать конструктор родителя
        this.size = 27;
    }

    public Duck(int size){
        super();
        this.size = size;
    }

    /**
     * Наличие перегруженных конструкторов означает, что в кашем классе несколько конструкторов
     * Чтобы скомпилироваться каждый конструктор должен иметь уникальный список аргументов- не имен !!!
     * Также разный порядок следования аргументов поможет создать новые конструкторы
     */

    @Override
    public void eat() {

    }

}
