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
		// 写入数据
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file,true);
			Date date = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = simpleDateFormat.format(date);
			String txt = time+"-----新增日志文件\n";
			// 开始写入 将数据存入字节数组
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
		
		
		// 开始读取文件
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			// 创建字节数组用来存储读取到的数据
			byte read[]= new byte[1000];
			try {
				int get = fileInputStream.read(read);
				// 输出
				System.out.println("读取到的内容是:\n"+new String(read,0,get));
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
