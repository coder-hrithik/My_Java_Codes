package basic;

public class strong {
    public static void main(String[] args) {
        for(int n = 1; n <= 100000; n++){
			int sum = 0;
			int temp = n;

			while(temp != 0){
				int rem = temp % 10;
				int fact = 1;
				for (int i = 1; i <= rem; i++) {
					fact = fact * i;
				}
				sum = sum + fact;
				temp /= 10;
			}
			if(sum == n){
				System.out.println(n);
			}
		}   
    }
}
