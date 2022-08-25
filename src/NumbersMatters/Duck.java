package NumbersMatters;

public class Duck {

    private int size;
    //Существует лишь одна копия статической переменной - для каждого объекта она едина
    private static int duckCount = 0;
    public static int usual;
    public static final int secretVar = -100;

    //СТАТИЧЕСКИЙ ИНИЦИАЛИЗАТОР
    final static  int x;
    final static  double PI_CONST;
    final static  double BAR_SIGN;
    //Этот код "статик" запустится сразу после загрузки класса перед вызовом
    //Создается статический блок самым первым, даже перед конструктором!!1
    static {
        PI_CONST = 3.14;
        x = 0;
        BAR_SIGN = (double) Math.random();
        final double WHAT = -434.2323f;
    }


    public Duck(){
        duckCount++;
        System.out.println(usual);
        //при создании новых уток общий счетчик будет увеличиваться
    }
    public final void doStuff(){
        System.out.println("you cant change me");
        System.out.println("you cant OVERDRIVE ME ");
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

final class LastManStanding{

    final public void lastWord(){
        System.out.println("I am the one left");
    }
    // Если класс уже "финализирован", то нету смысла все методы финализировать
    // Ведь класс не наследуется, а значит и методы не переопределяются
    public void lastMeal(){
        System.out.println("I am the one left");
    }
}
