package Jsp;
// All armstrong numbers in between 1 - 10000
// to find missing numer in the array from 1-10
public class AllArmstrong {
    public static void main(String[] args) {
        for (int n = 1; n <= 10000; n++) {
            int temp = n;
            int sum = 0;
            int count = countDigit(temp);

            while(temp != 0){
                int d = temp % 10;
                sum = sum + pow(d,count);
                n /= 10;
            }
            if(n == sum){
                System.out.print(n + " ");
            }
        }

    }
    public static int pow(int d, int p){
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * d;
        }
        return res;
    }
    public static int countDigit(int temp){
        int count = 0;
        while(temp != 0){
            count ++;
            temp /= 10;
        }
        return count;
    }
}
