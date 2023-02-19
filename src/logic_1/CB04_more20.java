package logic_1;

/*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

more20(20) → false
more20(21) → true
more20(22) → true
 */
public class CB04_more20 {
    public static void main(String[] args) {
        System.out.println(more20(23));
    }

    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }
}
