package javastudy;

import javax.swing.JFrame;

// ���콺�� �簢���� ���׸���_1
public class BasicPaint {

	public static void main(String[] args) {
		JFrame f = new JFrame("�׷��� ���� ���α׷�");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(300, 200);
		f.setVisible(true);

	}

}
