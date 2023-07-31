package recursion_1;

/*
We have a number of bunnies and each bunny has two big floppy ears. We want to compute
the total number of ears across all the bunnies recursively (without loops or multiplication).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
 */
public class CB11_bunnyEars {
    public static void main(String[] args) {
        System.out.println(bunnyEars(2));
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(--bunnies);
    }
}
