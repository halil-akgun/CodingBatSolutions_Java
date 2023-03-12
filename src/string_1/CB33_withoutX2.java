package string_1;

/*

Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise
return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */
public class CB33_withoutX2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("xyzZX"));
    }

    public static String withoutX2(String str) {
        if (str.length() == 1 && (str.contains("x") || str.contains("X"))) {
            return str.replaceAll("[xX]", "");
        } else if (str.contains("x") || str.contains("X")) {
            String a = str.substring(0, 2);
            String b = str.substring(2);
            return a.replaceAll("[xX]", "") + b;
        }
        return str;
    }
}
