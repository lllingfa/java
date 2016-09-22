import java.util.concurrent.locks.*;
/*JDK.5���ṩ�˶��߳��������������
 * ��ͬ��synchronized �滻��lock����
 * �������е�wait��notify notifyall���滻��condition����
 * �ö������Lock�������л�ȡ
 * �ڸ����У�ʵ���˱���ֻ���ѶԷ�����*/


class Resouce1{
	private String name;
	private int count =1;
	private boolean flag=false;
	private Lock lock=new ReentrantLock();
	private Condition con_pro=lock.newCondition();
	private Condition con_con=lock.newCondition();
	public  void set(String name)throws InterruptedException{
		lock.lock();
		try{
			while(flag)   //ȫ���ȴ���Ӧ�û��ѶԷ�,ifʱû���ж�flag��while
			
				con_pro.await();
			this.name=name+"--"+count++;
			System.out.println(Thread.currentThread().getName()+"...������.."+this.name);
			flag=true;
			con_con.signal();
			}
		finally{lock.unlock();}
		
	}
	public void out()throws InterruptedException{
		lock.lock();
		try{
		while(!flag)
			con_con.await();
		System.out.println(Thread.currentThread().getName()+"...������......"+this.name);
		flag=false;
		con_pro.signalAll();
	}
		finally{lock.unlock();
			}
		}
}

class Producer1 implements Runnable{
	private Resouce1 res;
	Producer1(Resouce1 res){
		this.res=res;
	}
	public void run(){
		while(true){
			try {
				res.set("+��Ʒ+");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Consumer1 implements Runnable{
	private Resouce1 res;
	Consumer1(Resouce1 res){
		this.res=res;
	}
	public void run(){
		while(true){
			try {
				res.out();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}



public class ProducerConsumer2 {
	public static void main(String[] args)
	{Resouce1 r=new Resouce1();
	new Thread(new Producer1(r)).start();
	new Thread(new Consumer1(r)).start();
	new Thread(new Producer1(r)).start();
	new Thread(new Consumer1(r)).start();
	}
}

