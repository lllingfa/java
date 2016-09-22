package Collection;

import java.util.*;

/*去除ArrayList集合中的重复元素*/
public class ArrayLIstTest1 {
	public static void main(String[] args){
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("java01");
		al.add("java01");
		al.add("java02");
		al.add("java03");
		sop(al);
		al=SingleElement(al);
		sop(al);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static ArrayList<Object> SingleElement(ArrayList<Object> al){
		//定义一个临时容器
		ArrayList<Object> newAl=new ArrayList<Object>();
		Iterator<Object> it=al.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			if(!newAl.contains(obj))
				newAl.add(obj);
		}
		return newAl;
	}
	
}
