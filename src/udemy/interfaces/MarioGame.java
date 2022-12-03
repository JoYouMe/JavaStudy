package udemy.interfaces;

public class MarioGame implements GameingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Goes into a hole");
		
	}

	@Override
	public void left() {
		
	}

	@Override
	public void right() {
		System.out.println("Go Forword");
	}


}
