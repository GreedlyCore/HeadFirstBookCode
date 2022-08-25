package NumbersMatters;

public class TestBoxPrimitives {

    Integer i = 10; // нужно объявить!!!!!!
    int j;

    public void go(){
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String[] args) {
        TestBoxPrimitives test = new TestBoxPrimitives();
        test.go();
    }
}
