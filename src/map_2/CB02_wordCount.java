package map_2;

import java.util.HashMap;
import java.util.Map;

/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key
for each different string, with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class CB02_wordCount {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(arr));
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : strings) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        return map;
    }
}
