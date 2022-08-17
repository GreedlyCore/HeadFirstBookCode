package ZooOfInheritance;

/*
Абстрактный класс - это тот класс, экземпляр которого нельзя создать
Зачем нам: Animal animal = new Animal(); Кто это вообще будет?

Ссылки этого класса можно создать, но не объекты!

 */
abstract public class Animal {
    String picturePath;
    String food;
    private String name;
    int hunger;
    int boundaries;
    long location;

    public Animal( ){

    }
    public Animal( String name){
        this.name = name;
    }


    public void makeNoise(){
        System.out.println("I am animal! Hello");
    }
    public void sleep(){
        System.out.println("I am animal! SLEEEPING");
    }
    public void roam(){
        System.out.println("ok");
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

}



