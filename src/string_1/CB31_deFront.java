package string_1;

/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second
char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */
public class CB31_deFront {
    public static void main(String[] args) {
        System.out.println(deFront("abc"));
    }

    public static String deFront(String str) {
        StringBuilder s = new StringBuilder(str);
        if ((s.charAt(0) == 'a' || s.charAt(0) == 'A') && (s.charAt(1) == 'b' || s.charAt(1) == 'B')) {
            return s.toString();
        } else if (s.charAt(0) == 'a' || s.charAt(0) == 'A') {
            return s.deleteCharAt(1).toString();
        } else if (s.charAt(1) == 'b' || s.charAt(1) == 'B') {
            return s.deleteCharAt(0).toString();
        } else return s.delete(0, 2).toString();
    }

}
