package Strings;
// Display string array in lexographical
public class DecAlph {
    public static void main(String[] args) {
        String[] a = { "goa", "manali", "sikkim", "andaman", "maldives"};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i].compareTo(a[j]) > 0){
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
