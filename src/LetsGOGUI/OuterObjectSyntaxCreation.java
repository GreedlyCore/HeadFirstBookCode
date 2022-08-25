package LetsGOGUI;

public class OuterObjectSyntaxCreation {

    public static void main(String[] args) {

        var outer = new MyOuter();
        MyOuter.MyInner inner =  outer.new MyInner();

    }
}
