package recursion_1;

/*
Given a string and a non-empty substring sub, compute recursively if at least n copies
of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
 */
public class CB20_strCopies {
    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
    }

    public static boolean strCopies(String str, String sub, int n) {

        if (str.length() < sub.length()) return false;
        if (n == 0 && !str.contains(sub)) return true;

        if (str.startsWith(sub) && n != 1) {
            return strCopies(str.substring(1), sub, --n);
        } else if (str.startsWith(sub) && n == 1) {
            return !str.substring(sub.length()).contains(sub);
        } else {
            return strCopies(str.substring(1), sub, n);
        }
    }
}
