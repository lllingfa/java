package class2;
/*当多个类中出现相同功能，但是功能主体不同，这是可以进行向上抽取，只抽取
 * 功能定义，而不抽取功能主体
 * 不能创建抽象类的对象
 * 特点
 * 1.抽象方法一定在抽象类中
 * 2.抽象方法和抽象类都必须被abstract关键字修饰
 * 3.不能用new创建对象，因为调用没意义
 * 4.抽象类中的方法要被调用，子类复写抽象方法，建立子类调用
 * 如果子类只覆盖了部分方法，那么子类还是个抽象类 */
abstract class  Student3{
	abstract void study();
}
class BaseStudent  extends Student3{
	void study(){
		System.out.println("Base study");
		
	}
}
class AdvStudent extends Student3{
void study(){
	System.out.println("adv study");
	}
}

//实验
/*员工类和经理类*/
abstract class Employee{
	private String name;
	private String id;
	private double pay;
	Employee(String name,String id,double pay){
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	public abstract void work();
}
class Manager extends Employee{
	private int bonus;
	Manager(String name,String id,double pay,int bonus){
		super(name,id,pay);
		this.bonus=bonus;
	}
	public void work(){
		System.out.println("manager work");
	}
}

public class Abstract {
	public static void main(String[] args){
		new BaseStudent().study();
	}
	
}
