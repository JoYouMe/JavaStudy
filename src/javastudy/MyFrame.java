package javastudy;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame extends JFrame {
	public MyFrame() {
		// GridLayout ȭ���ġ ����
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 3)); // 3���� ���� �ʿ��� ��ŭ�� ��
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		pack();
		setVisible(true);

//		--------------------------------------------
		
//		// BorderLayout ȭ���ġ ����
//		setTitle("BorderLayoutTest");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		// �������� ����Ʈ�� BorderLayout �̹Ƿ� ����� ���ʿ�
//		setLayout(new BorderLayout());
//		// ��ư�� �߰��Ѵ�.
//		add(new JButton("Center"), BorderLayout.CENTER);
//		add(new JButton("Line Start"), BorderLayout.LINE_START);
//		add(new JButton("Line End"), BorderLayout.LINE_END);
//		add(new JButton("Page Start"), BorderLayout.PAGE_START);
//		add(new JButton("Page End"), BorderLayout.PAGE_END);
//		pack();
//		setVisible(true);
		
//		--------------------------------------------
		
		// FlowLayout ȭ���ġ ����
//		setTitle("FlowLayoutTest");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JPanel panel;
//		// �г��� �����ϰ� ��ġ �����ڸ� FlowLayout���� ����
//		panel = new JPanel();
//		panel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
//		// �гο� ��ư�� �����Ͽ� �߰�
//		panel.add(new JButton("Button1"));
//		panel.add(new JButton("Button2"));
//		panel.add(new JButton("Button3"));
//		panel.add(new JButton("B4"));
//		panel.add(new JButton("Long Button5"));
//		add(panel);
//		pack();
//		setVisible(true);

//		--------------------------------------------
		
		// ������ �����
//		Toolkit kit = Toolkit.getDefaultToolkit();
//		Dimension screenSize = kit.getScreenSize();
//		setSize(300, 200);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setTitle("MyFrame");
//		//���� ǥ���ٿ� ������ �ֱ�
//		Image img = kit.getImage("icon.gif");
//		setIconImage(img);
//		// �����ӿ� ��ư �ֱ�
//		setLayout(new FlowLayout()); 
//		JButton button = new JButton("��ư");
//		this.add(button);
//		setVisible(true);
	}
}
