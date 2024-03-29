package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFiledDemo extends JFrame{
	public JTextFiledDemo() {
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 300, 170);
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		JTextField jTextField = new JTextField("默认值");
		jTextField.setColumns(15);
		JButton jButton = new JButton("清空内容");
		jTextField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jTextField.setText("回车事件");
			}
		});
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jTextField.setText("");
				jTextField.requestFocus();// 焦点回到文本框
			}
		});
		container.add(jTextField);
		container.add(jButton);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFiledDemo();
	}
}
