package game;

import java.util.Scanner;

/**
 * 
 * @author Viola Barte
 *
 *
 *Spiel Schere, Stein, Papier gegen den Computer
 *Sieger ist, wer zuerst 3 Punkte hat 
 */

public class RockPaperScissors {

    public static void main(String[] args) {

    int scoreToWin = 3;
    int scorePlayer = 0; 
    int scoreMachine = 0; 
    int choicePlayer; //Auswahl des Spielers
    int choiceMachine; //Auswahl des Programms
    Scanner in = new Scanner(System.in);
    System.out.println("What do you choose? Rock(1), Paper(2) or Scissors(3)");

    while (scorePlayer < scoreToWin && scoreMachine < scoreToWin) {
        System.out.println("Your choice: ");
        choicePlayer = in.nextInt();
        choiceMachine = (int) ((Math.random() * 3) + 1);
        System.out.println("The machine chooses: " + nameOfChoice(choiceMachine));
        
        if (choiceMachine == choicePlayer) {
           System.out.println("Tie");
        }
        if ((choiceMachine == 1 && choicePlayer == 2) || (choiceMachine == 2 && choicePlayer == 3) 
        || (choiceMachine == 3 && choicePlayer == 1)) {
          scorePlayer = scorePlayer + 1;
          System.out.println(nameOfChoice(choicePlayer) + " beats " + nameOfChoice(choiceMachine));
        }
        if ((choiceMachine == 1 && choicePlayer == 3) || (choiceMachine == 2 && choicePlayer == 1) 
        || (choiceMachine == 3 && choicePlayer == 2)) {
            scoreMachine = scoreMachine + 1;
            System.out.println(nameOfChoice(choiceMachine) + " beats " + nameOfChoice(choicePlayer));
        }
        System.out.println("SCORE: Player " + scorePlayer + " Machine " + scoreMachine);
    }
    if (scoreMachine >= 3) {
        System.out.println("THE MACHINE WINS");
    } else {
        System.out.println("THE PLAYER WINS");
    }
    
    in.close();
    }
    
    public static String nameOfChoice(int choice) {
        String choiceSymbol = "";
        if (choice == 1) {
           choiceSymbol = "Rock"; 
        } else if (choice == 2) {
            choiceSymbol = "Paper"; 
        } else if (choice == 3) {
           choiceSymbol = "Scissors"; 
        }
        return choiceSymbol;
     }

}
