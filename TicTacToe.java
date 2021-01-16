import java.util.Scanner;
public class TicTacToe{
	private static String player_choice;
	private static String computer_choice;
	private static char [][] boardGame = new char [3][3];
	public static char[] board;
	public static char[] board() {
		char[] board = new char[10];
		for(int i=1; i<board.length; i++) {
			board[i]=' ';
		}
		return board;
	}
	
	public static void chooseLetter() {
		
		
		if (player_choice.equals("X")) {
			computer_choice = "Y";
			System.out.println("Computer letter is: "+ computer_choice);		
		}
		else {
			computer_choice = "X";
			System.out.println("Computer letter is: "+ computer_choice);
		}
	}
	
	public static void showBoard(){
		System.out.println("\n "+boardGame[0][0]+" | "+boardGame[0][1]+" | "+boardGame[0][2]+" ");
		System.out.println("-----------");
		System.out.println(" "+boardGame[1][0]+" | "+boardGame[1][1]+" | "+boardGame[1][2]+" ");
		System.out.println("-----------");
		System.out.println(" "+boardGame[2][0]+" | "+boardGame[2][1]+" | "+boardGame[2][2]+" ");
		
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Choice letter X or Y for player");
		player_choice = sc.nextLine();
		System.out.println("Welcome to TicTacToe Game");
		char[] board = board();
		chooseLetter();
		showBoard();

		sc.close();
	}
}
