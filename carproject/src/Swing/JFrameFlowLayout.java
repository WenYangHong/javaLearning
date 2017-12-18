package Swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameFlowLayout extends JFrame{
	public JFrameFlowLayout() {
		// TODO Auto-generated constructor stub
		setTitle("������");
		Container container = getContentPane();
		// ���ò�������
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,5));
		// �������
		for(int i =1 ;i<10;i++) {
			container.add(new JButton("��ť"+i));
		}
		setBounds(100, 100, 200, 300);
		// ���ùر�
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameFlowLayout();
	}
}