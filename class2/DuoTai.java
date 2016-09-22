package class2;
/*多态：可以理解为事物存在的多种体现形态
 * 人：男，女
 * 动物：猫 ，狗
 * 猫 x=new 猫（）；
 * 动物 x=new 猫（）；
 *提高代码的扩展性
 *多态的前提：类与类有关系，要么继承，要么实现
 *存在覆盖
 *弊端：只能使用父类的引用访问父类中的成员
 */
abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{
	public void eat(){
		System.out.println("eat fish");}
		public void catchMouse(){
			System.out.println("catch mouse");
		}
	
}
class Dog extends Animal{
	public void eat(){
		System.out.println("eat bone");
	}
	public void eatBone(){
		System.out.println("eatBone");
	}
}



public class DuoTai {
	public static void main(String[] args){
		Cat c=new Cat();
		c.eat();
		Dog d=new Dog();
		d.eat();
		Cat c1=new Cat();
		function(c1);
		function(new Dog());
		//向下转型,如何调用子类特有方法
		Animal a=new Dog();
		Dog d1=(Dog)a;
		d1.eatBone();
		/*不可以将父类对象转成子类类型
		 * 我们能转的是父类引用指向了自己的子类对象时，该应用可以被提升，
		 * 也可以被强制转换，多态自始至终都是子类在做着变化
		 * Animal a=new Animal();
		//Cat c=(Cat)a;
		错误*/
	}
	public static void function(Cat c){
		c.eat();
	}
	public static void function(Animal c){
		//animal c=new Dog();类型提升，向上转型
		c.eat();
		//判断是不是某类
		if(c instanceof Cat){
			Cat a=(Cat)c;
			a.catchMouse();
		}
	}
}
