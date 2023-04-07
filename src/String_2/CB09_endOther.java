package String_2;

/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
upper/lower case differences (in other words, the computation should not be "case-sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */
public class CB09_endOther {
    public static void main(String[] args) {
        System.out.println(endOther("ab", "ab12"));
    }

    public static boolean endOther(String a, String b) {
        if (a.length() <= b.length()) return b.substring(b.length() - a.length()).equalsIgnoreCase(a);
        else return a.substring(a.length() - b.length()).equalsIgnoreCase(b);
    }
}
