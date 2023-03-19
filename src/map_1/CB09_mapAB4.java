package map_1;

import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set
"c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */
public class CB09_mapAB4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        System.out.println(mapAB4(map));
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        String a = map.getOrDefault("a", "null");
        String b = map.getOrDefault("b", "null");
        if (!a.equals("null") && !b.equals("null")) {
            if (a.length() == b.length()) {
                map.put("a", "");
                map.put("b", "");
            } else map.put("c", a.length() > b.length() ? map.get("a") : map.get("b"));
        }
        return map;
    }
}
