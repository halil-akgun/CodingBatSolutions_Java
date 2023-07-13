package ap_1;

import java.util.Arrays;

/*
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
 */
public class CB16_wordsFront {
    public static void main(String[] args) {
        String[] arr = {"b", "f", "z"};
        System.out.println(Arrays.toString(wordsFront(arr, 2)));
    }

    public static String[] wordsFront(String[] words, int n) {
        String[] ans = new String[n];
        System.arraycopy(words, 0, ans, 0, ans.length);
        return ans;

//        for primitive codingbat: (not accepting static method)
//        String[] ans = new String[n];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = words[i];
//        }
//        return ans;
    }
}
