package logic_2;

/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is
"far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 */
public class CB08_closeFar {
    public static void main(String[] args) {
        System.out.println(closeFar(4, 1, 3));
    }

    public static boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) < 2 && Math.abs(c - a) > 1 && Math.abs(c - b) > 1) return true;
        return Math.abs(c - a) < 2 && Math.abs(b - a) > 1 && Math.abs(b - c) > 1;
    }
}
