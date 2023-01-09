package Tutorial;

public class largest {
    public static void main(String[] args) {
        int c= large(10,20);
        System.out.println(c);

        int d=large(10,30,30);
        System.out.println(d);

        int e=large(10,20,40,40);
        System.out.println(e);
    }
    public static int large(int a, int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int large(int a, int b, int c){
        if (a>b && a>c){
            return a;
        }
        else if (b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static int large(int a, int b, int c,int d){
        if (a>b && a>c && a>d){
            return a;
        }
        else if (b>a && b>c && b>d){
            return b;
        }
        else if (c>b && c>d){
            return c;
        }
        else{
            return d;
        }
    }
}
