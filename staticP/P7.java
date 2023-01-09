package staticP;

public class P7 {
    static int i = test();
    public static void main(String[] args) {
        System.out.println("Main begins");
        System.out.println(P7.i);
        test();
    }
    public static int test()
{
    System.out.println("test begins");
    System.out.println(P7.i);
    return 25;
}
}
