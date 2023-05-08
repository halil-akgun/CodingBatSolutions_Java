package array_2;

/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([9, 7, 2, 9, 2, 2]) → false
modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
modThree([1, 2, 1, 2, 1]) → false
 */
public class CB07_modThree {
    public static void main(String[] args) {
        int[] arr = {9, 7, 2, 9, 4, 2, 2};
        System.out.println(modThree(arr));
    }

    public static boolean modThree(int[] nums) {
        int amountOfOdd = 0;
        int amountOfEven = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                amountOfOdd = 0;
                if (++amountOfEven == 3) return true;
            } else {
                amountOfEven = 0;
                if (++amountOfOdd == 3) return true;
            }
        }
        return false;
    }
}
