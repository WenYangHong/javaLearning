package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class JDialogDemo2 extends JDialog{
	public JDialogDemo2(JFrame jFrame) {
		// TODO Auto-generated constructor stub
		// 开始创建子类 对话框
		super(jFrame, "开始注册", true);
		
		// 获取容器
		Container container = getContentPane();
		// 开始设置子类属性
//		setTitle("");
		setBounds(400, 200, 500, 400);
		setBackground(Color.lightGray);
		// 添加label
		JLabel jLabel = new JLabel("欢迎您的注册！祝您生活愉快");
		// 设置字体的颜色
		jLabel.setForeground(Color.RED);
		// 设置字体的大小 字体类型
		jLabel.setFont(new Font("楷体", Font.BOLD, 15));
		container.add(jLabel);
	}
}
