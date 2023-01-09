package basic;

public class withoutloop {
    public static void p(int a){
        if(a>=1){
            System.out.println(a);
            a--;
            p(a);
        }

    }
    public static void main(String[] args) {
        p(5);
    }
}
