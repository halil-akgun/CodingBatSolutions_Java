package array_2;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of ints, return true if the array contains two 7's next to each other,
or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
 */
public class CB18_has77 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 7};
        System.out.println(has77(arr));
    }

    public static boolean has77(int[] nums) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7) indexes.add(i);
        }
        for (int i = 1; i < indexes.size(); i++) {
            int difference = indexes.get(i) - indexes.get(i - 1);
            if (difference == 1 || difference == 2) return true;
        }
        return false;
    }
}
