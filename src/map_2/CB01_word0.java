package map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later,
but for this problem the value is simply 0.

word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
 */
public class CB01_word0 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "b"};
        System.out.println(word0(arr));
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : strings) {
            map.put(w, 0);
        }
        return map;
    }
}
