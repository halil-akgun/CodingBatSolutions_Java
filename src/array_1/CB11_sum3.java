package array_1;

/*
Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 */
public class CB11_sum3 {
    public static void main(String[] args) {
        int[] arr = {5, 11, 2};
        System.out.println(sum3(arr));
    }

    public static int sum3(int[] nums) {
        int sum = 0;
        for (int w : nums) {
            sum += w;
        }
        return sum;
    }
}
