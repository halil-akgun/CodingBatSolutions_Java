package String_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceeded or followed by a letter -- so for example,
the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 */
public class CB08_notReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("This is right"));
    }

    public static String notReplace(String str) {
        if (str.equals("is")) return "is not";
        StringBuilder result = new StringBuilder(str);
        List<Integer> indexes = new ArrayList<>();
        for (int i = 3; i < str.length(); i++) {
            boolean rule1 = !Character.isLetter(str.charAt(i - 3)) && !Character.isLetter(str.charAt(i));
            boolean rule2 = str.startsWith("is", i - 2);
            if (rule1 && rule2) indexes.add(i - 2);
        }
        if (str.startsWith("is") && !Character.isLetter(str.charAt(2))) indexes.add(0);
        if (str.startsWith("is", str.length() - 2) && !Character.isLetter(str.charAt(str.length() - 3)))
            indexes.add(str.length() - 2);
        indexes.sort(Comparator.reverseOrder());
        for (Integer w : indexes) {
            result.insert(w + 2, " not");
        }
        return result.toString();
    }
}
