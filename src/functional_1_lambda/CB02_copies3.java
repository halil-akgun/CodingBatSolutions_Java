package functional_1_lambda;

import java.util.List;

/*
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 */
public class CB02_copies3 {
    public static void main(String[] args) {
        List<String> nums = List.of("a", "bb", "ccc");
        System.out.println(copies3(nums));
    }

    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(t -> t + t + t).toList();
//        return strings.stream().map(t -> t + t + t).collect(Collectors.toList());
    }
}