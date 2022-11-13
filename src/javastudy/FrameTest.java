package javastudy;

import javax.swing.JFrame;

// 프레임 만들기
public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
