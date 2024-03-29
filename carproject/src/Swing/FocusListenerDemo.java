package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FocusListenerDemo extends JFrame{
	public FocusListenerDemo() {
		setBounds(200, 200, 600, 600);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		JTextField jTextField1 = new JTextField();
		JTextField jTextField2 = new JTextField();
		jTextField1.setColumns(20);
		jTextField2.setColumns(20);
		jTextField1.setBounds(10, 10, 100, 100);
		jTextField2.setBounds(10, 10, 100, 100);
		container.add(jTextField1);
		container.add(jTextField2);
		jTextField1.addFocusListener(new MyFocus());
		jTextField2.addFocusListener(new MyFocus());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
  /*
   * 自定义焦点接口
   * */	
	class MyFocus implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			JTextField jTextField = (JTextField)e.getSource();
			if(jTextField.getText().equals("a")) {
				jTextField.setBorder(BorderFactory.createLineBorder(Color.red));
			}else {
				jTextField.setBorder(BorderFactory.createLineBorder(Color.gray));
			}
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			JTextField jTextField = (JTextField)e.getSource();
			if(jTextField.getText().equals("")) {
				jTextField.setBorder(BorderFactory.createLineBorder(Color.red));
			}
		}	

		
	}
	public static void main(String[] args) {
		new FocusListenerDemo();
	}
}
