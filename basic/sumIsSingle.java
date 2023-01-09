package basic;

public class sumIsSingle {
    public static void main(String[] args) {
        int n = 5555;
        int sum = 0;
        while(n != 0 || sum > 9){
            if(n == 0){
                n = sum;
                sum = 0;
            }

            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println(sum);
    }
}
