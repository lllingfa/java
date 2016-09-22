package class2;

/*final:最终。作为一个修饰符
 * 1.可以修饰类，函数，变量
 * 2.被final修饰的类不可以被继承，继承影响封装性
 * 3.被final修饰的方法不可以被复写
 * 4.被final修饰的变量是一个常量只能赋值一次，既可以修饰成员变量，也可以修饰
 * 局部变量,对固定值取名字，不需要改变的加上final修饰
 * 常量的书写规范所有字母都大写，如果有多个单词组成，单词间用_连接
 * 
 * */

final class Demo
{
	final int x=3;
	public static final double PI=3.14;//静态可以共享，public不要对象名直接
	//调用
	 //对不复写的加final
	final void show(){
		final int y=4;
	}
	void show2(){
}
}
//错误
/*class SubDemo extends Demo{
	
}*/


public class Final {
	public static void main(String[] args){
		}
	}

