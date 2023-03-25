package functional_1_lambda;

import java.util.List;

/*
Given a list of strings, return a list where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
 */
public class CB09_noX {
    public static void main(String[] args) {
        List<String> nums = List.of("ax", "bb", "cx");
        System.out.println(noX(nums));
    }

    public static List<String> noX(List<String> strings) {
//        return strings.stream().map(t -> t.replaceAll("x", "")).toList();
        strings.replaceAll(t -> t.replaceAll("x", ""));
        return strings;
    }
}
