package collections;

import java.util.*;

public class multidArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Object>> a = new ArrayList<>();
        // intitialisation
        for (int i = 0; i < 3; i++) {
            a.add(new ArrayList<>());
        }
        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a.get(i).add(sc.nextInt());
            }
        }
        System.out.println(a);
        sc.close();
    }
}
