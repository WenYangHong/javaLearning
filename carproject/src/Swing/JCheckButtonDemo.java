package Swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckButtonDemo extends JFrame{
	public JCheckButtonDemo() {
		// TODO Auto-generated constructor stub
		setBounds(100, 200, 200, 200);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		JCheckBox jCheckBox1 = new JCheckBox("Сѧ��");
		JCheckBox jCheckBox2 = new JCheckBox("��ѧ��");
		JCheckBox jCheckBox3 = new JCheckBox("��ѧ��");
		container.add(jCheckBox1);container.add(jCheckBox2);container.add(jCheckBox3);
		jCheckBox1.setSelected(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JCheckButtonDemo();
	}
}