package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);

        System.out.println(bcandles(candles));
    }

    public static int bcandles(List<Integer> candles) {
        int tall = 0;
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > tall) {
                count = 1;
                tall = candles.get(i);
            } else if (candles.get(i) == tall) {
                count++;
            }
        }
        return count;
    }
}
