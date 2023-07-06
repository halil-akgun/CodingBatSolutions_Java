package ap_1;

import java.util.Arrays;

/*
Given an array of strings, return the count of the number of strings with the given length.

wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0
 */
public class CB09_wordsCount {
    public static void main(String[] args) {
        String[] arr = {"a", "bb", "b", "ccc"};
        System.out.println(wordsCount(arr, 3));
    }

    public static int wordsCount(String[] words, int len) {
        return (int) Arrays.stream(words).filter(t -> t.length() == len).count();
    }
}
