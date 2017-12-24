package Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JListDemo extends JFrame{
	public JListDemo() {
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 217, 167);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container container = getContentPane();
		container.setLayout(null);
		String items[] = {"������1","������2","������3","������4","������5","������6","������7"}; 
		JList<String> jList = new JList<>(items);
		JScrollPane jScrollPane = new JScrollPane(jList);
		jScrollPane.setBounds(10, 10, 100, 100);
		// �����ı���
		JTextArea jTextArea = new JTextArea();
		
		JScrollPane jScrollPane2 = new JScrollPane(jTextArea);
		
		jScrollPane2.setBounds(120, 10,100, 50);
		//���Ӱ�ť
		JButton jButton = new JButton("ȷ��ѡ��");
		jButton.setBounds(120, 70, 80, 30);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ��ȡѡ�е�ֵ
				java.util.List<String> value = jList.getSelectedValuesList();
				for (String string : value) {
					jTextArea.append(string+"\n");
				}
			}
		});
		container.add(jScrollPane2);
		container.add(jButton);
		container.add(jScrollPane);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JListDemo();
	}
}