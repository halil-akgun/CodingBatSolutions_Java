package map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
and the value is that string's length.

wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
 */
public class CB04_wordLen {
    public static void main(String[] args) {
        String[] arr = {"a", "aa", "b", "bb"};
        System.out.println(wordLen(arr));
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : strings) {
            map.put(w, w.length());
        }
        return map;
    }
}
