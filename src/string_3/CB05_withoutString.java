package string_3;

/*
Given two strings, base and remove, return a version of the base string where all instances of the
remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */
public class CB05_withoutString {
    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
    }

    public static String withoutString(String base, String remove) {
        return base.replaceAll(remove.toUpperCase(), "").
                replaceAll(remove.toLowerCase(), "").replaceAll(remove, "");
    }
}
