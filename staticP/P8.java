package staticP;

public class P8 {
    static int i = test();
    static int j = test() + test2();

    public static void main(String[] args) {
        System.out.println("Main Begins");
        System.out.println(i);
        System.out.println(j);
        System.out.println("Main ends");
    }

    public static int test() {
        System.out.println("Test1 begins");
        System.out.println(i);
        System.out.println(j);
        return 20;
    }

    public static int test2() {
        System.out.println("Test2 begings");
        System.out.println(i);
        System.out.println(j);
        return (10 + test());
    }
}
