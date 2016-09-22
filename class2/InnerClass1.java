package class2;
/*内部类的访问规则：
 * 1.内部类可以访问外部类的成员，包括私有
 * 之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，
 * 外部类.this
 * 2.外部类要访问内部类，必须建立内部类对象
 * 访问格式：
 * 1.Outer.Inner in=new Outer().new Inner();
 * 2.当内部类在成员位置上，可以被成员修饰符修饰
 * 比如,private,static:当内部类被static修饰后，只能直接访问外部类中的静态成员
 * 访问局限
 * 外部其他类中，如何直接访问static内部的静态成员
 * Outer.Inner.funtion()
 * 注意：当内部类中定义了静态成员，该内部类必须是static
 * 当外部类中的静态方法访问内部类时，内部类也必须是static的
 * */
class Outer{
	int x=3;
	class Inner{
		//int x=4;
		void funtion(){
			//int x=6;
			//打印6
			System.out.println("inner:"+x);
			//打印4
//			System.out.println("inner:"+this.x);
			//打印3
//			System.out.println("inner:"+Outer.this.x);
		}
	}
	
	void method()
	{   Inner in=new Inner();
	    in.funtion();
		//System.out.println(x);
	}
	/*内部类定义在局部时
	 * 1.不可以被成员修饰符修饰
	 * 2.可以直接访问外部类的成员，因为还持有外部类的引用
	 * 但是不可以访问它所在的局部中的变量，只能访问final修饰的*/
	void method1(){
		final int y=4;
		class Inner1{
			void function(){
				System.out.println(Outer.this.x+y);
			}
			
		}
		new Inner1().function();
	}
}
class Body{
	private class heart{
		
	}
	public void show(){
		new heart();
	}
}


public class InnerClass1 {
	public static void main(String[] args){
		Outer out =new Outer();
		out.method();
		//直接访问内部类中的成员
		Outer.Inner in=new Outer().new Inner();
		in.funtion();
		new Outer().method1();
		//
		
	}
}
