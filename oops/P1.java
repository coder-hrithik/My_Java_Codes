package oops;

public class P1 {
    public static void main(String[] args) {
        byte[] a = {65,66,67,68,69,70};
        byte[] b = {71,72,73,74,75,76};

        System.arraycopy(a,2,b,1,a.length-2);
        System.out.println(new String(a) + " " + new String(b));
    }
}