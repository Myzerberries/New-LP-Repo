package acadamey.learnprogramming;

public class Main {

    public static void main(String[] args) {
	boolean isAlien = false;
	if(isAlien == true) {
        System.out.println("It is not an alien");
    }

	int topScore = 99;
	if (topScore > 100) {
        System.out.println("You got the top score");
    }
	int secondTopScore = 60;
	if ((topScore > secondTopScore) && (topScore < 100)){
        System.out.println("Greater than second top score and less than 100");
    }

	if ((topScore > 90) || (secondTopScore <= 90)){
        System.out.println("Either or both of the conditions are true");
    }

	int newValue = 50;
	if (newValue == 50) {
        System.out.println("This is an error");
    }

    boolean isCar = false;
	if (!isCar){
        System.out.println("This is not supposed to happen");
    }
    isCar = true;
	boolean wasCar = isCar ? true:false;
	if (wasCar){
        System.out.println("wasCar is true");
    }

	//Challenge///////////////////////

        double myDouble = 20.00;
	    double mySecondDouble = 80.00;
	    double myFirstResult = (myDouble + mySecondDouble) * 100.00;

	    double myRemainder = myFirstResult % 40;

	    boolean isNoRemainder = (myRemainder == 0) ? true : false;
        System.out.println(isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }

        }

    }

