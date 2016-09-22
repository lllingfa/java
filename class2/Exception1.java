package class2;
/*异常：是程序在运行时出现的不正常情况
 * 由来：问题也是现实生活中的一个具体的事物，也可以通过java的类进行描述
 * 并封装成对象
 * 对于问题的划分：2种，一种是严重的问题，一种非严重的问题
 * 严重的，通过Error类进行描述，一般不编写针对性的代码进行处理
 * 对于非严重的，通过Exception类进行描述，可以使用针对性的处理方法进行处理
 * Throwable :Error Exception
 * 特有的语句进行处理
 * try
 * {需要被检测的代码}
 * catch(异常类 变量){
 * 处理异常的代码
 * }
 * finally{一定会执行的语句}
 * 对多异常的处理
 * 1.声明异常时，建议声明更为具体的异常，这样处理的可以更具体
 * 2.对方声明几个异常，就对应有几个catch块
 * 如果多个catch块中的异常出现继承关系，父类异常catch块放下面，不要定义多余的
 * catch块
 * 建议在进行catch处理时，catch中一定要定义具体处理方式，不要简单的定义一句
 * e.printStcakTrace()以及输出语句*/

class Div{
	int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException
	//在功能上通过throws的关键字声明
	//该功能有可能出现问题
	{   int[] arr=new int[a];
	     System.out.println(arr[4]);
		return  a/b;
	}
}


public class Exception1 {
	public static void main(String[] args)//throws Exception
	{
		Div d=new Div();
		
		try{
			int x1=d.div(4, 0);
		System.out.println("x="+x1+" over");}
		catch(ArithmeticException e){//Exception e=new ArithmeticException();
			System.out.println("除零了");
			System.out.println(e.getMessage());//异常名称
			e.printStackTrace();//异常名称，异常信息，异常位置
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("越界了");
			System.out.println(e.toString());
		}
		
		
		
	}
}
