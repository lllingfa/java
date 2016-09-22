package Collection;

import java.util.*;

/*Collection
 * --list:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ������ϵ������
 * ArrayList :�ײ���õ�������ṹ����ѯ�죬��ɾ�������̲߳�ͬ��
 * LinkedList���ײ���õ�������ṹ ��ɾ�죬��ѯ��
 * vector���ײ����������ݽṹ���߳�ͬ������ArrayListȡ��
 * 
 * --set:���򣬲������ظ�
 * list:���еķ���
 * ���ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ���
 * ��
 * add(int index, E element)
 * addAll(Collection<? extends E> c) 
 * ɾ
 * remove(Object o)
 * ��
 * set(int index, E element) 
 * ��
 *get(int index) 
 * listIterator()
 * subList(int fromIndex, int toIndex)
 * List�������еĵ�������ListIterator��Iterator���ӽӿ�
 * �ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�أ��ᷢ��java.util.ConcurrentModificationException
 * �쳣��ֻ���жϣ�ȡ����ɾ���Ĳ����������Ҫ�����Ĳ�������ӣ��޸ģ�ֻ�����ӽӿ�ListIterator*/
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
		//ͨ��Index��ȡ�����λ��
		sop("index="+al.indexOf("java03"));
		List<String> sub=al.subList(0, 2);
		sop("sub="+sub);
	}
	public static void main(String[] args){
		//��ʾ�б������
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
		/*//�ڵ��������У�׼����ӻ���ɾ��Ԫ��
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
		Object obj =it.next();
		if(obj.equals("java02"))
			//al.add("java008");
			it.remove();//�Ӽ�����ȥ���ˣ�����obj�����ã����Դ�ӡ
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
