package logic_2;

/*
We want to make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */
public class CB09_makeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(6, 2, 7));
    }

    public static int makeChocolate(int small, int big, int goal) {
        if (goal < 5 && small <= goal) return goal;
        int sum = (big * 5 <= goal) ? big * 5 : 5;
        if (sum == goal) return 0;
        for (int j = 1; j <= small; j++) {
            sum += 1;
            if (sum == goal) return j;
        }
        return -1;
    }
}
