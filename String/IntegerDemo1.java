package String;
/*�����������Ͱ�װ�ɶ���
 * ������ã�
 * ���ǻ��ڻ����������ͺ��ַ�������֮����ת��
 * ������������ת���ַ���
 * ������������+""
 * ������������.toString(������������)
 * �ַ���ת�ɻ�����������
 * parseInt(String s)
 * ʮ����ת���������ƣ���������ת��ʮ����
 * toHexString����
 * JDK1.5������
 * */
public class IntegerDemo1 {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void method(){
sop("int max:"+Integer.MAX_VALUE);
		
		//���ַ�����������
		int num=Integer.parseInt("123");//���봫�����ָ�ʽ���ַ���
		sop("num"+(num+4));
		sop(Integer.toHexString(60));
		int num1=Integer.parseInt("110",2);//���봫�����ָ�ʽ���ַ���
		sop("num1: "+(num1));
		Integer x=new Integer("123");
		Integer y=new Integer(123);
		sop("x==y:"+(x==y));
		sop("x.equals(y):"+x.equals(y));
	}
	public static void main(String[] args){
		Integer x=4;//�Զ�װ��
		sop(x);
		x=x+4;//����+4���������Զ����䡣�����int���͡���2���мӷ����㣬��װ�丳��x
		//x.intvalue()
		sop(x);
		Integer m=128;
		Integer n=128;
		sop("m==n:"+(m==n));
		Integer a=127;
		Integer b=127;
		sop("a==b:"+(a==b));//��Ϊa,bָ����ͬһ��Integer����
		//��ֵ��byte��Χ��ʱ�����������ԣ������ֵ�Ѿ����ڣ����Ὺ���¿ռ�
		
		
	}
}
