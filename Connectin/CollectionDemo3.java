package Connectin;
import java.util.*;
//Äæ×ªË³Ðò
class StrComparator implements Comparator<String>{
	public int compare(String s1,String s2){
		return s2.compareTo(s1);
	}
}
public class CollectionDemo3 {
	public static void main(String[] args){
		orderDemo();
		shuffleDemo();
	}
	//Ëæ»ú£¬Ï´ÅÆ
	public static void shuffleDemo(){
		List<String> list=new ArrayList<String>();
		list.add("dhauish");
		list.add("duish");
		list.add("dhzh");
		list.add("shduia");
		sop(list);
		Collections.shuffle(list);
		sop(list);
	}
	public static void orderDemo(){
		//TreeSet<String> ts=new TreeSet<String>(new StrComparator());
		//TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder(new StrLenComparator1()));
		ts.add("abcde");
		ts.add("aa");
		ts.add("sfsa");
		Iterator it=ts.iterator();
		while(it.hasNext()){
			sop(it.next());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
class StrLenComparator1 implements Comparator<String>{
	public int compare(String s1,String s2){
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}