package string_3;

/*
Given a string, return the longest substring that appears at both the beginning and
end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */
public class CB03_sameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
    }

    public static String sameEnds(String string) {
        String result = "";
        for (int i = 1; i < string.length() / 2 + 1; i++) {
            if (string.substring(0, i).equals(string.substring(string.length() - i)))
                result = string.substring(0, i);
        }
        return result;
    }
}
