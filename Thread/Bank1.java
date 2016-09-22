

/*同步的函数使用的是this
 * 如果同步函数被静态修饰后，使用的锁不是this
 * 静态进内存时，内存中没有本类对象，但还一定有该类对应的字节码文件对象
 * 类名.class
 * 死锁：*/
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
