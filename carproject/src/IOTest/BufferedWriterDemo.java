package IOTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		// �����ַ���  
		String conent[] = {"ѧϰ���ֽڻ�����","�ַ�������","�ر��������ַ�ʽ"};
		File  file= new File("test.txt");
		// FileWriter �ڶ������� trueʱ ����append
		// try�м����� �����Զ��ر���
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