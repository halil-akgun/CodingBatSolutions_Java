package logic_1;

/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 */
public class CB18_lessBy10 {
    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 10));
    }

    public static boolean lessBy10(int a, int b, int c) {
        return Math.abs(b - c) > 9 || Math.abs(a - b) > 9 || Math.abs(a - c) > 9;
    }
}
