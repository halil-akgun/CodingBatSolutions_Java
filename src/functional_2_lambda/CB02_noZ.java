package functional_2_lambda;

import java.util.List;

/*
Given a list of strings, return a list of the strings, omitting any string that contains a "z".
(Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */
public class CB02_noZ {
    public static void main(String[] args) {
        List<String> strings = List.of("aaa", "bbb", "aza");
        System.out.println(noZ(strings));
    }

    public static List<String> noZ(List<String> strings) {
//        return strings.stream().filter(t -> !t.contains("z")).toList();
        strings.removeIf(t -> t.contains("z"));
        return strings;
    }
}