package map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return
the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings
in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are
disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.

firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
 */
public class CB09_firstSwap {
    public static void main(String[] args) {
        String[] arr = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(Arrays.toString(firstSwap(arr)));
    }

    public static String[] firstSwap(String[] strings) {
        Map<Integer, String> map = new HashMap<>();
        StringBuilder swapped = new StringBuilder();
        boolean isAdded;
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(i)) continue;
            isAdded = false;
            for (int j = i + 1; j < strings.length; j++) {
                if (map.containsKey(j)) continue;
                if (swapped.toString().contains(strings[i].substring(0, 1))) continue;
                if (strings[i].charAt(0) == strings[j].charAt(0)) {
                    map.put(i, strings[j]);
                    map.put(j, strings[i]);
                    swapped.append(strings[i].charAt(0));
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) map.put(i, strings[i]);
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = map.get(i);
        }
        return strings;
    }
}
