package class2;
/*接口
 * 当抽象类中的方法都是抽象性的，那么可以用接口表示
 * 接口定义时，格式特点：
 * 1.接口中常见定义：常量，抽象方法
 * 常量：public static final
 * 方法：public abstract
 * 接口中的成员都是public的
 * 接口是不可以创建对象的，因为有抽象方法，需要有子类实现，子类对接口中的
 * 抽象方法全都实例化，否则是抽象类
 * 接口可以被类多实现
 * */

interface Inter{
	public static final int NUM=3;
	public abstract void show();
}
interface InterA extends Inter{
	public abstract void methods();
}
class Demo1{
	public void function(){
		
	}
}
class Test extends Demo1 implements Inter,InterA{
	public void show(){}
	public void methods(){}
}
public class Interface {
	public static void main(String[] args){
		Test t=new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);
	}
}
