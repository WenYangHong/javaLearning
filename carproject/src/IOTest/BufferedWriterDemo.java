package IOTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		// 缓冲字符流  
		String conent[] = {"学习了字节缓冲流","字符缓冲流","关闭流的两种方式"};
		File  file= new File("test.txt");
		// FileWriter 第二个参数 true时 数据append
		// try中加入流 可以自动关闭流
		try(FileWriter fw = new FileWriter(file,true);BufferedWriter bufferedWriter = new BufferedWriter(fw);){
			for(int i=0;i<conent.length;i++) {
				bufferedWriter.write(conent[i]);
				bufferedWriter.newLine();
			}
		}catch (Exception e) {
		}
		
		try(FileReader fileReader = new FileReader(file);BufferedReader bufferedReader = new BufferedReader(fileReader);){

			String string ;
			int i = 0;
			while ((string = bufferedReader.readLine()) != null) {
				System.out.println(string);
			}
		}catch(Exception e) {
			
		}
	}
	
	
}
