package functional_2_lambda;

import java.util.List;

/*
Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]
 */
public class CB08_no34 {
    public static void main(String[] args) {
        List<String> strings = List.of("a", "bb", "ccc");
        System.out.println(no34(strings));
    }

    public static List<String> no34(List<String> strings) {
        strings.removeIf(t -> t.length() == 3 || t.length() == 4);
        return strings;
    }
}
