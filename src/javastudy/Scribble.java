package javastudy;

import javax.swing.JFrame;

public class Scribble extends JFrame {
	public Scribble() {
		setSize(300, 300);
		setTitle("마우스로 그림 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		Scribble s = new Scribble();
	}
}
