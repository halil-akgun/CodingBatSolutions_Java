package map_1;

import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
If both keys are present, append their 2 string values together and store the result under the key "ab".

mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */
public class CB07_mapAB {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        System.out.println(mapAB(map));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        String a = map.getOrDefault("a", "NotFound");
        String b = map.getOrDefault("b", "NotFound");
        if (!a.equals("NotFound") && !b.equals("NotFound")) map.put("ab", map.get("a") + map.get("b"));
        return map;
    }
}
