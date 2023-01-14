package string_1;

/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */
public class CB30_lastTwo {
    public static void main(String[] args) {
        System.out.println(lastTwo("aq"));
    }

    public static String lastTwo(String str) {
        StringBuilder a = new StringBuilder(str);
        String s1 = "";
        String s2 = "";
        if (str.length() > 1) {
            s1 = str.substring(str.length() - 1);
            s2 = str.substring(str.length() - 2, str.length() - 1);
            a.delete(a.length() - 2, a.length());
            return a.toString() + s1 + s2;
        }
        return a.toString() + s1 + s2;
    }
}
