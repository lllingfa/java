package String;
/*基本数据类型包装成对象
 * 最常见作用，
 * 就是基于基本数据类型和字符串类型之间做转换
 * 基本数据类型转成字符串
 * 基本数据类型+""
 * 基本数据类型.toString(基本数据类型)
 * 字符串转成基本数据类型
 * parseInt(String s)
 * 十进制转成其他进制，其他进制转成十进制
 * toHexString（）
 * JDK1.5新特性
 * */
public class IntegerDemo1 {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void method(){
sop("int max:"+Integer.MAX_VALUE);
		
		//将字符串传成整数
		int num=Integer.parseInt("123");//必须传入数字格式的字符串
		sop("num"+(num+4));
		sop(Integer.toHexString(60));
		int num1=Integer.parseInt("110",2);//必须传入数字格式的字符串
		sop("num1: "+(num1));
		Integer x=new Integer("123");
		Integer y=new Integer(123);
		sop("x==y:"+(x==y));
		sop("x.equals(y):"+x.equals(y));
	}
	public static void main(String[] args){
		Integer x=4;//自动装箱
		sop(x);
		x=x+4;//对象+4：进行了自动拆箱。变成了int类型。和2进行加法运算，再装箱赋给x
		//x.intvalue()
		sop(x);
		Integer m=128;
		Integer n=128;
		sop("m==n:"+(m==n));
		Integer a=127;
		Integer b=127;
		sop("a==b:"+(a==b));//因为a,b指向了同一个Integer对象
		//数值在byte范围内时，对于新特性，如果数值已经存在，不会开辟新空间
		
		
	}
}
