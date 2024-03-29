package FacingCode;

import java.util.Random;
import java.util.Scanner;

public class WeiXinHongBao {
	public static void main(String[] args) {
		System.out.println("----模拟微信红包----");
		Scanner scanner = new Scanner(System.in);
		System.out.println("----请输入红包的金额----");
		double total = scanner.nextInt();
		System.out.println("----请输入红包的个数----");
		int bagCount = scanner.nextInt();
		Random random = new Random();
		double min = 0.01;
		double a = Math.pow(2, 1);
		// 进行红包的算法计算
		for(int i = 1;i<bagCount;i++) {
			/*
			 * 红包的可用最大金额 = 可分配金额 - (红包总数 - 已发出的红包数量)*最小红包金额
			 * */
			double max =  total - (bagCount-i)*min;
			double bound = max - min; // 设置随机金额的取值范围
			double safe = (double)random.nextInt((int) (bound * 100)) / 100;
			double money = safe + min; //防止出现0元的情况
			total = total - money;
			System.out.println("第"+i+"个红包："+String.format("%.2f", money));
		}
		System.out.println("第"+bagCount+"个红包："+String.format("%.2f", total));
		scanner.close();
	}
}
