package Collection;
/*addLast(E e)
 * addFirst(E e) 
 * getFirst()
 * getLast()
 * ֻȡ��ɾ
 * size() 
 * removeFirst()
 * removeLast()
 * ��ȡ��ɾ
 * ���������û��Ԫ�أ������NoSuchElementException
 * ��JDK1.6�г������������
 * offerFirst(E e)
 * offerLast(E e)
 * peekFirst()
 * peekLast()
 * pollFirst() 
 * pollLast()  
 * 
*/
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args){
		LinkedList link=new LinkedList();
		link.addFirst("java01");
		link.addFirst("java02");
		sop(link);
		sop(link.getFirst());
		sop(link.getLast());
		sop(link.removeFirst());
		
		sop("size="+link.size());
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
