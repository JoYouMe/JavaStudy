package udemy.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		GameingConsole game = new ChessGame();
	//	ChessGame game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
