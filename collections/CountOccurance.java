package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class CountOccurance {

    public static void main(String[] args) {
        String s = "ababcd";
        getCount(s);
    }

    private static void getCount(String s) {

        Map<Character, Integer> h = new HashMap<Character, Integer>();

        char[] c = s.toCharArray();
        for (char x : c) {
            if (x != ' ') {
                if (h.containsKey(x)) {
                    h.put(x, h.get(x) + 1);
                } else {
                    h.put(x, 1);
                }
            }
        }

        Set<Map.Entry<Character, Integer>> set = h.entrySet();

        for (Map.Entry<Character, Integer> data : set) {
            if (data.getValue() == 1) {
                System.out.print(data.getKey() + " ");
            }
        }
    }
}
