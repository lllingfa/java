package Collection;
/*add方法的参数类型是object，以便于接受任意类型对象
 * 2.集合中存储的是对象地址
 * 什么是迭代器呢？
 * 其实就是集合的取出元素的方式。 */
import java.util.*;

public class collectingDemo {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void base_method(){
		//创建一个集合容器，使用collection接口的子类，ArrayList
		ArrayList<String> al=new ArrayList<String>();
		//1.添加元素
		al.add("java01");
		al.add("java02");
		//2.打印集合
		sop(al);
		//4.判断元素
		sop("java03是否存在："+al.contains("java03"));
		//3.删除元素
		al.remove("java02");
		sop(al);
		al.clear();
		sop("集合是否为空："+al.isEmpty());
		sop(al);
		sop("size:"+al.size());
		
	}
	public static void method_2(){
		ArrayList<String> al=new ArrayList<String>();
		//1.添加元素
		al.add("java01");
		al.add("java02");
		ArrayList<String> al2=new ArrayList<String>();
		//1.添加元素
		al2.add("java01");
		//al2.add("java02");
		al2.add("java03");
		al.retainAll(al2);
		sop("al:"+al);
		sop("al2:"+al);
	}
	public static void method_get(){
		ArrayList<String> al=new ArrayList<String>();
		//1.添加元素
		al.add("java01");
		al.add("java02");
		//Iterator<String> it=al.iterator();//获取迭代器，用于取出元素
		/*while(it.hasNext()){
		sop(it.next());}*/
		for(Iterator<String> it=al.iterator();it.hasNext();)
			sop(it.next());
	}
	public static void main(String[] args){
		 method_2();
		
		 method_get();
		
		
		
	}
}
