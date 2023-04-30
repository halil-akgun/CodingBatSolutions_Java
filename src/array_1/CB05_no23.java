package array_1;

/*
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */
public class CB05_no23 {
    public static void main(String[] args) {
        int[] a = {1, 5};
        System.out.println(no23(a));
    }

    public static boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) return false;
        }
        return true;
    }
}
