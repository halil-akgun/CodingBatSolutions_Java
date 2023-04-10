package String_2;

/*
Given a string, compute a new string by moving the first char to come after the next two chars,
so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */
public class CB13_oneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
    }

    public static String oneTwo(String str) {
        int loop = str.length() / 3;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < loop; i++) {
            result.append(str.charAt(i * 3 + 1));
            result.append(str.charAt(i * 3 + 2));
            result.append(str.charAt(i * 3));
        }
        return result.toString();
    }
}
