package class2;
/*�ӿ�
 * ���������еķ������ǳ����Եģ���ô�����ýӿڱ�ʾ
 * �ӿڶ���ʱ����ʽ�ص㣺
 * 1.�ӿ��г������壺���������󷽷�
 * ������public static final
 * ������public abstract
 * �ӿ��еĳ�Ա����public��
 * �ӿ��ǲ����Դ�������ģ���Ϊ�г��󷽷�����Ҫ������ʵ�֣�����Խӿ��е�
 * ���󷽷�ȫ��ʵ�����������ǳ�����
 * �ӿڿ��Ա����ʵ��
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
