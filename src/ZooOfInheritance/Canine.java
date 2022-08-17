package ZooOfInheritance;
//Псовые
public abstract class Canine extends Animal{
    public void roam(){
        System.out.println("woof! i am roaming");
    }



}
class  MakeCanine{
    public void go(){
        Canine c;
        c = new Dog();
        //c = new Canine();
        c.roam();
    }
}
