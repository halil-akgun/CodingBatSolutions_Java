package recursion_1;

/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
 */
public class CB08_countAbc {
    public static void main(String[] args) {
        System.out.println(countAbc("abc"));
    }

    public static int countAbc(String str) {
        if (str.length() < 3) return 0;
        boolean exists_ABC_ABA = str.substring(str.length() - 3).contains("abc") ||
                str.substring(str.length() - 3).contains("aba");

        return (exists_ABC_ABA ? 1 : 0) + countAbc(str.substring(0, str.length() - 1));
    }
}
