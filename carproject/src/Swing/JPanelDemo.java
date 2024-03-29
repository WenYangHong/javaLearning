package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo extends JFrame{
   /*
    * JPanel面板	
    */
	public JPanelDemo() {
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 500, 300);
		Container container = getContentPane();
		container.setLayout(new GridLayout(2, 2,10,10));
		// 添加面板
	
		JPanel p1 = new JPanel(new GridLayout(2,2,10,10));
		JPanel p2 = new JPanel(new GridLayout(2, 2,10,10));
		// 添加边框
		p1.setBorder(BorderFactory.createTitledBorder("面板1"));
		p2.setBorder(BorderFactory.createTitledBorder("面板2"));
		// 给面板添加按钮
		p1.add(new JButton("按钮1"));
		p1.add(new JButton("按钮2"));
		p1.add(new JButton("按钮3"));
		
		p1.setBackground(Color.red);
		container.add(p1);
		container.add(p2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JPanelDemo();
	}
}
