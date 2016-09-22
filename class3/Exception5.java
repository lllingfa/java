package class3;
/*��һ��Բ�κͳ�����
 * �����Ի�����������������ַǷ�����ֵ����Ϊ��ȡ�����������
 * �������쳣��ʾ
 * �ֶ����������л������*/
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
			throw new NoValueException("���ַǷ�ֵ");
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
			throw  new NoValueException("���ַǷ�ֵ");
		this.radius=radius;
	}
	public void getArea(){
		System.out.println(radius*radius*PI);
	}
}


public class Exception5 {
	public static void main(String[] args)//throws Exception
	{
		
		//�����г�������
		/*Rec r=new Rec(-3,4);
		r.getArea();*/
		Circle c=new Circle(-1);
		
		
	}
}
