package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MailSend extends JFrame{
	public MailSend() {
		// TODO Auto-generated constructor stub
		setTitle("�ʼ�����");
		setBounds(350, 50, 880, 660);
		setResizable(false);
		Container container = getContentPane();
		container.setLayout(new GridLayout(2,1));
		// ��ʼ�������
		// ������ť��
		JPanel jPanel = new JPanel(new GridLayout(1,1));
		JButton jButtonTop = new JButton("����");
		// ����
		jPanel.add(jButtonTop);
		
		// �ұ߲���
		JPanel jPanel2 = new JPanel(new GridLayout(1, 1));
		// ���ұ������ı���
		JTextArea jTextArea = new JTextArea();
		jPanel2.add(jTextArea);
		JButton jButtonRight = new JButton("���Ҳఴť");
		jPanel2.add(jButtonRight);
		container.add(jPanel);
		container.add(jPanel2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MailSend();
	}
}