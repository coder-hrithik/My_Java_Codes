package collections;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();
        a.add(4);
        a.add(1, "Hello");
        a.add("Bye");
        ArrayList<Object> b = new ArrayList<>();
        b.addAll(a);
        b.add("Added");
        b.remove(1);
        // for loop
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        // for each loop
        for (Object obj : a) {
            System.out.println(obj);
        }
        // Iterator
        Iterator<Object> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        // ListIterator
        ListIterator<Object> l = a.listIterator();
        while (l.hasNext()) {
            System.out.println(l.next());
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.size());
        System.out.println(a.contains(4));
        System.out.println(b.containsAll(a));
        System.out.println(a.get(2));

    }
}
