package recursion_1;

/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
 */
public class CB14_countHi {
    public static void main(String[] args) {
        System.out.println(countHi("hixhihixhi"));
    }

    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        else if (str.startsWith("hi")) return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }
}
