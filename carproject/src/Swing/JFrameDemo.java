package Swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("�������");
		// ���Ǵ���ɼ�
		frame.setVisible(true);
		/*
		 * EXIT_ON_CLOSE ���ش��ڣ���ֹͣ����
		 * HIDE_ON_CLODE:���ش��壬���ǲ�ֹͣ����
		 * DISPOSE_ON_CLOSE���ͷŴ�����Դ
		 * DO_NOTING_ON_CLOSE:���κβ���
		 * */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô���Ĵ�С px
		frame.setSize(300, 200);
		// ���ô����λ��
		frame.setLocation(600, 200);
		
		Container container = frame.getContentPane();//��ȡ��������
		container.setBackground(Color.WHITE);
		JLabel label= new JLabel("���Ǵ���");
		container.add(label);//�������
		container.validate();// ��֤�����е����
		frame.setResizable(false); // ���ô����Ƿ���Ըñ���С
		
	}
}