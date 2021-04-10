package acadamey.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1));
        System.out.println("Busted min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + (myMinByteValue - 1));
        System.out.println("Byte maximum value = " + (myMaxByteValue + 1));

        long myLongValue = 100L;

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        //CHALLENGE ZONE////////////////////////////////////

        byte myChallengeByte = 52;
        short myChallengeShortValue = 21862;
        int myChallengeIntValue = 392558692;
        long myChallengeLongValue = 50000L + (10L * (myChallengeByte + myChallengeShortValue + myChallengeIntValue));

        System.out.println(myChallengeLongValue);
    }
}
