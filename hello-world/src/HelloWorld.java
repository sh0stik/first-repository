import java.util.StringJoiner;

public class HelloWorld {
    public static void main(String[] args) {

        int[] x = new int[5];
        int i;
        for (i = 0; i < x.length; i++)
            x[i] = i;
        System.out.println(x[i]);

    }
}
class Jump_statments {
    public static void main(String args[]) {
        StringJoiner sj1 = new StringJoiner(":", "{", "}");
        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj1.add("Name").add("Tony");
        sj2.add("LastName").add("Strak");
        System.out.println(sj1.merge(sj2).toString());

    }
}
class A {

    void ETL() {
        String E = "mySQL";
        String T = "Sqoop";
        String L = "hdfs";
        System.out.println(E + T + L);
    };

    void ETL(String ETL) {
        System.out.println(ETL.toUpperCase());
    }
    void ETL(String E, String T, String L) {
        System.out.println(E + T + L);
    }
}

 class Main {

    public static void main(String args[]) {
        Mineral m = new Diamond();
    }
}
abstract class Mineral {
    // define abstract methods for origin, hardness and appearance.
}
class Diamond extends Mineral {
    // implement origin, hardness and appearance methods.
}