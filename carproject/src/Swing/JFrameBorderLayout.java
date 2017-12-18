package Swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameBorderLayout extends JFrame{
	public JFrameBorderLayout() {
		// TODO Auto-generated constructor stub
		setTitle("�߽粼��");
		setLayout(new BorderLayout());
		//�������
		JButton button1 = new JButton("��ť1"),
				button2 = new JButton("��ť2"),
				button3 = new JButton("��ť3"),
				button4 = new JButton("��ť��"),
						button5 = new JButton("��ť5");
		
		// ��ȡ����
		Container container = getContentPane();
		container.add(button1, BorderLayout.NORTH);
		container.add(button2, BorderLayout.CENTER);
		container.add(button3, BorderLayout.WEST);
		container.add(button4, BorderLayout.EAST);
		container.add(button5, BorderLayout.SOUTH);
		// ���ô����С
		setBounds(200, 100, 200, 200);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameBorderLayout();
	}
}