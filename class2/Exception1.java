package class2;
/*�쳣���ǳ���������ʱ���ֵĲ��������
 * ����������Ҳ����ʵ�����е�һ����������Ҳ����ͨ��java�����������
 * ����װ�ɶ���
 * ��������Ļ��֣�2�֣�һ�������ص����⣬һ�ַ����ص�����
 * ���صģ�ͨ��Error�����������һ�㲻��д����ԵĴ�����д���
 * ���ڷ����صģ�ͨ��Exception���������������ʹ������ԵĴ��������д���
 * Throwable :Error Exception
 * ���е������д���
 * try
 * {��Ҫ�����Ĵ���}
 * catch(�쳣�� ����){
 * �����쳣�Ĵ���
 * }
 * finally{һ����ִ�е����}
 * �Զ��쳣�Ĵ���
 * 1.�����쳣ʱ������������Ϊ������쳣����������Ŀ��Ը�����
 * 2.�Է����������쳣���Ͷ�Ӧ�м���catch��
 * ������catch���е��쳣���ּ̳й�ϵ�������쳣catch������棬��Ҫ��������
 * catch��
 * �����ڽ���catch����ʱ��catch��һ��Ҫ������崦��ʽ����Ҫ�򵥵Ķ���һ��
 * e.printStcakTrace()�Լ�������*/

class Div{
	int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException
	//�ڹ�����ͨ��throws�Ĺؼ�������
	//�ù����п��ܳ�������
	{   int[] arr=new int[a];
	     System.out.println(arr[4]);
		return  a/b;
	}
}


public class Exception1 {
	public static void main(String[] args)//throws Exception
	{
		Div d=new Div();
		
		try{
			int x1=d.div(4, 0);
		System.out.println("x="+x1+" over");}
		catch(ArithmeticException e){//Exception e=new ArithmeticException();
			System.out.println("������");
			System.out.println(e.getMessage());//�쳣����
			e.printStackTrace();//�쳣���ƣ��쳣��Ϣ���쳣λ��
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Խ����");
			System.out.println(e.toString());
		}
		
		
		
	}
}
