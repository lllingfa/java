import java.util.concurrent.locks.*;
/*JDK.5中提供了多线程升级解决方案。
 * 将同步synchronized 替换成lock操作
 * 将对象中的wait，notify notifyall，替换了condition对象
 * 该对象可以Lock锁，进行获取
 * 在该例中，实现了本方只唤醒对方操作*/


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
			while(flag)   //全部等待，应该唤醒对方,if时没有判断flag用while
			
				con_pro.await();
			this.name=name+"--"+count++;
			System.out.println(Thread.currentThread().getName()+"...生产者.."+this.name);
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
		System.out.println(Thread.currentThread().getName()+"...消费者......"+this.name);
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
				res.set("+商品+");
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

