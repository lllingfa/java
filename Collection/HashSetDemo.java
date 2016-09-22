package Collection;

import java.util.*;

/*set无序：存取不一定有序。不可重复
 * --HashSet:底层数据结构是哈希表
 * --TreeSet:
 * Set集合的功能和Collection是一致的*/
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
