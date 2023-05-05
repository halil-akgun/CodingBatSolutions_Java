package array_2;

import java.util.Arrays;

/*
Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement
for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works.
The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)

fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
public class CB04_fizzArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray(4)));
    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
