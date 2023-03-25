package functional_1_lambda;

import java.util.List;

/*
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */
public class CB06_lower {
    public static void main(String[] args) {
        List<String> nums = List.of("Hello", "Hi");
        System.out.println(lower(nums));
    }
    public static List<String> lower(List<String> strings) {
//        return strings.stream().map(String::toLowerCase).toList();
        strings.replaceAll(String::toLowerCase);
        return strings;
    }
}
