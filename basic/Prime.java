package basic;

public class Prime {
    public static void main(String[] args) {
        
        for (int n = 1; n <= 100; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if( n % i == 0){
                    count ++;
                }
            }
            if(count == 2){
                System.out.print(n + " ");
            }
        }
    }
}
