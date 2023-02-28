package logic_1;

/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */
public class CB16_fizzString {
    public static void main(String[] args) {
        System.out.println(fizzString("fib"));
    }

    public static String fizzString(String str) {
        String temp = "";
        if (str.length() > 0) {
            if (str.substring(0, 1).equalsIgnoreCase("f")) temp = "Fizz";
            if (str.substring(str.length() - 1).equalsIgnoreCase("b")) return temp += "Buzz";
        }
        if (temp.length() > 0) return temp;
        return str;
    }
}
