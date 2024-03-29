package Swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("窗体标题");
		// 这是窗体可见
		frame.setVisible(true);
		/*
		 * EXIT_ON_CLOSE 隐藏窗口，并停止程序
		 * HIDE_ON_CLODE:隐藏窗体，但是不停止程序
		 * DISPOSE_ON_CLOSE：释放窗体资源
		 * DO_NOTING_ON_CLOSE:无任何操作
		 * */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗体的大小 px
		frame.setSize(300, 200);
		// 设置窗体的位置
		frame.setLocation(600, 200);
		
		Container container = frame.getContentPane();//获取窗体容器
		container.setBackground(Color.WHITE);
		JLabel label= new JLabel("这是窗体");
		container.add(label);//添加组件
		container.validate();// 验证容器中的组件
		frame.setResizable(false); // 设置窗体是否可以该表大小
		
	}
}
