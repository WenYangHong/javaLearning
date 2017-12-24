package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JButtonDemo extends JFrame{
	public JButtonDemo() {
		// TODO Auto-generated constructor stub
		setTitle("JButton");
		setBounds(100, 200, 400, 400);
		Container container = getContentPane();
		// �������
		JPanel jPanel = new JPanel(new GridLayout(2, 3));
		container.add(jPanel);
		// ���Ӱ�ť
		JButton jButton[] = new JButton[6];
		for(int i=0;i<jButton.length;i++) {
			jButton[i] = new JButton();
			jPanel.add(jButton[i]);
		}
		// ��ʼ���ò�ͬ��ť������
		jButton[0].setText("��ť���ɵ��");
		jButton[0].setEnabled(false);
		
		jButton[1].setText("���ð�ť����ɫ");
		jButton[1].setBackground(Color.red);
		
		jButton[2].setText("�ޱ߿�");
		jButton[2].setBorderPainted(false);
		
		jButton[3].setText("�б߿�");
		jButton[3].setBorder(BorderFactory.createDashedBorder(Color.blue));
		
		jButton[4].setText("���Ӱ�ť����ͼ");
		jButton[4].setIcon(new ImageIcon("src/imgs/2.jpg"));
		jButton[4].setToolTipText("����");
		
		jButton[5].setText("����¼�");
		jButton[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(JButtonDemo.this, "����ɹ�");
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JButtonDemo();
	}
}