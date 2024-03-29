package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrameDemo2 extends JFrame{
	public JFrameDemo2() {
		// TODO Auto-generated constructor stub
		
		Container container = getContentPane();
		// 设置布局（流布局）
		container.setLayout(new FlowLayout());
		// 开始设置父类
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(400, 200, 600, 500);
		setTitle("这是父类");
		// 添加按钮
		JButton jButton = new JButton("点击查询");
		// 监听按钮事件
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 调用子类
				JDialogDemo2 jDialogDemo2 = new JDialogDemo2(JFrameDemo2.this);
				jDialogDemo2.setVisible(true);
			}
		});
		container.add(jButton);
		setBackground(Color.LIGHT_GRAY);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameDemo2();
	}
}
