package array_2;

/*
Return the sum of the numbers in the array, except ignore sections of numbers starting with
a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
 */
public class CB14_sum67 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(arr));
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        int temp = 0;
        boolean is6 = false;
        for (int num : nums) {
            if (num == 6 || is6) {
                is6 = true;
                temp += num;
                if (num == 7) {
                    temp = 0;
                    is6 = false;
                }
            } else sum += num;
        }
        sum += temp;
        return sum;
    }
}
