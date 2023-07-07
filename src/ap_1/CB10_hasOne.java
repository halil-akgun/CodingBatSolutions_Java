package ap_1;

/*
Given a positive int n, return true if it contains a 1 digit.
Note: use % to get the rightmost digit, and / to discard the rightmost digit.

hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
 */
public class CB10_hasOne {
    public static void main(String[] args) {
        System.out.println(hasOne(10));
    }

    public static boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) return true;
            n /= 10;
        }
        return false;
    }
}
