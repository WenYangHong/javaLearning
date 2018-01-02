package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class WindowFocusListenterDemo extends JFrame{
	// ���������е����
		private JPanel contentPane;
		private JLabel lblTip;
		private JLabel lblLight;
	public WindowFocusListenterDemo() {
		// TODO Auto-generated constructor stub\addWindowFocusListener(new myWindowFocusListener());//Ϊ�������ӽ����¼�������
		setAutoRequestFocus(false); // JFrame����ʧȥ����
		setResizable(false); // ���ɸı䴰���С
		setTitle("�����¼��ļ���"); // ���ô�����Ŀ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(100, 100, 300, 300); // ���ô����С
		/**
		 * ����JPanel���contentPane����JFrame�����У����������ı���ɫ���߾�Ͳ���
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		/**
		 * ������ǩlblTip����JFrame�����е��ϲ࣬���ñ�ǩlabel_1���������ɫ����ʽ�Լ�ˮƽ����
		 */
		lblTip = new JLabel("JFrame����ʧȥ����ʱ����û����");
		lblTip.setForeground(Color.CYAN);
		lblTip.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		lblTip.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTip, BorderLayout.SOUTH);
		/**
		 * ������ǩlblLight����JFrame�����е��м䣬���ñ�ǩlabel_2�е�ͼ��λ�ú���ʽ
		 */
		lblLight = new JLabel("");
		lblLight.setHorizontalAlignment(SwingConstants.CENTER);
		lblLight.setIcon(new ImageIcon("src/imgs/blight.png"));
		contentPane.add(lblLight, BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		new WindowFocusListenterDemo();
	}
}