package Swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Talk extends JFrame{
	public Talk() {
		// TODO Auto-generated constructor stub
		setTitle("ע������һ������"); // ���ô��ڱ���
		setVisible(true ); // ���ô���ɼ�
		setLocation(500, 200); // ���ô����λ��
		setSize(300, 200); // ���ô����С
		Container container = getContentPane();
		container.setBackground(Color.WHITE); // 
		JLabel jLabel = new JLabel();
		container.add(jLabel);
		container.add(new JButton("��ť"));
	}
	
	public static void main(String[] args) {
		new Talk();
	}
}