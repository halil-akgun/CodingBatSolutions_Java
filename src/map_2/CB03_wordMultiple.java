package map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and
its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */
public class CB03_wordMultiple {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(arr));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String w : strings) {
            if (map.containsKey(w)) {
                map.put(w, true);
                continue;
            }
            map.put(w, false);
        }
        return map;
    }
}
