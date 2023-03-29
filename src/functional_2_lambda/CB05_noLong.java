package functional_2_lambda;

import java.util.List;

/*
Given a list of strings, return a list of the strings, omitting any string length 4 or more.

noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
 */
public class CB05_noLong {
    public static void main(String[] args) {
        List<String> strings = List.of("xx", "yay", "zz");
        System.out.println(noLong(strings));
    }

    public static List<String> noLong(List<String> strings) {
        strings.removeIf(t -> t.length() >= 4);
        return strings;
    }
}
