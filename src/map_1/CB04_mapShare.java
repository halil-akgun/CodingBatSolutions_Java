package map_1;

import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class CB04_mapShare {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");
        System.out.println(mapShare(map));
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        String a = map.getOrDefault("a", "notFound");
        String b = map.getOrDefault("b", "notFound");
        String c = map.getOrDefault("c", "notFound");
        if (!a.equals("notFound") && !b.equals("notFound")) map.replace("b", map.get("a"));
        if (!a.equals("notFound") && b.equals("notFound")) map.put("b", map.get("a"));
        if (!c.equals("notFound")) map.remove("c");
        return map;
    }
}
