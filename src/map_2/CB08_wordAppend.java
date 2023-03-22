package map_2;

import java.util.HashMap;
import java.util.Map;

/*
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc.
time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
 */
public class CB08_wordAppend {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a"};
        System.out.println(wordAppend(arr));
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String w : strings) {
            map.put(w, map.getOrDefault(w, 0) + 1);
            if (map.get(w) % 2 == 0) result.append(w);
        }
        return result.toString();
    }
}
