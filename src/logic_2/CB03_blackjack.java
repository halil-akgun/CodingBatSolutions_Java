package logic_2;

/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */
public class CB03_blackjack {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
    }

    public static int blackjack(int a, int b) {
        int[] arr = {a, b};
        int x = 0;
        for (int j : arr) {
            if (j > 0 && j <= 21) x = Math.max(x, j);
        }
        return x;
    }
}
