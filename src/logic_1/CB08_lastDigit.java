package logic_1;

/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true

 */
public class CB08_lastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13));
    }

    public static boolean lastDigit(int a, int b, int c) {
        if (a % 10 == b % 10) return true;
        if (a % 10 == c % 10) return true;
        return c % 10 == b % 10;
    }
}
