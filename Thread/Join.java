/*join:
 * 当A线程执行到了B线程的.join（）方法时，A就会等待，等B执行完后再执行
 * 独立运算单独封装为线程*/
class Demo implements Runnable{
	public void run(){
		for(int x=0;x<70;x++)
			System.out.println(Thread.currentThread().toString()+"..."+x);
		Thread.yield();//释放执行权，交替进行
	}
}
public class Join {
	public static void main(String[] args) throws InterruptedException{
		Demo d=new Demo();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		//t1.join();//抢到主线程,t1死后main才开始
		t2.start();
		//t1.join();
		for(int x=0;x<80;x++)
			System.out.println("main..."+x);
	
	}
}
