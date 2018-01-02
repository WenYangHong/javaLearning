package IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTextDemo {
	public static void main(String[] args) {
		File file = new File("demo.txt");
		// д������
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file,true);
			Date date = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = simpleDateFormat.format(date);
			String txt = time+"-----������־�ļ�\n";
			// ��ʼд�� �����ݴ����ֽ�����
			byte[] bit = txt.getBytes();
			try {
				fileOutputStream.write(bit);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// ��ʼ��ȡ�ļ�
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			// �����ֽ����������洢��ȡ��������
			byte read[]= new byte[1000];
			try {
				int get = fileInputStream.read(read);
				// ���
				System.out.println("��ȡ����������:\n"+new String(read,0,get));
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}