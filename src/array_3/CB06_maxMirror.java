package array_3;

/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1}
is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
 */
public class CB06_maxMirror {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};
        System.out.println(maxMirror(arr));
    }

    public static int maxMirror(int[] nums) {
        StringBuilder reversed = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) reversed.append(nums[i]).append(",");
        StringBuilder temp = new StringBuilder();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                for (int k = i; k <= j; k++) temp.append(nums[k]).append(",");
                if (reversed.toString().contains(temp.toString())) {
                    temp = new StringBuilder(temp.toString().replaceAll("[^,]", ""));
                    max = Math.max(max, temp.length());
                }
                temp.delete(0, temp.length());
            }
        }
        return max;
    }
}
