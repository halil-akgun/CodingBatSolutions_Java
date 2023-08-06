package recursion_1;

/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
 */
public class CB17_endX {
    public static void main(String[] args) {
        System.out.println(endX("xxre"));
    }

    public static String endX(String str) {
        if (str.isEmpty()) return "";
        if (str.startsWith("x")) return endX(str.substring(1)) + "x";
        return str.charAt(0) + endX(str.substring(1));
    }
}
