import java.util.Scanner;
public class TicTacToe{
	public static String move = "notdone";
	private static char player_choice;
	private static char computer_choice;
	public static String currentPlayer;
	public static String nextPlayer;
	public static String game="notdone";
	public static Scanner sc= new Scanner(System.in); 
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
			computer_choice = 'O';
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
	
	public static void playerMove(){
		System.out.println("Which position you want to enter you next move.");
		currentPlayer="Player";
		move="notdone";
		while(move.equals("notdone")) {
			int index = sc.nextInt();	
			if(index > 0 && index < board.length)
			{
				if(board[index] == ' ') {
					board[index] = player_choice;
					showBoard();
					move = "done";
					break;
					}
				else
					System.out.println("Position is not empty.");
					System.out.println("Choose available positions.");
			}	
			else
			System.out.println("Entered position is outside the board.");
			System.out.println("Choose available positions present within board.");
		}
		nextPlayer="computer";
	}
	public static void computerMove()	{
		System.out.println("computer move");
		currentPlayer="Computer";
		for (int i=1; i<board.length; i++)
		{
			if(board[i] == ' ') {
				board[i] = computer_choice;
				showBoard();
				nextPlayer="player";
				break;
				}
		
		}
	}
	public static void toss(){

		System.out.println("Toss: Heads 'H' or Tails 'T' :");
		char toss = sc.next().charAt(0);
		String tossResult = (int) (Math.random() * 10) % 2	== 0 ? "Heads" : "Tails";
		System.out.println("Tossed: "+tossResult);

		if( toss != tossResult.charAt(0)) {
			System.out.println("Computer won toss.");
			currentPlayer="Computer";
			computerMove();		

		}
		else {
			System.out.println("Player won toss.");
			currentPlayer="Player";
			playerMove();

		}
	
	}
	public static void play() {
		if(nextPlayer.equals("player")) {
			playerMove();
		}
		else
			computerMove();
	}
	public static void gameStatus() {
		if (board[1] == board[2] && board[1] == board[3] && board[1] != ' '|| board[4] == board[5] && board[4] == board[6] && board[4] != ' '|| board[7] == board[8] && board[4] == board[9] && board[7] != ' '
			|| board[1] == board[4] && board[1] == board[7] && board[1] != ' ' || board[2] == board[5] && board[2] == board[8] && board[2] != ' '|| board[3] == board[6] && board[3] == board[9] && board[3] != ' '
			|| board[1] == board[5] && board[1] == board[9] && board[1] != ' '|| board[3] == board[5] && board[3] == board[7] && board[3] != ' ')
		{
			System.out.println(currentPlayer+"won");
			System.exit(0);
		}
		for (int i=1; i<board.length; i++)
		{
			if(board[i] == ' ') {
				play();	
				break;
				}
			else if(board[9] != ' ') {
				System.out.println("It's Tie.");
			}
		}
			
		
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Choice letter X or O for player");
		String choice = sc.nextLine();
		player_choice=choice.charAt(0);
		System.out.println("Welcome to TicTacToe Game");
        board = board();
		chooseLetter();
		showBoard();
        toss();
        while(game.equals("notdone")) {
        	gameStatus();
        }
		sc.close();
	}
}
