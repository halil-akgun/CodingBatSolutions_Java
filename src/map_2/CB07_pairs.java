package map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of non-empty strings, create and return a Map<String, String> as follows:
for each string add its first character as a key with its last character as the value.

pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */
public class CB07_pairs {
    public static void main(String[] args) {
        String[] arr = {"code", "bug"};
        System.out.println(pairs(arr));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String w : strings) {
            map.put(w.substring(0, 1), w.substring(w.length() - 1));
        }
        return map;
    }
}
