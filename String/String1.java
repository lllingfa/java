package String;
/*String类用于描述字符串事物
 * 那么它就提供了多个方法对字符串进行操作。
 * 常见的操作有哪些？
 * "abcd"
 * 1.获取
 *  1,1字符串中包含的字符数，也就是字符串的长度
 *      int length():获取长度
 *  1.2 根据位置获取位置上的某个字符
 *      char(int index)
 *  1.3 根据字符获取位置
 *  int indexof(int ch):返回的是ch在字符串中第一次出现的位置
 *  int indexof(int ch,int fromIndex):从fromIndex指定位置开始，获取ch在字符串中的出现的
 *  位置
 *  int indexof(str str)
 *  int indexof(str str,int fromIndex):
 * 2.判断
 * 2.1字符串中是否包含一个子串
 * contains(CharSequence s)
 * 特殊之处：indexof(str):可以索引str第一次出现的位置，如果返回-1，表示不存在
 * 可以用来判断是否包含
 * 2.2字符串中是否有内容
 * isEmpty() ：原理：判断长度是否为0
 * 2.3字符串中是否以指定内容开头
 * startsWith(String prefix)
 * 2.4字符串中是否以指定内容结尾
 * endsWith(String suffix) 
 * 2.5判断字符串内容是否相同，复写了equals方法
 * equals(Object anObject)
 * 2.6判断字符串内容是否相同，并忽略大小写
 * equalsIgnoreCase(String anotherString)
 * 3.转换
 * 3.1将字符数组转成字符串
 * String(char[] value) 
 * String(char[] value, int offset, int count)
 * 静态方法
 * copyValueOf(char[] data, int offset, int count)  
 * copyValueOf(char[] data)
 * valueOf(char[] data) 
 * 3.2将字符串转成字符数组
 * toCharArray() 
 * 3.3 将字节数组转成字符串
 * String(byte[] bytes) 
 * String(byte[] bytes, int offset, int length) 
 * 
 * 3.4将字符串转成字节数组
 * getBytes(String charsetName) 
 * 3.5将基本数据类型转成字符串
 * valueOf(double d)
 * 转换过程中，可以指定编码表
 * 4.替换
 * replace(char oldChar, char newChar)
 * 5.切割
 * split(String regex) 
 * 6.子串
 * substring(int beginIndex)
 * subSequence(int beginIndex, int endIndex)
 * 7.转换
 * 7.1 将字符串转成大写或者小写
 * toUpperCase() 
 * toLowerCase()
 * 7.2将字符串两端的多个空格去除
 * trim() 
 * 7.3对两个字符串进行自然顺序的比较
 * compareTo(String anotherString)
 * */
public class String1 {
	public static void method_7(){
		String s="    Hello Java    ";
		sop(s.toLowerCase());
		sop(s.toUpperCase());
		sop(s.trim());
		String s1="abc";
		String s2="aea";
		sop(s1.compareTo(s2));//大于返回正数，等于0，小于负数
	}
	public static void method_sub(){
		String s="abcdef";
		sop(s.substring(2));//从指定位置开始到结尾，如果角标不存在，会出现字符串角标越界异常
		sop(s.substring(2, 4));//包含头，不包含尾。s.substring(0, s.length)
	}
	public static void method_split(){
		String s="zhangsan,lisi,wangwu";
		String[] arr=s.split(",");
		for(int x=0;x<arr.length;x++){
			sop(arr[x]);
		}
	}
	public static void method_replace(){
		String s="hello java";
		String s1=s.replace('q', 'n');//如果要替换的字符不存在，返回的还是原串
		String s2=s.replace("java", "world");
		sop(s2);
	}
	public static void method_trans(){
		char[]arr={'a','b','c','d','e','f'};
		String s=new String(arr,0,3);
		sop("s="+s);
		String s1="ahsdfiah";
		char[] chs=s1.toCharArray();
		for(int x=0;x<chs.length;x++){
			sop("chs  "+chs[x]);
		}
	}
	public static void method_is(){
		String str="ArrayDemo.java";
		sop(str.startsWith("Array"));
		sop(str.endsWith(".java"));
		sop(str.contains("Demo"));
	}
	public static void method_get(){
		String str="abcdefghdsk";
		//长度
		sop(str.length());
		//第4位的值
		sop(str.charAt(4));
		
		sop(str.indexOf('a', 4));//如果没有找到返回-1
		//反向索引一个字符出现的位置
		sop(str.lastIndexOf("a"));
	}
	public static void main(String[] args){
		 method_trans();
		method_is();
method_get();
method_split();
method_sub();

method_replace();method_7();
/*String s1="abc";//s1是一个类类型变量，“abc"是一个对象
//字符串最大特点：一旦被初始化就不可以改变
String s2=new String("abc");

//s1="xxx";
s1与s2有何不同
 * s1一个对象
 * s2两个对象
String s3="abc";
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1.equals(s2));//复写了equals方法，用于判断字符串是否相同
*/}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}