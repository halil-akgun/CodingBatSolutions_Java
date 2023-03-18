package map_1;

import java.util.HashMap;
import java.util.Map;

/*
Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has
a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */
public class CB05_topping2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("spinach", "dirt");
        map.put("ice cream", "cherry");
        System.out.println(topping2(map));
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream") && map.get("ice cream") != null) map.put("yogurt", map.get("ice cream"));
        if (map.containsKey("spinach") && map.get("spinach") != null) map.replace("spinach", "nuts");
        return map;
    }
}
