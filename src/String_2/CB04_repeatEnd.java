package String_2;
/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
 */
public class CB04_repeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 2));
    }
    public static String repeatEnd(String str, int n) {
        String result = "";
//        return result.append(str.substring(n - 1).repeat(Math.max(0, n))).toString();
        for (int i = 0; i < n; i++) {
            result += (str.substring(n - 1));
        }
        return result;
    }
}