package javastudy;

import javax.swing.JFrame;

//���콺�� �׸� �׸���
public class Scribble extends JFrame {
	public Scribble() {
		setSize(300, 300);
		setTitle("���콺�� �׸� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		Scribble s = new Scribble();
	}
}
