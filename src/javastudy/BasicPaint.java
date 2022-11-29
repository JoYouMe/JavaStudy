package javastudy;

import javax.swing.JFrame;

// 마우스로 사각형과 원그리기_1
public class BasicPaint {

	public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(300, 200);
		f.setVisible(true);

	}

}
