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
		// ���ò���
		container.setLayout(new FlowLayout());
		// ��ʼ���ø���
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(400, 200, 600, 500);
		setTitle("���Ǹ���");
		// ���Ӱ�ť
		JButton jButton = new JButton("�����ѯ");
		// ������ť�¼�
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ��������
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