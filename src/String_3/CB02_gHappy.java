package String_3;

/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */
public class CB02_gHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("g"));
    }

    public static boolean gHappy(String str) {
        if (str.equalsIgnoreCase("g")) return false;
        str = str.toLowerCase();
        for (int i = 1; i < str.length() - 1; i++) {
            if (i == 1 && str.charAt(0) == 'g' && str.charAt(i) != 'g') return false;
            if (i == str.length() - 2 && str.charAt(i + 1) == 'g' && str.charAt(i) != 'g') return false;
            if (str.charAt(i) == 'g')
                if (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') return false;
        }
        return true;
    }
}
