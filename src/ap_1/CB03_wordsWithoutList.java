package ap_1;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of
the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
 */
public class CB03_wordsWithoutList {
    public static void main(String[] args) {
        String[] arr = {"a", "bb", "b", "ccc"};
        System.out.println(wordsWithoutList(arr, 1));
    }

    public static List<String> wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) list.add(word);
        }
        return list;
    }
}
