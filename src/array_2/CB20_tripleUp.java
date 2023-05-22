package array_2;

/*
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
 */
public class CB20_tripleUp {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 2};
        System.out.println(tripleUp(arr));
    }

    public static boolean tripleUp(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] + 1 == nums[i] && nums[i] == nums[i + 1] - 1) return true;
        }
        return false;
    }
}
