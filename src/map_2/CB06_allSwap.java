package map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and
then return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything.
Using a map, this can be solved making just one pass over the array. More difficult than it looks.

allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */
public class CB06_allSwap {
    public static void main(String[] args) {
        String[] arr = {"ax", "bx", "cx", "ay", "cy", "aaa", "abb"};
        System.out.println(Arrays.toString(allSwap(arr)));
    }

    public static String[] allSwap(String[] strings) {
        Map<Integer, String> map = new HashMap<>();
        boolean isAdded;
        for (int i = 0; i < strings.length; i++) {
            isAdded = false;
            if (map.containsKey(i)) continue;
            for (int j = i + 1; j < strings.length; j++) {
                if (map.containsKey(j)) continue;
                if (strings[i].charAt(0) == strings[j].charAt(0)) {
                    map.put(i, strings[j]);
                    map.put(j, strings[i]);
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) {
                map.put(i, strings[i]);
            }
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = map.get(i);
        }
        return strings;
    }
}
