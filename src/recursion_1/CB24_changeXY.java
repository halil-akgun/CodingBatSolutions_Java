package recursion_1;

/*
Given a string, compute recursively (no loops) a new string where
all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
 */
public class CB24_changeXY {
    public static void main(String[] args) {
        System.out.println(changeXY("codex"));
    }

    public static String changeXY(String str) {
        if (str.isEmpty()) return "";
        return (str.charAt(0) == 'x' ? 'y' : str.charAt(0)) + changeXY(str.substring(1));
    }
}
