package Connectin;
/*jdk版本的新特性
 * 可变参数一定要定义在参数列表的最后面*/
public class ParamMethodDemo {
	public static void main(String[] args){
		//虽然少定义了多个方法，但是每一次都要定义数组作为实际参数
		show(2);
		show(2,3,4);
		/*可变参数...
		 * 其实就是上一中数组参数的简写形式
		 * 不是每一次手动的建立数组对象
		 * 只要将要操作的元素作为参数传递即可
		 * 隐式的将这项参数封装成了数组
		 * */
	}
	public static void show(int... arr){
		sop(arr.length);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
