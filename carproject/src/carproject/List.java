package carproject;

import java.util.*;

public class List {
	public static void main(String[] args) {
		
	// ������  List��Set���ϼ̳��� Collection��  
		// List�� ���� ArrayList(���鼯��)  LinkList(��������)
		// Set������ HashList(��ϣ����) TreeList(����������)
		// ��Ҫ�õ��ļ���������add(���Ӽ��϶���) set(���ü��϶���) remove(ɾ�����϶���) isEmpty(�жϼ����Ƿ�Ϊ��)  get(��ȡ���϶���)
		// �������� iterator ����������ѭ�����������еĶ���  ���õķ��� HasNext(�ж��Ƿ�����һ�����϶���) Next(��ȡ���϶���)
		
		// --------------------��¼�� 2017/12/14 0:33��  ������---------------------
		
		// ˼�����⣺���ڹ�ϣ�����ڴ洢����ʱ������ģ�������ʹ�õ�������������ʱ����ʾ������Ϊ�������ݣ�
		// Map(���ϻ�ûѧ��)
		Random rand=new Random(47);
        Set<Integer> intset=new HashSet<Integer>();
        for (int i=0;i<10000;i++){
            intset.add(rand.nextInt(30));
        }
        Iterator<Integer> iterator=intset.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
	}
}