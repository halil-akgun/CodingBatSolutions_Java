package recursion_2;

/*
Given an array of ints, is it possible to choose a group of some of the ints,
such that the group sums to the given target with these additional constraints:
all multiples of 5 in the array must be included in the group. If the value immediately
following a multiple of 5 is 1, it must not be chosen. (No loops needed.)

groupSum5(0, [2, 5, 10, 4], 19) → true
groupSum5(0, [2, 5, 10, 4], 17) → true
groupSum5(0, [2, 5, 10, 4], 12) → false
 */
public class CB02_groupSum5 {
    public static void main(String[] args) {
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 17));
    }

    public static boolean groupSum5(int start, int[] nums, int target) {

        if (start >= nums.length) return target == 0;

        if (start == 0) {
            if (groupSum5(start + 1, nums, target - nums[start])) return true;
        } else {
            if (!(nums[start - 1] == 5 && nums[start] == 1) && groupSum5(start + 1, nums, target - nums[start]))
                return true;
        }

        return (nums[start] % 5) != 0 && groupSum5(start + 1, nums, target);

        // chatGPT:
        /*
        if (start >= nums.length) {
            return target == 0;
        }

        // Eğer mevcut eleman 5'in katı ise, mutlaka bu elemanı almalıyız.
        if (nums[start] % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        // Eğer mevcut eleman bir önceki eleman 5 ve bu eleman 1 ise, bu elemanı atlayarak devam etmeliyiz.
        else if (start > 0 && nums[start - 1] == 5 && nums[start] == 1) {
            return groupSum5(start + 1, nums, target);
        }
        // Diğer durumlarda, bu elemanı ya almalı ya da almamalıyız ve her iki durumu kontrol etmeliyiz.
        else {
            return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
        }
        * */
    }
}
