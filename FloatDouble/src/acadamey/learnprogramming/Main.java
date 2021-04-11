package acadamey.learnprogramming;

public class Main {

    public static void main(String[] args) {
	float myMinFloatValue = Float.MIN_VALUE;
	float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Float.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue =  5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("My int value= " + myIntValue);
        System.out.println("My float value= " + myFloatValue);
        System.out.println("My double value= " + myDoubleValue);


        //Challenge////////////////////////////////

        double lbs = 210;
        double lbsToKg = lbs * 0.45359237;
        System.out.println(lbsToKg);

        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_567_890;
        System.out.println(pi);
        System.out.println(anotherNumber);



    }
}
