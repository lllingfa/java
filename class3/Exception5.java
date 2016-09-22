package class3;
/*有一个圆形和长方形
 * 都可以获得面积，对于面积出现非法的数值，视为获取面积出现问题
 * 问题用异常表示
 * 现对这个程序进行基本设计*/
interface Shape{
	void getArea();
}
class NoValueException extends RuntimeException

{NoValueException(String message){
	super(message);
}
	
}
class Rec implements Shape{
	private int len ,wid;
	Rec(int len,int wid){
		if(len<=0||wid<=0)
			throw new NoValueException("出现非法值");
		this.len=len;
		this.wid=wid;
	}
	public void getArea(){
		System.out.println(len*wid);
	}
}

class Circle implements Shape{
	private int radius;
	public static final double PI =3.14;
	Circle(int radius){
		if(radius<0)
			throw  new NoValueException("出现非法值");
		this.radius=radius;
	}
	public void getArea(){
		System.out.println(radius*radius*PI);
	}
}


public class Exception5 {
	public static void main(String[] args)//throws Exception
	{
		
		//运行中出现问题
		/*Rec r=new Rec(-3,4);
		r.getArea();*/
		Circle c=new Circle(-1);
		
		
	}
}
