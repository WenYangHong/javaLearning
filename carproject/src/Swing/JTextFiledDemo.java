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
		JTextField jTextField = new JTextField("Ĭ��ֵ");
		jTextField.setColumns(15);
		JButton jButton = new JButton("�������");
		jTextField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jTextField.setText("�س��¼�");
			}
		});
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jTextField.setText("");
				jTextField.requestFocus();// ����ص��ı���
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