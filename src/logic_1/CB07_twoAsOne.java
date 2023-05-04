package logic_1;

/*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
 */
public class CB07_twoAsOne {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
    }

    public static boolean twoAsOne(int a, int b, int c) {
//        if (a + b == c) return true;
//        if (a + c == b) return true;
//        return c + b == a;

        return a + b == c || a + c == b || c + b == a;
    }
}
