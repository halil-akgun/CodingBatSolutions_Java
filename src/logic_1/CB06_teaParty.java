package logic_1;

/*
We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the
other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

teaParty(6, 8) → 1
teaParty(3, 8) → 0
teaParty(20, 6) → 2
 */
public class CB06_teaParty {
    public static void main(String[] args) {
        System.out.println(teaParty(6, 13));
    }

    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if (tea >= 2 * candy || candy >= 2 * tea) return 2;
        return 1;
    }

}
