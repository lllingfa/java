package class2;
/*��������ȡ������������������
 * 
 * 
 * �̳е��ŵ�
1.����˴���ĸ�����
2.��������֮������˹�ϵ�����������ϵ�������˶�̬�����ԡ�
 * ע�⣺ǧ��ҪΪ�˻�ȡ������Ĺ��ܣ��򻯴�����̳�
 * ������������֮����������ϵ�ſ��Լ̳С�������ϵis a 
 * �й��Կ��Բ�ֱ�Ӽ̳У�������ȡ�󶼼̳У�������
 * java�����У�ֻ֧�ֵ��̳У���֧�ֶ�̳У���Ϊ��̳����״�����ȫ����
 * ����һ�ַ�ʽʵ�֡�Java֧�ֶ��̳У�Ҳ����һ���̳���ϵ
 * ���ʹ�ü̳���ϵ�еĹ���
 * 1.�Ȳ��ĸ������������Ϊ�й��Թ���
 * �������ʱ�������࣬�п��ܸ��಻��ֱ�ӵ���
 * ����Ҳ�����ṩ����Ĺ���
 * ��Ҫ���ĸ��๦�ܣ������������ʹ�ù���
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
/*�Ӹ�����ֺ����Ա���ص㣺
 * ���г�Ա��
 * 1.����
 * ��������г��ַ�˽�е�ͬ������ʱ��������ʱ����еı�����this,������ʸ����е�
 * ������super��ʹ����this����һ�¡�
 * 2.����
 * �������������븸��һ��ʱ���������д�����ǣ�����ͬ���ĺ���ʱ����ͬ�Ĺ���ʱ
 * ��ֱ�Ӹ��� 
 * ���า�Ǹ��࣬����Ȩ�޴��ڸ���Ȩ�ޣ��ſ��Ը���
 * ��ֻ̬�ܸ��Ǿ�̬
 * ���أ���ͬ�Ĳ����б�
 * ��д ���Ӹ��෽��Ҫһ��
 * 3.���캯��*/

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
		//System.out.println(super.num);//��this���Ӧ
		System.out.println("zi show");
	}
}
class Tel{
	void show(){
		System.out.println("number");//��������߳�����չ��,����ԭ����
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
/*��һ�ֹ�ϵ����Ϲ�ϵ
 * �ۼ���has a
 * �ۺϣ����-��Ա
 * ��ϣ������ܣ�������һ����
 * */

public class Jicheng {
	public static void main(String[] args){
		Zi z=new Zi();
		z.show();
//		System.out.println(z.num+"..."+z.num1);
	}
}
