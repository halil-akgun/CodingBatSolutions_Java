package logic_2;

/*
Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum
and values to its right do not count. So for example, if b is 13, then both b and c do not count.

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
 */
public class CB07_luckySum {
    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
    }

    public static int luckySum(int a, int b, int c) {
        int[] arr = {a, b, c};
        int sum = 0;
        for (int w : arr) {
            if (w == 13) break;
            sum += w;
        }
        return sum;
    }
}
