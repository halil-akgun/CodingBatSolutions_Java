package recursion_1;

/*
Given a string and a non-empty substring sub, compute recursively
the largest substring which starts and ends with sub and return its length.

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
 */
public class CB30_strDist {
    public static void main(String[] args) {
        System.out.println(strDist("catcowcatzxc", "cat"));
    }

    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) return 0;

        int result = str.length();

        if (!str.startsWith(sub)) {
            str = str.substring(1);
            result = Math.min(result, strDist(str, sub));
        } else if (!str.endsWith(sub)) {
            str = str.substring(0, str.length() - 1);
            result = Math.min(result, strDist(str, sub));
        }

        return result;

        /*  ChatGPT:
            if (str.length() < sub.length()) return 0;

            if (str.startsWith(sub) && str.endsWith(sub)) {
                return str.length();
            }

            if (!str.startsWith(sub)) {
                return strDist(str.substring(1), sub);
            }

            if (!str.endsWith(sub)) {
                return strDist(str.substring(0, str.length() - 1), sub);
            }

            return 0;
         */
    }
}
