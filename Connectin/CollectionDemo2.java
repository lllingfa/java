package Connectin;
import java.util.*;
/*��ϰ��fill�������Խ�list����������Ԫ���滻��ָ��Ԫ�أ�
 * ��list�����в���Ԫ���滻��ָ��Ԫ��*/
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
		//��ת
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
