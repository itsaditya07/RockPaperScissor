package ADITYA;

import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Player 1: Choose rock, paper, or scissors:");
String player1 = in.next().toLowerCase();
System.out.println("Player 2: Choose rock, paper, or scissors:");
String player2 = in.next().toLowerCase();

if (player1.equals(player2)) {
System.out.println("it's a tie!");
} else if (player1.equals("rock")) {

if (player2.equals("scissors")) {
System.out.println("Player 1 wins");
} else if (player2.equals("paper")) {
System.out.println("Player 2 wins");
}
} else if (player1.equals("paper")) {

if (player2.equals("rock")) {
System.out.println("player 1 wins");
} else if (player2.equals("scissors")) {
System.out.println("player 2 wins");
}
} else if (player1.equals("scissors")) {
	if (player2.equals("paper")) {
		System.out.println("player 1 wins");
		} else if (player2.equals("rock")) {
		System.out.println("player 2 wins");
		}  
}
}
}