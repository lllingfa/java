package Collection;
/*add�����Ĳ���������object���Ա��ڽ����������Ͷ���
 * 2.�����д洢���Ƕ����ַ
 * ʲô�ǵ������أ�
 * ��ʵ���Ǽ��ϵ�ȡ��Ԫ�صķ�ʽ�� */
import java.util.*;

public class collectingDemo {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void base_method(){
		//����һ������������ʹ��collection�ӿڵ����࣬ArrayList
		ArrayList<String> al=new ArrayList<String>();
		//1.���Ԫ��
		al.add("java01");
		al.add("java02");
		//2.��ӡ����
		sop(al);
		//4.�ж�Ԫ��
		sop("java03�Ƿ���ڣ�"+al.contains("java03"));
		//3.ɾ��Ԫ��
		al.remove("java02");
		sop(al);
		al.clear();
		sop("�����Ƿ�Ϊ�գ�"+al.isEmpty());
		sop(al);
		sop("size:"+al.size());
		
	}
	public static void method_2(){
		ArrayList<String> al=new ArrayList<String>();
		//1.���Ԫ��
		al.add("java01");
		al.add("java02");
		ArrayList<String> al2=new ArrayList<String>();
		//1.���Ԫ��
		al2.add("java01");
		//al2.add("java02");
		al2.add("java03");
		al.retainAll(al2);
		sop("al:"+al);
		sop("al2:"+al);
	}
	public static void method_get(){
		ArrayList<String> al=new ArrayList<String>();
		//1.���Ԫ��
		al.add("java01");
		al.add("java02");
		//Iterator<String> it=al.iterator();//��ȡ������������ȡ��Ԫ��
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
