package class2;
/*static:静态
 * 修饰符，修饰成员变量和成员函数，节省每次创建对象的存储空间，
 * 为各对象所共享，除了可以被对象调用外，还可以被类名调用。类名.静态成员
 * 共性，特有的随对象存储方法区，共享区，数据区，随着类的加载而加载，随着类的消失而消失
 * 生命周期最长，优先于对象存在
 * 访问出现局限性
 * 主函数是静态的
 * 注意事项
 * 静态方法只能访问静态成员
 *  非静态方法既可以访问静态也可以访问非静态
 * 静态方法不可以定义this，super关键字
 *   因为优先于对象存在，所以不可以出现this
 *  
 * */ 
class Person1{
	String name;//成员变量，实例变量
	static String country="CN";//静态的成员变量，类变量
	public void show(){
		System.out.println(name+"::"+country);
	}
}
/*什么时候用静态变量呢
 * 共享数据
 * 什么时候定义静态函数呢
 * 当功能内部没有访问到非静态数据（对象的特有数据），你那么功能可以被定义为静态的
 
 * */
/*//虽然可以，但是不需要对象中的特有的数据，用static
*这是一个可以对数组进行操作的工具类
*@author falingling
*@version V1.1
*/
class   ArrayTool{
	//空参数构造函数
	private ArrayTool(){}
	//获取以个整型数组的最大值
	/*@param arr接收一个int的数组
	 *@return会返回最大值
*/
	public static int getMax(int[] arr){
		int max=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
		}
	
	public static int getMin(int[] arr){
		int min=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]<arr[min])
				min=x;
		}
		return arr[min];
		}
	/*选择排序
	 * */
	public static void  selectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++)
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
	}
	/*冒泡排序
	 * */
	public static void bubbleSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-x-1;y++)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				}
			}
		}
	}
	private static void  swap(int[] arr,int x,int y){
		int temp;
		temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	/*用于打印数组中的元素
	 * 打印形式为[element,...elment]*/
	public static void printArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(x!=arr.length-1){
				System.out.print(arr[x]+",");
			}
			else
			{
				System.out.println(arr[x]);
			}
		}
	}
	
}
/*//静态代码块
 * 特点：随着类的加载而执行，只执行一次，用于给类初始化的
*/
class StaticCode{
	//静态代码块,执行且1次，只调用静态成员
	int num=9;
	static{
		System.out.println("a");
	}
	//构造代码块，执行
	{System.out.println("b"+this.num);}
	StaticCode(){
		System.out.println("c");
	}
	StaticCode(int x){
		System.out.println("d"+x);
	}
	public static void show(){
		System.out.println("show run");
	}
}
/*初始化顺序
 * 1.new 的类文件加载到内存中
 * 2.static代码块
 * 3.堆内存开辟空间，分配地址
 * 4.对象的特有属性，默认初始化
 * 5.对象显示初始化
 * 6.对对象构造代码块初始化
 * 7.对对象的对应的构造函数初始化
 * 8.将内存地址付给内存中的p对象
 * */
public class Class2 {
	/*主函数：是一个特殊的函数。作为程序的入口，可以被jvm调用
 *  public：权限最大
 *  static：随着类的加载存在了
 *  void：无返回值
 *  main:特殊的单词，可以被jvm识别
 *  String[] args：字符串数组*/
	public static void main(String[] args){
	Person1 p1=new Person1();
	p1.show();System.out.println(Person1.country);
	int[] arr={3,4,1,8};
	System.out.println("max="+getMax(arr));
	//ArrayTool tool=new ArrayTool();直接调用，节省空间
	int max=ArrayTool.getMax(arr);
	System.out.println("max="+max);
	ArrayTool.printArray(arr);
	ArrayTool.bubbleSort(arr);
	ArrayTool.printArray(arr);
	//静态代码块
	new  StaticCode(5);
	StaticCode.show();
	}
	//每个应用程序中都有共性的功能，可以进行复用
	public static int getMax(int[] arr){
	int max=0;
	for(int x=1;x<arr.length;x++){
		if(arr[x]>arr[max])
			max=x;
	}
	return arr[max];
	}
}
