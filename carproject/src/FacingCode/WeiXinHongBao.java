package FacingCode;

import java.util.Random;
import java.util.Scanner;

public class WeiXinHongBao {
	public static void main(String[] args) {
		System.out.println("----ģ��΢�ź��----");
		Scanner scanner = new Scanner(System.in);
		System.out.println("----���������Ľ��----");
		double total = scanner.nextInt();
		System.out.println("----���������ĸ���----");
		int bagCount = scanner.nextInt();
		Random random = new Random();
		double min = 0.01;
		double a = Math.pow(2, 1);
		// ���к�����㷨����
		for(int i = 1;i<bagCount;i++) {
			/*
			 * ����Ŀ�������� = �ɷ����� - (������� - �ѷ����ĺ������)*��С������
			 * */
			double max =  total - (bagCount-i)*min;
			double bound = max - min; // �����������ȡֵ��Χ
			double safe = (double)random.nextInt((int) (bound * 100)) / 100;
			double money = safe + min; //��ֹ����0Ԫ�����
			total = total - money;
			System.out.println("��"+i+"�������"+String.format("%.2f", money));
		}
		System.out.println("��"+bagCount+"�������"+String.format("%.2f", total));
		scanner.close();
	}
}