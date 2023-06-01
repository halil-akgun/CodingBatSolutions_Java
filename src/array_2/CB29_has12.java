package array_2;

/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */
public class CB29_has12 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        System.out.println(has12(arr));
    }

    public static boolean has12(int[] nums) {
        boolean has1 = false;
        for (int num : nums) {
            if (!has1) {
                if (num == 1) has1 = true;
            } else if (num == 2) return true;
        }
        return false;
    }
}
