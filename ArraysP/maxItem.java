package ArraysP;

public class maxItem {
    public static void main(String[] args) {
        int[] a= {1, 3, 2, 4, 6,};
        System.out.print("Max is: " + max(a));
    }
    static int max(int[] a){

        int maxval=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > maxval){
                maxval = a[i];
            }
        }
        return maxval;
    }
}
