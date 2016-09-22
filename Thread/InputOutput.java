/*线程间通讯
 * 其实就是多个线程在操作同一个资源
 * 但是操作的动作不同
 * wait(),notify() ,notifyAll()都使用在同步中，因为要对持有监视器（锁）的线程操作
 * 所以要使用在同步中，因为只有同步才具有锁的概念
 * 为什么要定义在Object中
 * 因为这些方法在操作同步中的线程时，都必须要标识它们所操作线程只有的锁
 * 只有同一个锁上的被等待线程，可以被同一个锁上的notify唤醒
 * 不可以对不同锁上的线程进行唤醒
 * 必须是同一把锁
 * 而锁是被任意对象调用，在对象中*/
class Res{
	String name;
	String sex;
	boolean flag=false;
	public synchronized void set(String name,String sex){
		if(flag)
			try{this.wait();}catch(Exception e){}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
	}
	public synchronized void out(){if(!flag)
		try{this.wait();}catch(Exception e){}

		System.out.println(name+"..."+sex);
		flag=false;
		this.notify();
	}
}

class Input implements Runnable{
	private Res r;
	
	Input(Res r){
		this.r=r;
	}
	public void run(){
		int x=0;
		while(true){
			//synchronized(Input.class){
				
			if(x==0){
		/*r.name="mike";
		r.sex="man";*/
				r.set("mike", "man");}
			else{
				/*r.name="丽丽";
				r.sex="女女";*/
				r.set("丽丽", "女女");
			}
			x=(x+1)%2;
			
	}}
}

class Output implements Runnable{
	//Res r= new Res();
   private Res r;
	
	Output(Res r){
		this.r=r;
	}
	public void run(){
		while(true){
			//synchronized(Input.class){
						//System.out.println(r.name+"...."+r.sex);
		r.out();
	}
		}
}
public class InputOutput {
	public static void main(String[] args)
	{
Res r=new Res();
new Thread(new Input(r)).start();
new Thread(new Output(r)).start();
/*Input in=new Input(r);
Output out=new Output(r);
Thread t1=new Thread(in);
Thread t2=new Thread(out);
  t1.start();
   t2.start();*/
}}
//noyifyAll();