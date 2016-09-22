package Collection;
/*addLast(E e)
 * addFirst(E e) 
 * getFirst()
 * getLast()
 * 只取不删
 * size() 
 * removeFirst()
 * removeLast()
 * 又取又删
 * 如果集合中没有元素，会出现NoSuchElementException
 * 在JDK1.6中出现了替代方法
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
