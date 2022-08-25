package NumbersMatters;

import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportCheck {

    public static void main(String[] args) {
        out.println("This is much shorter!");

        out.println("sqrt is " + sqrt(2.0));
        out.println("sqrt is " + sqrt(4.0));

        out.println("tan is " + tan(60));
        out.println("tan is " + tan(60.454f));


    }
}
