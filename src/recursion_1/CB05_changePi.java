package recursion_1;

/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
 */
public class CB05_changePi {
    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
    }

    public static String changePi(String str) {
//        return str.replaceAll("pi", "3.14");
        if (str.contains("pi"))
            if (str.indexOf("pi") < str.length() - 2)
                return str.substring(0, str.indexOf("pi")) + "3.14" + changePi(str.substring(str.indexOf("pi") + 2));
            else return str.substring(0, str.indexOf("pi")) + "3.14";
        return str;
    }
}
