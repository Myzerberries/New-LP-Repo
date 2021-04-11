package acadamey.learnprogramming;

public class Main {

    public static void main(String[] args) {
	//The eight primitive types:
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is my string";
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);


    }
}
