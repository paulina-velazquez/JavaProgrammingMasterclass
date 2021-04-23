package com.paulinavelazquez;

/**
 * Create a method called displayHighScorePosition
 * it should a players name as a parameter, and a 2nd parameter as a position in the high score table
 * You should display the players name along with a message like " managed to get into position " and the
 * position they got and a further message " on the high score table".
 * <p>
 * Create a 2nd method called calculateHighScorePosition
 * it should be sent one argument only, the player score
 * it should return an int
 * the return data should be
 * 1 if the score is >=1000
 * 2 if the score is >=500 and < 1000
 * 3 if the score is >=100 and < 500
 * 4 in all other cases
 * call both methods and display the results of the following
 * a score of 1500, 900, 400 and 50
 */
public class Main {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Megan Rapinoe", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Lynn Williams", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Carli Lloyd", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Alex Morgan", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int highScorePosition = 0;

        if (playerScore >= 1000) {
            highScorePosition = 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)) {
            highScorePosition = 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            highScorePosition = 3;
        } else {
            highScorePosition = 4;
        }
            return highScorePosition;
    }
}
