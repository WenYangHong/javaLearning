package dec;

public class Demo{
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7};
//		getSumber(Sumber.WINTER);
		// ��ȡö���еĶ��󣬲��һ��ö�ٷ����еķ���ֵ
		Sumber s = Sumber.WINTER;
		System.out.println(s.getSum(array));
	}
	
	
	
}