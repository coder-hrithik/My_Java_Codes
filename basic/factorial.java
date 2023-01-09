package basic;
public class factorial {
    public static void main(String[] args) {
        
        for (int i = 5; i <= 10; i++) {
            int fact = 1;
            for (int j = 1; j < i; j++) {
                fact = fact * j;
            }
            System.out.println("Factorial of " + i +" is: " + fact);
            System.out.println();
        }
    }
}
