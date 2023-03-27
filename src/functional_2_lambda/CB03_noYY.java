package functional_2_lambda;

import java.util.List;

/*
Given a list of strings, return a list where each string has "y" added at its end,
omitting any resulting strings that contain "yy" as a substring anywhere.

noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 */
public class CB03_noYY {
    public static void main(String[] args) {
        List<String> strings = List.of("xx", "yay", "zz");
        System.out.println(noYY(strings));
    }

    public static List<String> noYY(List<String> strings) {
//        strings.replaceAll(t -> t + "y");
//        strings.removeIf(t -> t.contains("yy"));
//        return strings;
        return strings.stream().map(t -> t + "y").filter(t -> !t.contains("yy")).toList();
    }
}