package Swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameBorderLayout extends JFrame{
	public JFrameBorderLayout() {
		// TODO Auto-generated constructor stub
		setTitle("边界布局");
		setLayout(new BorderLayout());
		//添加组件
		JButton button1 = new JButton("按钮1"),
				button2 = new JButton("按钮2"),
				button3 = new JButton("按钮3"),
				button4 = new JButton("按钮四"),
						button5 = new JButton("按钮5");
		
		// 获取窗体
		Container container = getContentPane();
		container.add(button1, BorderLayout.NORTH);
		container.add(button2, BorderLayout.CENTER);
		container.add(button3, BorderLayout.WEST);
		container.add(button4, BorderLayout.EAST);
		container.add(button5, BorderLayout.SOUTH);
		// 设置窗体大小
		setBounds(200, 100, 200, 200);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameBorderLayout();
	}
}
