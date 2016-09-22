package Connectin;
import java.util.*;
/*练习。fill方法可以将list集合中所有元素替换成指定元素，
 * 将list集合中部分元素替换成指定元素*/
public class CollectionDemo2 {
	public static void main(String[] args){
		 fillDemo();
		 replaceAllDemo();
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void replaceAllDemo(){
		List<String> list=new ArrayList<String>();
		list.add("dhauish");
		list.add("duish");
		list.add("dhzh");
		sop(list);
		Collections.replaceAll(list, "dhzh", "pp");
		sop(list);
		//反转
		Collections.reverse(list);
		sop(list);
	}
	public static void fillDemo(){
		List<String> list=new ArrayList<String>();
		list.add("dhauish");
		list.add("duish");
		list.add("dhzh");
		sop(list);
		Collections.fill(list, "pp");
		sop(list);
	}
}
