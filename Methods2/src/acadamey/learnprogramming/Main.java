package acadamey.learnprogramming;

public class Main {

    public static void main(String[] args) {

	int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

	highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        //Challenge////////////////////////////////////////////////////


       int scorePosition = calculateHighScorePosition(1000);

        displayHighScorePosition("Jeff", scorePosition);


        //Challenge////////////////////////////////////////////////////

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        else return -1;

    }
    // Challenge/////////////////////////////////////////////////////////////////
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " " +
                "on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        else if(playerScore >= 500){
            return 2;
        }
        else if(playerScore >= 100){
            return 3;
        }
        else return 4;
    }
}
