package class3;
/*异常体系的特点：
 * 异常体系中的所有类以及建立的对象都具有可抛性
 * 也就是被throw和throws关键字所操作
 * 只有异常体系具备这个特点
 * throw定义在函数内，用于抛出异常对象
 * throws定义在函数上，用于抛出异常类，可以抛出多个用逗号隔开
 * 当函数内容有Throw抛出异常等一下，并未进行try处理，必须在函数上声明，都在编译
 * 时失败
 * 注意RuntimeException除外，即可以不用声明
 * 
 * 
 * 
 * 异常可以抛，可以try
 * 编译异常，如果没有处理，编译失败
 * 被标识，可以处理
 * 运行异常：
 * 编译时不处理，编译器不检查
 * 发生时，建议不处理，让程序停止，需要对代码修正
 * System.exit(0)时finally才处理不到
 * 
 * 自定义异常：
 * 定义类继承Exception或者RuntimeException
 * 1.为了让该自定义类具备可抛性
 * 2.让该类具备操作异常的共性方法
 * 可以用父类的构造函数
 * class MyException extends Exception{
 * MyException(String message){
 * super.message()
 * }
 * 
 * 
 * 好处：
 * 1.将问题封装成对象
 * 2.将正常流程代码和问题处理代码相分离，方便与阅读
 * */
public class Exception6 {
	public static void main(String[] args)//throws Exception
	{
		
	}
}
