package class2;

/*//��Ϊ��Ŀ�л�����������⣬java�в�δ���з�װ����
 * ���Զ�����Щ���е�������԰���java�Ķ�����ķ�װ��˼��
 * �����е���������Զ�����쳣��װ
���󣺳���Ҳ������Ϊ����
���ں����ڲ�����throw���׳��쳣���󣬱��봦��
Ҫô���ڲ�try catch����
Ҫô�ں����������õ����ߴ���
throwsʹ���ں����ϣ�����쳣��
throwʹ���ں����ڣ�����쳣����
*/

class FuShuException  extends Exception{
	/*private String msg;
	FuShuException(String msg){
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}*/
	private int value;
	FuShuException(String msg,int value){
		super(msg);
		this.value=value;
	}
	public int getValue(){
		return value;
	}
}
class Div1{
	int div(int a,int b)throws FuShuException
	{
		if(b<0)
			throw new FuShuException("����",b);//�ֶ��׳��쳣
		return a/b;
	}
}


public class Exception2 {
	public static void main(String[] args)//throws Exception
	{
		Div1 d=new Div1();
		try{
			int x=d.div(4, -1);
			System.out.println("x="+x);
		}
		catch(FuShuException e){
			System.out.println(e.toString());
			System.out.println("�������ָ�����"+e.getValue());
		}
		
		
		
	}
}
