package string_2;

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */
public class CB20_zipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zzzopzop"));
    }

    public static String zipZap(String str) {
        if (str.length() < 3) return str;
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 2; i < str.length(); i++) {
            if (!(str.toLowerCase().charAt(i - 2) == 'z' && str.toLowerCase().charAt(i) == 'p'))
                sb.append(str.charAt(i - 1));
        }
        sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }
}
