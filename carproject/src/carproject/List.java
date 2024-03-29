package carproject;

import java.util.*;

public class List {
	public static void main(String[] args) {
		
	// 集合类  List和Set集合继承了 Collection类  
		// List类 下有 ArrayList(数组集合)  LinkList(链表集合)
		// Set类下有 HashList(哈希集合) TreeList(二叉树集合)
		// 主要用到的几个方法：add(添加集合对象) set(设置集合对象) remove(删除集合对象) isEmpty(判断集合是否为空)  get(获取集合对象)
		// 集合中有 iterator 迭代器用于循环遍历集合中的对象  常用的方法 HasNext(判断是否有下一个集合对象) Next(获取集合对象)
		
		// --------------------记录于 2017/12/14 0:33分  洪文扬---------------------
		
		// 思考问题：关于哈希集合在存储对象时是无序的，但是在使用迭代器遍历数据时，显示的数据为有序数据？
		// Map(集合还没学到)
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
