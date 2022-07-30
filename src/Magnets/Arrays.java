package Magnets;

public class Arrays {
    public static void main(String[] args) {

        int y = 0;
        String [] islands = {"Бермуды","Фиджи","Азорские острова","Косумель"};

        int [] index = {1,3,0,2};



        int ref;

        while (y < 4){
            ref = index[y];
            System.out.println(islands[ref]);

            y++;
        }

    }
}
