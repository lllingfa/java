package Collection;

import java.util.*;

/*set���򣺴�ȡ��һ�����򡣲����ظ�
 * --HashSet:�ײ����ݽṹ�ǹ�ϣ��
 * --TreeSet:
 * Set���ϵĹ��ܺ�Collection��һ�µ�*/
/*class Demo{
	
}*/
public class HashSetDemo {
	public static void main(String[] args){
	/*	Demo d1=new Demo();
		Demo d2=new Demo();
		sop(d1);
		sop(d2);*/
		HashSet hs=new HashSet();
		hs.add("java01");
		sop(hs.add("java01"));
		hs.add("java02");
		hs.add("java03");
		Iterator it=hs.iterator();
		while(it.hasNext()){
			sop(it.next());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
