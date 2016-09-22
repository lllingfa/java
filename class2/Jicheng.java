package class2;
/*将共性提取出来，单独进行描述
 * 
 * 
 * 继承的优点
1.提高了代码的复用性
2.让类与类之间产生了关系，有了这个关系，才有了多态的特性。
 * 注意：千万不要为了获取其他类的功能，简化代码而继承
 * 必须是类与类之间有所属关系才可以继承。所属关系is a 
 * 有共性可以不直接继承，可以提取后都继承，往上走
 * java语言中，只支持单继承，不支持多继承，因为多继承容易带来安全隐患
 * 用另一种方式实现。Java支持多层继承，也就是一个继承体系
 * 如何使用继承体系中的功能
 * 1.先查阅父类的描述，因为有共性功能
 * 具体调用时，最子类，有可能父类不能直接调用
 * 子类也可以提供更多的功能
 * 需要查阅父类功能，创建子类对象使用功能
 * Class C{
 * void demo1(){}
 * }
 * 
 * 
 * ClassA extends Class C
 * {void demo2(){}
 * }
 * 
 * */


class Person21{
	String name;
	int age;
}
class Student extends Person21
{
	
	void study(){
		System.out.println("good study");
	}
}
/*子父类出现后，类成员的特点：
 * 类中成员：
 * 1.变量
 * 如果子类中出现非私有的同名变量时，子类访问本类中的变量用this,子类访问父类中的
 * 变量用super，使用与this几乎一致。
 * 2.函数
 * 当子类对象出现与父类一样时，会出现重写（覆盖），有同名的函数时，不同的功能时
 * 就直接覆盖 
 * 子类覆盖父类，必须权限大于父类权限，才可以覆盖
 * 静态只能覆盖静态
 * 重载：不同的参数列表
 * 重写 ：子父类方法要一样
 * 3.构造函数*/

class Fu
{
	 int num=4;
	 void show(){
		 System.out.println("fu show");
	 }
	}
class Zi extends Fu{
	int num=5;
	void show(){
		//System.out.println(super.num);//与this相对应
		System.out.println("zi show");
	}
}
class Tel{
	void show(){
		System.out.println("number");//升级，提高程序扩展性,不改原代码
	}
	void lingsheng(){
		
	}
}
class NewTel extends Tel{
	void show(){
		super.show();
		//System.out.println("number");
		System.out.println("name");
		System.out.println("picture");
	}
}
/*另一种关系：组合关系
 * 聚集：has a
 * 聚合：球队-球员
 * 组合：更紧密，手是人一部分
 * */

public class Jicheng {
	public static void main(String[] args){
		Zi z=new Zi();
		z.show();
//		System.out.println(z.num+"..."+z.num1);
	}
}
