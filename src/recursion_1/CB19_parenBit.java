package recursion_1;

/*
Given a string that contains a single pair of parenthesis, compute recursively a new
string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
 */
public class CB19_parenBit {
    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123"));
    }

    public static String parenBit(String str) {
        if (str.isEmpty()) return "";
        if (str.contains("(")) {
            if (str.startsWith("(")) return str.charAt(0) + parenBit(str.substring(1));
            else return parenBit(str.substring(1));
        } else if (str.startsWith(")")) return ")";
        else return str.charAt(0) + parenBit(str.substring(1));
    }
}
