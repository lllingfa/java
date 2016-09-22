package Collection;

import java.util.*;

/*Collection
 * --list:元素是有序的，元素可以重复，因为集合体系有索引
 * ArrayList :底层采用的是数组结构，查询快，增删稍慢，线程不同步
 * LinkedList：底层采用的是链表结构 增删快，查询慢
 * vector：底层是数组数据结构，线程同步。被ArrayList取代
 * 
 * --set:无序，不可以重复
 * list:特有的方法
 * 凡是可以操作角标的方法都是该体系特有的方法
 * 增
 * add(int index, E element)
 * addAll(Collection<? extends E> c) 
 * 删
 * remove(Object o)
 * 改
 * set(int index, E element) 
 * 查
 *get(int index) 
 * listIterator()
 * subList(int fromIndex, int toIndex)
 * List集合特有的迭代器，ListIterator是Iterator的子接口
 * 在迭代时，不可以通过集合对象的方法操作集合中的元素，会发生java.util.ConcurrentModificationException
 * 异常，只能判断，取出，删除的操作，如果想要其他的操作如添加，修改，只能用子接口ListIterator*/
public class ListDemo {
	public static void method(){
		ArrayList<String> al=new ArrayList<String>();
		al.add("java01");
		al.add("java02");
		sop(al);
		al.add(1,"java03");
		al.remove(2);
		sop(al);
		al.set(0,"java007");
		sop(al);
		sop("get(1):"+al.get(1));
		sop(al);
		for(int x=0;x<al.size();x++)
			sop("al("+x+"):"+al.get(x));
		Iterator<String> it=al.iterator();
		while(it.hasNext())
			sop(it.next());
		//通过Index获取对象的位置
		sop("index="+al.indexOf("java03"));
		List<String> sub=al.subList(0, 2);
		sop("sub="+sub);
	}
	public static void main(String[] args){
		//演示列表迭代器
		ArrayList<String> al=new ArrayList<String>();
		al.add("java01");
		al.add("java02");
		ListIterator li=al.listIterator();
		while(li.hasNext()){
			Object obj=li.next();
			if(obj.equals("java02"))
				li.add("java006");
			   // li.set("java006");
		}
		/*//在迭代过程中，准备添加或者删除元素
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
		Object obj =it.next();
		if(obj.equals("java02"))
			//al.add("java008");
			it.remove();//从集合中去掉了，但是obj还在用，可以打印
		  sop("obj="+obj);
		}*/
		while(li.hasPrevious()){
			sop("pre:"+li.previous());
		}
		sop("hasNext():"+li.hasNext());
		sop("hasPrevious():"+li.hasPrevious());
		sop(al);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
