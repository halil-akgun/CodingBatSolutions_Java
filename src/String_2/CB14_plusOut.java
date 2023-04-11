package String_2;

import java.util.regex.Pattern;

/*
Given a string and a non-empty word string, return a version of the original String where all chars have been
replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */
public class CB14_plusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("--++ab", "++"));
    }

    public static String plusOut(String str, String word) {
        String[] arr = str.split(Pattern.quote(word), -1);
        // + karakteri regex ifadelerinde özel bir karakterdir ve "bir veya daha fazla önceki karakteri eşleştirir"
        // anlamına gelir. Bu nedenle, ++ kelimesi regex ifadelerinde geçersiz bir ifade oluşturur ve bir hata oluşur.
        // Bu hatayı düzeltmek için, split()'te Pattern.quote() word kelimesini alıntılamalıyız.
        StringBuilder result = new StringBuilder();
        for (String w : arr) {
            result.append(w.replaceAll(".", "+"));
            result.append(word);
        }
        return result.substring(0, result.length() - word.length());
    }
}
