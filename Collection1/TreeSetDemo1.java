package Collection1;

import java.util.*;

/*容器自身具备比较性：
 * 定义了比较器，将比较器的对象
 * 练习：按照字符串长度排序
 * 字符串本身具备比较性，但是它的比较方式不是所需要的*/
public class TreeSetDemo1 {
	public static void main(String[] args){
		TreeSet ts=new TreeSet( new  StrLenCompararor ());
		
		ts.add("adfs");
		ts.add("fd");
		ts.add("sd");
		ts.add("shfduishfiu");
		ts.add("d");
		Iterator<Student> it=ts.iterator();
		while(it.hasNext()){
			sop(it.next());
			
		}		
		
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
class StrLenCompararor implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=(String)o1;
		String s2=(String)o2;
		int num=new Integer(s1.length()).compareTo(s2.length());
		if(num==0)
			return s1.compareTo(s2);
		return num;
		
	}
	
}