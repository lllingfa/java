package Connectin;
import java.util.*;
/*�߼�forѭ��
 * ��ʽ
 * for(�������� ������:����)
 * ֻ��ȡ���������޸ģ�����������remove���б��������ɾ�Ĳ�
 * ��ͳfor�͸߼�for��ʲô������
 * �߼�for��һ�������ԡ������б�������Ŀ�ꡣ��ͳfor���Զ���Ǳ�*/
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
