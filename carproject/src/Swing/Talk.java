package Swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Talk extends JFrame{
	public Talk() {
		// TODO Auto-generated constructor stub
		setTitle("注意这是一个窗口"); // 设置窗口标题
		setVisible(true ); // 设置窗体可见
		setLocation(500, 200); // 设置窗体的位置
		setSize(300, 200); // 设置窗体大小
		Container container = getContentPane();
		container.setBackground(Color.WHITE); // 
		JLabel jLabel = new JLabel();
		container.add(jLabel);
		container.add(new JButton("按钮"));
	}
	
	public static void main(String[] args) {
		new Talk();
	}
}
