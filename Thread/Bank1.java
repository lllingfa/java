

/*ͬ���ĺ���ʹ�õ���this
 * ���ͬ����������̬���κ�ʹ�õ�������this
 * ��̬���ڴ�ʱ���ڴ���û�б�����󣬵���һ���и����Ӧ���ֽ����ļ�����
 * ����.class
 * ������*/
class Bank{
	private static int sum;
	Object obj=new Object();
	public static synchronized void add(int n){
		//synchronized(obj){
		sum=sum+n;
		try{Thread.sleep(10);}
				catch(Exception e){}
		System.out.println("sum="+sum);
	}//}
}

class Cus implements Runnable{
	//private Bank b=new Bank();
	public void run(){
		for(int x=0;x<3;x++){
			Bank.add(100);
		}
	}
}



public class Bank1 {
	public static void main(String[] args){
		Cus c=new Cus();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		
	}
}
