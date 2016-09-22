package Connectin;
import java.util.*;

public class CollectionToArray {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String> ();
		al.add("abc01");
		al.add("abc02");
		al.add("abc03");
		/*当指定类型的数组长度小于了集合的size,那么该方法内部会创建一个新得数组
		 * 长度为集合的size
		 * 当指定类型的数组长度大于了集合的size,就不会新创建了数组，而是使用传递来的数组
		 * 创建刚刚好的数组最优
		 * 为什么要集合变数组
		 * 为了限定都元素的操作*/
		String[] arr=al.toArray(new String[2]);
		sop(Arrays.toString(arr));
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
