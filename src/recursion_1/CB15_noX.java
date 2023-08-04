package recursion_1;

/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
 */
public class CB15_noX {
    public static void main(String[] args) {
        System.out.println(noX("xasdxasdx"));
    }

    public static String noX(String str) {
        if (str.isEmpty()) return "";
        return (str.substring(0, 1).equalsIgnoreCase("x") ? "" : str.charAt(0)) + noX(str.substring(1));
    }
}
