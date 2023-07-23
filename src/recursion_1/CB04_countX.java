package recursion_1;

/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
 */
public class CB04_countX {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
    }

    public static int countX(String str) {
        if (str.length() == 0) return 0;
        return str.substring(str.length() - 1).replaceAll("[^x]", "").length()
                + countX(str.substring(0, str.length() - 1));
    }
}
