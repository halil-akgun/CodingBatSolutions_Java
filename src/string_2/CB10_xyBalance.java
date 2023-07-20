package string_2;

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */
public class CB10_xyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbbY"));
    }

    public static boolean xyBalance(String str) {
        if (!str.toLowerCase().contains("x") && !str.toLowerCase().contains("y")) return true;
        if (!str.toLowerCase().contains("x") && str.toLowerCase().contains("y")) return true;
        if (!str.toLowerCase().contains("x") || !str.toLowerCase().contains("y")) return false;
        return str.toLowerCase().substring(str.indexOf('x')).contains("y") &&
                !str.toLowerCase().substring(str.toLowerCase().lastIndexOf('y')).contains("x");
    }
}
