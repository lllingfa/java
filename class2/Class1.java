package class2;
class Car{
	//��Ա����
	String color="��ɫ";
	int num=4;
	void run(){
		System.out.println(color+" "+num);
	}
	
}
class Person{
	private int age;
	private String name;
	//һ�㶼Ҫ��Ӧ2����������װ��˽�л������ƴ��������
	public void setAge(int a){
		if(a>0&&a<130)
		age=a;
		else
			System.out.println("wrong");
	}
	public int getAge(){
		return age;
	}
	//���캯��������Ϊ������û��ʱϵͳ��Ĭ�ϼ���һ���ղ����Ĺ��캯�����Զ����˾�û��Ĭ��
	//���ж������Ϊ�����������أ������ѽ��������У�һ�������������캯������һ��
	//�������飬���Ե�����
//	{
//		System.out.println("person run");
//	}
	Person(){
		System.out.println("person run");
	}
	Person(String name){//nameΪ�ֲ���ֵ
		//name=name;this�������ں����������������
		this.name=name;
		System.out.println("person run "+name);
	}
	Person(String name,int age){
		//this.name=name;���캯���������this,this����ֻ�ܷ��ڹ��캯����һ��
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
		//��ʼ����ʽҲ��һ��
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
