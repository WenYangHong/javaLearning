package Swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameGridLayout extends JFrame{
	public JFrameGridLayout() {
		// TODO Auto-generated constructor stub
		setTitle("���񲼾�");
		setLayout(new GridLayout(6, 2));
		Container container = getContentPane();
		for(int i =1;i<20;i++) {
			container.add(new JButton("��ť"+i));
		}
		setBounds(100, 200, 200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameGridLayout();
	}
}
