package functional_1_lambda;

import java.util.List;

/*
Given a list of strings, return a list where each string has "y" added at its start and end.

moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
 */
public class CB05_moreY {
    public static void main(String[] args) {
        List<String> nums = List.of("a", "b", "c");
        System.out.println(moreY(nums));
    }

    public static List<String> moreY(List<String> strings) {
//        strings.replaceAll(t -> "y" + t + "y");
//        return strings;
        return strings.stream().map(t -> "y" + t + "y").toList();
    }
}