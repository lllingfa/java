package Connectin;
import java.util.*;

public class ArraysDemo {
	public static void main(String[] args){
		int[] arr={2,4,5};
		sop(Arrays.toString(arr));
		String[] arr1={"abc","cc","kkkk"};
		/*数组变成list的好处;
		 * 可以使用集合的思想和方法来操作数组中的元素
		 * 注意：将数组变成集合，不可以使用集合的增删方法，因为数组的长度是固定的
		 * contains
		 * get
		 * indexof()
		 * sublist()*/
		List<String> list=Arrays.asList(arr1);
		sop("contains:"+list.contains("cc"));
		sop(list);
		/*如果数组中的元素都是对象，那么变成集合时，数组中的元素就直接转成集合中的元素
		 * 如果读是基本数据类型，该数组就会作为集合中的元素存在*/
		int[] nums={2,3,4};
		List<int[]> li=Arrays.asList(nums);
		sop(list);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
