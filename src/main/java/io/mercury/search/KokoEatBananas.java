package io.mercury.search;

import java.util.stream.IntStream;

public class KokoEatBananas {
    public int solutionOne(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles)
            if (pile > right) right = pile;
 
        int result = right;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            int bananasEaten = avgBananaPerHour(piles, middle);

            if (bananasEaten <= h){
                result = Math.min(right, middle);
                right = middle -1;
            }
            else
                left = middle +1;
        }
        return result;
    }

    int avgBananaPerHour(int[] piles, int bananaPerHour) {
        int hours = 0;
        for (int pile : piles)
            hours += Math.ceil((double) pile / bananaPerHour);
        return hours;
    }

    //


//        IntStream.of(piles).reduce((sum, current) -> (int) (sum + Math.ceil((double) current / bananaPerHour)));
}
