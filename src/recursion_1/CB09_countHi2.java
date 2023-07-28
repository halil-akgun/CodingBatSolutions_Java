package recursion_1;

/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string,
however do not count "hi" that have an 'x' immediately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
 */
public class CB09_countHi2 {
    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
    }

    public static int countHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.length() == 2 && str.contains("hi")) return 1;
        if (str.length() > 2 && str.substring(0, 3).contains("hi"))
            if (!str.substring(0, 3).contains("xhi")) return 1 + countHi2(str.substring(2));
            else return countHi2(str.substring(2));

        return countHi2(str.substring(1));

    }
}
