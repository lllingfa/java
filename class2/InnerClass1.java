package class2;
/*�ڲ���ķ��ʹ���
 * 1.�ڲ�����Է����ⲿ��ĳ�Ա������˽��
 * ֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г�����һ���ⲿ������ã�
 * �ⲿ��.this
 * 2.�ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������
 * ���ʸ�ʽ��
 * 1.Outer.Inner in=new Outer().new Inner();
 * 2.���ڲ����ڳ�Աλ���ϣ����Ա���Ա���η�����
 * ����,private,static:���ڲ��౻static���κ�ֻ��ֱ�ӷ����ⲿ���еľ�̬��Ա
 * ���ʾ���
 * �ⲿ�������У����ֱ�ӷ���static�ڲ��ľ�̬��Ա
 * Outer.Inner.funtion()
 * ע�⣺���ڲ����ж����˾�̬��Ա�����ڲ��������static
 * ���ⲿ���еľ�̬���������ڲ���ʱ���ڲ���Ҳ������static��
 * */
class Outer{
	int x=3;
	class Inner{
		//int x=4;
		void funtion(){
			//int x=6;
			//��ӡ6
			System.out.println("inner:"+x);
			//��ӡ4
//			System.out.println("inner:"+this.x);
			//��ӡ3
//			System.out.println("inner:"+Outer.this.x);
		}
	}
	
	void method()
	{   Inner in=new Inner();
	    in.funtion();
		//System.out.println(x);
	}
	/*�ڲ��ඨ���ھֲ�ʱ
	 * 1.�����Ա���Ա���η�����
	 * 2.����ֱ�ӷ����ⲿ��ĳ�Ա����Ϊ�������ⲿ�������
	 * ���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ���final���ε�*/
	void method1(){
		final int y=4;
		class Inner1{
			void function(){
				System.out.println(Outer.this.x+y);
			}
			
		}
		new Inner1().function();
	}
}
class Body{
	private class heart{
		
	}
	public void show(){
		new heart();
	}
}


public class InnerClass1 {
	public static void main(String[] args){
		Outer out =new Outer();
		out.method();
		//ֱ�ӷ����ڲ����еĳ�Ա
		Outer.Inner in=new Outer().new Inner();
		in.funtion();
		new Outer().method1();
		//
		
	}
}
