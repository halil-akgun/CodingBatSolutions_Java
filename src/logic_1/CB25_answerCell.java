package logic_1;

/*
Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer
if it is your mom calling. In all cases, if you are asleep, you do not answer.

answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
 */
public class CB25_answerCell {
    public static void main(String[] args) {
        System.out.println(answerCell(true, false, false));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        //return isAsleep ? false : isMorning && !isMom ? false : true;
        return !isAsleep && (!isMorning || isMom);
    }
}
