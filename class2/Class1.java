package class2;
class Car{
	//成员变量
	String color="红色";
	int num=4;
	void run(){
		System.out.println(color+" "+num);
	}
	
}
class Person{
	private int age;
	private String name;
	//一般都要对应2个方法，封装，私有化，控制传入的数据
	public void setAge(int a){
		if(a>0&&a<130)
		age=a;
		else
			System.out.println("wrong");
	}
	public int getAge(){
		return age;
	}
	//构造函数，名称为类名，没有时系统会默认加入一个空参数的构造函数，自定义了就没有默认
	//可有多个，因为函数可以重载，对象已建立就运行，一个对象建立，构造函数运行一次
	//构造代码块，共性的内容
//	{
//		System.out.println("person run");
//	}
	Person(){
		System.out.println("person run");
	}
	Person(String name){//name为局部的值
		//name=name;this代表所在函数所属对象的引用
		this.name=name;
		System.out.println("person run "+name);
	}
	Person(String name,int age){
		//this.name=name;构造函数间调用用this,this函数只能放在构造函数第一行
		this(name);this.age=age;
		System.out.println("person run "+name+" age:"+age);
	}
	void speak(){
		System.out.println("age="+age);
	}
	public boolean compare(Person p){
			return this.age==p.age;
	}
	
}

public class Class1 {
	public static void main(String[] args){
/*//		Car c=new Car();
//		c.color="blue";
//		c.run();
//		Car c1=c;
//		c1.color="green";
//		c.run();
//		new Car().num=5;
//		Car q=new Car();
//		show(q);
//		q=null;
//		show(new Car());
*/	
		//初始化形式也不一样
		Person p=new Person();
		Person p1=new Person("lisi");
		Person p2=new Person("wangwu",10);
		Person p3=new Person("shdwui",25);
		boolean b=p2.compare(p3);
		System.out.println(b);
		//p.age=-20;
//		p.setAge(-20);
//		p.speak();
		}
	public static void show(Car c){
		c.num=3;
		c.color="black";
		c.run();
	}
	Person p2=new Person("wangwu",10);
}
