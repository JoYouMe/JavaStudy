package javastudy;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame extends JFrame {
	public MyFrame() {
		// GridLayout 화면배치 예제
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 3)); // 3개의 열과 필요한 만큼의 행
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		pack();
		setVisible(true);

//		--------------------------------------------
		
//		// BorderLayout 화면배치 예제
//		setTitle("BorderLayoutTest");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		// 프레임은 디폴트로 BorderLayout 이므로 사실은 불필요
//		setLayout(new BorderLayout());
//		// 버튼을 추가한다.
//		add(new JButton("Center"), BorderLayout.CENTER);
//		add(new JButton("Line Start"), BorderLayout.LINE_START);
//		add(new JButton("Line End"), BorderLayout.LINE_END);
//		add(new JButton("Page Start"), BorderLayout.PAGE_START);
//		add(new JButton("Page End"), BorderLayout.PAGE_END);
//		pack();
//		setVisible(true);
		
//		--------------------------------------------
		
		// FlowLayout 화면배치 예제
//		setTitle("FlowLayoutTest");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JPanel panel;
//		// 패널을 생성하고 배치 관리자를 FlowLayout으로 설정
//		panel = new JPanel();
//		panel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
//		// 패널에 버튼을 생성하여 추가
//		panel.add(new JButton("Button1"));
//		panel.add(new JButton("Button2"));
//		panel.add(new JButton("Button3"));
//		panel.add(new JButton("B4"));
//		panel.add(new JButton("Long Button5"));
//		add(panel);
//		pack();
//		setVisible(true);

//		--------------------------------------------
		
		// 프레임 만들기
//		Toolkit kit = Toolkit.getDefaultToolkit();
//		Dimension screenSize = kit.getScreenSize();
//		setSize(300, 200);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setTitle("MyFrame");
//		//제목 표시줄에 아이콘 넣기
//		Image img = kit.getImage("icon.gif");
//		setIconImage(img);
//		// 프레임에 버튼 넣기
//		setLayout(new FlowLayout()); 
//		JButton button = new JButton("버튼");
//		this.add(button);
//		setVisible(true);
	}
}
