package Connectin;
import java.util.*;
/*高级for循环
 * 格式
 * for(数据类型 变量名:容器)
 * 只能取出，不能修改，迭代器可以remove，列表迭代器增删改查
 * 传统for和高级for有什么区别呢
 * 高级for有一个局限性。必须有被遍历的目标。传统for可以定义角标*/
public class ForEachDemo {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String> ();
		al.add("abc01");
		al.add("abc02");
		al.add("abc03");
		for(String s:al)
			sop(s);
		/*Iterator<String> it=al.iterator();
		while(it.hasNext()){
			sop(it.next());*/
		//}
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		Set<Integer> keySet=hm.keySet();
		for(Integer i : keySet){
			sop(i+"::"+hm.get(i));
		}
		for(Map.Entry<Integer, String>me :hm.entrySet()){
			sop(me.getKey()+"------"+me.getValue());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
