package ZooOfInheritance;

public class MakeHippo {
    public static void main(String[] args) {
        Hippo h = new Hippo("Baffet");
        System.out.println(h.getName());

        Hippo H = new Hippo();
        System.out.println(H.getName());
    }
}
