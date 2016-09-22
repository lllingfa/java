package class2;
/*��������г�����ͬ���ܣ����ǹ������岻ͬ�����ǿ��Խ������ϳ�ȡ��ֻ��ȡ
 * ���ܶ��壬������ȡ��������
 * ���ܴ���������Ķ���
 * �ص�
 * 1.���󷽷�һ���ڳ�������
 * 2.���󷽷��ͳ����඼���뱻abstract�ؼ�������
 * 3.������new����������Ϊ����û����
 * 4.�������еķ���Ҫ�����ã����ิд���󷽷��������������
 * �������ֻ�����˲��ַ�������ô���໹�Ǹ������� */
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

//ʵ��
/*Ա����;�����*/
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
