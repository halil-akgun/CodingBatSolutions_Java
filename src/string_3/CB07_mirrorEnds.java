package string_3;

import java.util.TreeMap;

/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very beginning of the given string, and at the very end of the string
in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */
public class CB07_mirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("aba"));
    }

    public static String mirrorEnds(String string) {
        StringBuilder reversed = new StringBuilder(string);
        reversed.reverse();
        TreeMap<Integer, String> mirrors = new TreeMap<>();
        for (int i = 0; i < string.length() + 1; i++) {
            if (reversed.substring(0, i).equals(string.substring(0, i)))
                mirrors.put((i + 1), string.substring(0, i));
        }
        return mirrors.lastEntry().getValue();
    }
}
