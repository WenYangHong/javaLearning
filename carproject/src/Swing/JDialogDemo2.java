package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class JDialogDemo2 extends JDialog{
	public JDialogDemo2(JFrame jFrame) {
		// TODO Auto-generated constructor stub
		// ��ʼ�������� �Ի���
		super(jFrame, "��ʼע��", true);
		
		// ��ȡ����
		Container container = getContentPane();
		// ��ʼ������������
//		setTitle("");
		setBounds(400, 200, 500, 400);
		setBackground(Color.lightGray);
		// ����label
		JLabel jLabel = new JLabel("��ӭ����ע�ᣡף���������");
		jLabel.setForeground(Color.RED);
		// ��������Ĵ�С ��������
		jLabel.setFont(new Font("����", Font.BOLD, 15));
		container.add(jLabel);
	}
}