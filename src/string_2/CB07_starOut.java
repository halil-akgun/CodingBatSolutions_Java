package string_2;

import java.util.ArrayList;
import java.util.List;

/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to
its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */
public class CB07_starOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
    }

    public static String starOut(String str) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                indexes.add(i);
                if (i - 1 != -1) indexes.add(i - 1);
                if (i != str.length() - 1) indexes.add(i + 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!indexes.contains(i)) result.append(str.charAt(i));
        }
        return result.toString();
    }
}