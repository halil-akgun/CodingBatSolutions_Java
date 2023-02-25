package logic_1;

/*
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
 */
public class CB12_sortaSum {
    public static void main(String[] args) {
        System.out.println(sortaSum(9, 4));
    }

    public static int sortaSum(int a, int b) {
        return (a + b > 9 && a + b < 20) ? 20 : a + b;
    }
}
