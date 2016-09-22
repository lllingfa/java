package Collection;

import java.util.LinkedList;

/*LinkedListģ��һ����ջ���߶������ݽṹ
 * ��ջ���Ƚ����
 * ���У��Ƚ��ȳ�*/
class DuiLie{
	private LinkedList link;
	DuiLie(){
		link=new LinkedList();
	}
	public void myAdd(Object obj){
		link.addFirst(obj);
	}
	public Object myGet(){
		return link.removeLast();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}
class DuiZhan{
	private LinkedList link;
	DuiZhan(){
		link=new LinkedList();
	}
	public void myAdd(Object obj){
		link.addFirst(obj);
	}
	public Object myGet(){
		return link.removeFirst();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}
public class LinkedListTest {
	public static void main(String[] args){
		DuiLie dl=new DuiLie();
		dl.myAdd("java01");
		dl.myAdd("java02");
		dl.myAdd("java03");
		while(!dl.isNull())
		sop(dl.myGet());
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
