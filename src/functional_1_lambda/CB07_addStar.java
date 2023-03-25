package functional_1_lambda;

import java.util.List;

/*
Given a list of strings, return a list where each string has "*" added at its end.

addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
 */
public class CB07_addStar {
    public static void main(String[] args) {
        List<String> nums = List.of("Hello", "Hi");
        System.out.println(addStar(nums));
    }

    public static List<String> addStar(List<String> strings) {
//        return strings.stream().map(t -> t + "*").toList();
        strings.replaceAll(t -> t + "*");
        return strings;
    }
}
