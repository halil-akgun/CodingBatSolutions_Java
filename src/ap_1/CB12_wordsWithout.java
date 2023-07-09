package ap_1;

import java.util.Arrays;

/*
Given an array of strings, return a new array without the strings that are equal
to the target string. One approach is to count the occurrences of the target string,
make a new array of the correct length, and then copy over the correct strings.

wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 */
public class CB12_wordsWithout {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "a"};
        System.out.println(Arrays.toString(wordsWithout(arr, "a")));
    }

    public static String[] wordsWithout(String[] words, String target) {
        return Arrays.stream(words).filter(t -> !t.equals(target)).toArray(String[]::new);
    }
}
