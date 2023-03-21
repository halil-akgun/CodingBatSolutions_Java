package map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */
public class CB05_firstChar {
    public static void main(String[] args) {
        String[] arr = {"salt", "tea", "soda", "toast"};
        System.out.println(firstChar(arr));
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String w : strings) {
            map.put(String.valueOf(w.charAt(0)), map.getOrDefault(String.valueOf(w.charAt(0)), "") + w);
        }
        return map;
    }
}
