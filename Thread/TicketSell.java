/*多个窗口同时卖票
 * 实现Runnable接口
 * 1.定义类实现Runnable接口
 * 2.覆盖Runnable的run方法
 * 将线程要实现的放在run方法下
 * 3.通过Thread建立线程对象
 * 4.将runnable对象作为传递给Thread构造函数
 * 方式：避免了单继承的局限性
 * 在定义线程时，建议使用实现方式
 * 2中方式的区别：
 * 继承Thread:线程存在Thread子类的方法中
 * 实现Runnable:接口的子类的run方法中
 * 通过运行，发现 有安全问题
 * 共享数据，一个线程对多条语句执行了一部分，还没有执行完，当一个线程
 * 加入执行，导致共享数据的错误
 * 解决方法：对多条操作共享的数据，让一个线程先执行完，执行过程中，其他
 * 线程不执行
 * 同步代码块synchronized(对象){
 * 需要被同步的代码}
 * 对象如何锁。持有锁的线程可以在同步中执行
 * 前提：
 * 1.多线程
 * 2.使用同一个锁
 * 弊端：需要判断锁，较为消耗资源
 */

class Ticket implements Runnable//extends Thread
{
	private  static int tick =100;
	Object obj=new Object();
	public void run(){
		while(true){
			show();
			/*synchronized(objTicket.classs){
			if(tick>0){
				try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread()+"sale:"+tick--);}*/
		}}
	
	public static synchronized void show(){
		if(tick>0){
			//try{Thread.sleep(10);}catch(Exception e){}
		System.out.println(Thread.currentThread()+"sale:"+tick--);}
		
	}
}

public class TicketSell {
	public static void main(String[] args){
		Ticket t=new Ticket();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		/*Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		Ticket t4=new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/
	}
}
