package Books;

public class Dog {

    private String name;

    public void bark(){
        System.out.println("Woof!");
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void chaseCat(){
        System.out.println("I am chasing cat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
