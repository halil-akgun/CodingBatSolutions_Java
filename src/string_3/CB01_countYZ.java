package string_3;

import java.util.Arrays;

/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not
an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 */
public class CB01_countYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("y2bz"));
    }

    public static int countYZ(String str) {
        // to select one or more space use: \\s+
        String[] arr = str.toLowerCase().replaceAll("[^a-z]", " ").trim().split("\\s+");
        System.out.println(Arrays.toString(arr));
        return (int) Arrays.stream(arr).
                filter(t -> t.charAt(t.length() - 1) == 'y' || t.charAt(t.length() - 1) == 'z').count();
    }
}
