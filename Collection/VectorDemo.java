package Collection;

import java.util.*;
/*枚举就是vector特有的去除方式
 * 出现枚举和迭代器很像
 * 最后被迭代器取代了*/
public class VectorDemo {
	public static void main(String[] args){
		Vector v=new Vector();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}
}
