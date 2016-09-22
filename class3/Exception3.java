package class3;



/*//因为项目中会出现特有问题，java中并未进行封装描述
 * 所以对于这些特有的问题可以按照java的对问题的封装的思想
 * 将特有的问题进行自定义的异常封装
需求：除数也不可以为负数
当在函数内部出现throw的抛出异常对象，必须处理
要么在内部try catch处理
要么在函数上声明让调用者处理
throws使用在函数上，后跟异常类
throw使用在函数内，后跟异常对象
finally代码块：定义一定执行的代码，通常用于关闭资源
*/

class FuShuException  extends Exception{
	/*private String msg;
	FuShuException(String msg){
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}*/
	private int value;
	FuShuException(String msg,int value){
		super(msg);
		this.value=value;
	}
	public int getValue(){
		return value;
	}
}
class Div1{
	int div(int a,int b)throws FuShuException
	{
		if(b<0)
			throw new FuShuException("负数",b);//手动抛出异常
		return a/b;
	}
}


public class Exception3 {
	public static void main(String[] args)//throws Exception
	{
		Div1 d=new Div1();
		try{
			int x=d.div(4, -1);
			System.out.println("x="+x);
		}
		catch(FuShuException e){
			System.out.println(e.toString());
			System.out.println("除数出现负数了:"+e.getValue());
			
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("over");
		
	}
}
