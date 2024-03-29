package Swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameFlowLayout extends JFrame{
	public JFrameFlowLayout() {
		// TODO Auto-generated constructor stub
		setTitle("流布局");
		Container container = getContentPane();
		// 设置布局类型
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,5));
		// 添加组件
		for(int i =1 ;i<10;i++) {
			container.add(new JButton("按钮"+i));
		}
		setBounds(100, 100, 200, 300);
		// 设置关闭
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameFlowLayout();
	}
}
