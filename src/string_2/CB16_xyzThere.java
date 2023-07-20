package string_2;

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly
preceded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */
public class CB16_xyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("abc.xyz"));
    }

    public static boolean xyzThere(String str) {
        return str.replaceAll("\\.xyz", "").contains("xyz");
//        Pattern a = Pattern.compile(".xyz");
//        return str.replaceAll(String.valueOf(a), "").contains("xyz");
    }
}
