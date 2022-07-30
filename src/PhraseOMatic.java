public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный","трехзвенный","30000-футовый","взаимный","фронтэнд"};
        String[] wordListTwo = {"уполномоченный","трудный","сетевой","выровненный","общий"};
        String[] wordListThree = {"процесс","пункт разгрузки","выход из положения","портал","обзор"};

        int oneLen = wordListOne.length;
        int twoLen = wordListTwo.length;
        int threeLen = wordListThree.length;

        int rand1 =  (int) (Math.random() * oneLen);
        int rand2 =  (int) (Math.random() * twoLen);
        int rand3 =  (int) (Math.random() * threeLen);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(phrase);
    }
}
