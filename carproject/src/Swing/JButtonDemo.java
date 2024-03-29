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
		// 添加面板
		JPanel jPanel = new JPanel(new GridLayout(2, 3));
		container.add(jPanel);
		// 添加按钮
		JButton jButton[] = new JButton[6];
		for(int i=0;i<jButton.length;i++) {
			jButton[i] = new JButton();
			jPanel.add(jButton[i]);
		}
		// 开始设置不同按钮的属性
		jButton[0].setText("按钮不可点击");
		jButton[0].setEnabled(false);
		
		jButton[1].setText("设置按钮背景色");
		jButton[1].setBackground(Color.red);
		
		jButton[2].setText("无边框");
		jButton[2].setBorderPainted(false);
		
		jButton[3].setText("有边框");
		jButton[3].setBorder(BorderFactory.createDashedBorder(Color.blue));
		
		jButton[4].setText("添加按钮背景图");
		jButton[4].setIcon(new ImageIcon("src/imgs/2.jpg"));
		jButton[4].setToolTipText("豪车");
		
		jButton[5].setText("点击事件");
		jButton[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(JButtonDemo.this, "点击成功");
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JButtonDemo();
	}
}
