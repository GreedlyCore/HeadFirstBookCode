package NumbersMatters;

public class CoolModule {
    int size = 10;
    double cash = 10.3042;
    private static final float PI = 3.14159f;


    public static void doStuff(){

        System.out.println(PI + 1);
        //System.out.println(size + 1); // no!
    }

    public static void main(String[] args) {
        CoolModule coolModule = new CoolModule();
        CoolModule.doStuff();
    }
}
