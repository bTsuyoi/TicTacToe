import java.util.Scanner;
public class TicTacToe{
	private static char player_choice;
	private static char computer_choice;
	public static Scanner sc= new Scanner(System.in); 
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
		
		
		if (player_choice == 'X') {
			computer_choice = 'Y';
			System.out.println("Computer letter is: "+ computer_choice);		
		}
		else {
			computer_choice = 'X';
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
	
	public static void toPlay(){
		System.out.println("Which position you want to enter you next move.");
		int index = sc.nextInt();	
		if(index > 0 && index < board.length)
		{
			if(board[index] == ' ')
				board[index] = player_choice;
			else
				System.out.println("Position is not empty");
		}	
		else
		System.out.println("Entered position is outside the board.");
	}
	public static void main(String[] args) {
		
		
		System.out.println("Choice letter X or Y for player");
		String choice = sc.nextLine();
		player_choice=choice.charAt(0);
		System.out.println("Welcome to TicTacToe Game");
		char[] board = board();
		chooseLetter();
		showBoard();
		toPlay();
		sc.close();
	}
}
