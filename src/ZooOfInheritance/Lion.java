package ZooOfInheritance;

public class Lion extends Feline{

    @Override
    public void makeNoise() {
        System.out.println("Lion's there! ");
    }

    @Override
    public void eat() {

    }
    @Override
    public void roam(){
        super.roam();
        super.walking();
        System.out.println(super.boundaries);
        System.out.println(123);
    }
}
