package recursion_1;

/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
 */
public class CB26_allStar {
    public static void main(String[] args) {
        System.out.println(allStar("hello"));
    }

    public static String allStar(String str) {
        if (str == null || str.isEmpty()) return "";
        if (str.length() == 1) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}
