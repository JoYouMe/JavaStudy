package udemy.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		GameingConsole[] games = { new ChessGame(), new MarioGame()};
				for(GameingConsole game : games) {
					game.up();
					game.down();
					game.left();
					game.right();
					
				}

	}

}
