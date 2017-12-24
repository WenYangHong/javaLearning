package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JPasswordFieldDemo extends JFrame{
	public JPasswordFieldDemo() {
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 600, 100);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		JPasswordField jPasswordField = new JPasswordField();
		jPasswordField.setColumns(20);
		jPasswordField.setFont(new Font("΢���ź�", Font.BOLD, 16));
		jPasswordField.setEchoChar('&');
		JButton jButton = new JButton("��¼");
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				char[] password = jPasswordField.getPassword();
				System.out.println(password);
				if(!password.equals("23123")) {
					JLabel jLabel = new JLabel("�������");
				}
			}
		});
		container.add(jPasswordField);
		container.add(jButton);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JPasswordFieldDemo();
	}
}