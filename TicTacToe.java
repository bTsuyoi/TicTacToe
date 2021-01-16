import java.util.Scanner;
public class TicTacToe{
	public static String move = "notdone";
	private static char player_choice;
	private static char computer_choice;
	public static Scanner sc= new Scanner(System.in); 
//	private static char [][] boardGame = new char [3][3];
	public static char[] board;
	public static char[] board() {
		board = new char[10];
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
		System.out.println("\n "+board[1]+" | "+board[2]+" | "+board[3]+" ");
		System.out.println("-----------");
		System.out.println(" "+board[4]+" | "+board[5]+" | "+board[6]+" ");
		System.out.println("-----------");
		System.out.println(" "+board[7]+" | "+board[8]+" | "+board[9]+" ");
	}
	
	public static void toPlay(){
		System.out.println("Which position you want to enter you next move.");
		while(move.equals("notdone")) {
			int index = sc.nextInt();	
			if(index > 0 && index < board.length)
			{
				if(board[index] == ' ') {
					board[index] = player_choice;
					move = "done";
					}
				else
					System.out.println("Position is not empty.");
					System.out.println("Choose available positions.");
			}	
			else
			System.out.println("Entered position is outside the board.");
			System.out.println("Choose available positions present within board.");
		}
	}
	public static void main(String[] args) {
		
		
		System.out.println("Choice letter X or Y for player");
		String choice = sc.nextLine();
		player_choice=choice.charAt(0);
		System.out.println("Welcome to TicTacToe Game");
        board = board();
		chooseLetter();
		showBoard();
		toPlay();
		showBoard();
		sc.close();
	}
}
