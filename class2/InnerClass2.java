package class2;
/*�����ڲ��ࣺ
 * 1.�����ڲ����ǰ�᣺
 * ����̳�һ�������ʵ�ֽӿ�
 * ��ʽ��new ������߽ӿ�(){�������������}
 * �����ڲ������һ�������������
 * �����಻Ҫ����3��*/

abstract class AbsDemo{
	abstract void show();
	
}
class Outer1{
	int x=3;
	/*class Inner2 extends AbsDemo{
		void show(){
			System.out.println("show:"+x);
		}
		void abc(){
		}
	}*/
	public void function(){
		//new Inner2().show();�����ڲ���
		new AbsDemo(){
			void show(){
				System.out.println("show:"+x);
			}
			void abc(){
				System.out.println("haha");
			}
	}.show();
		
		}
}

public class InnerClass2 {
	public static void main(String[] args){}
}
