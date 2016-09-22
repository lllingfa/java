package Connectin;
/*当类名重名时，需要指定具体的方法
 * 当方法重名时，指定具备所需的对象或者类*/
import java.util.Arrays;
import static java.util.Arrays.*;//导入所有的静态成员
import static java.lang.System.*;
/*StaticImport 静态导入*/
public class StaticImport {
	public static void main(String[] args){
		int[] arr={3,1,5};
		sort(arr);
		//int index=Arrays.binarySearch(arr, 1);
		int index=binarySearch(arr, 1);
		sop(Arrays.toString(arr));
		sop("index="+index);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
