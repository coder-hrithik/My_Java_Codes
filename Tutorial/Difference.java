package Tutorial;

public class Difference {
    public static void main(String[] args) {
        int[] a = { 1, 3, 3, 55 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int avg = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] != max && a[i] != min){
                count++;
                avg += a[i];
            }
        }
        System.out.println(avg /count);


    }
}
