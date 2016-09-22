package class2;
/*匿名内部类：
 * 1.匿名内部类的前提：
 * 必须继承一个类或者实现接口
 * 格式：new 父类或者接口(){定义子类的内容}
 * 匿名内部类就是一个匿名子类对象
 * 匿名类不要超过3个*/

abstract class AbsDemo{
	abstract void show();
	
}
class Outer1{
	int x=3;
	/*class Inner2 extends AbsDemo{
		void show(){
			System.out.println("show:"+x);
		}
		void abc(){
		}
	}*/
	public void function(){
		//new Inner2().show();匿名内部类
		new AbsDemo(){
			void show(){
				System.out.println("show:"+x);
			}
			void abc(){
				System.out.println("haha");
			}
	}.show();
		
		}
}

public class InnerClass2 {
	public static void main(String[] args){}
}
