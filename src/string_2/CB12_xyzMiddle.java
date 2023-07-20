package string_2;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of
chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */
public class CB12_xyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
    }

    public static boolean xyzMiddle(String str) {
        boolean isEqualXYZ;
        boolean isCenter;
        for (int i = 2; i < str.length(); i++) {
            isEqualXYZ = str.substring(i - 2, i + 1).equalsIgnoreCase("xyz");
            isCenter = Math.abs((i - 2) - (str.length() - (i + 1))) < 2;
            if (isEqualXYZ && isCenter) return true;
        }
        return false;
    }
}
