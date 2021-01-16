public class TicTacToe{
	private static String player_choice;
	private static String computer_choice;
	public char[] board;
	public static char[] Board() {
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
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Choice letter X or Y for player");
		player_choice = sc.nextLine();
		System.out.println("Welcome to TicTacToe Game");
		char[] board = Board();
		chooseLetter();
		sc.close();
	}
}
