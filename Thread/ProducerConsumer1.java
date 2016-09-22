

class Resouce{
	private String name;
	private int count =1;
	private boolean flag=false;
	public synchronized void set(String name){
		while(flag)   //全部等待，应该唤醒对方,if时没有判断flag用while
			try{wait();}catch(Exception e){}
		this.name=name+"--"+count++;
		System.out.println(Thread.currentThread().getName()+"...生产者.."+this.name);
		flag=true;
		this.notifyAll();
	}
	public synchronized void out(){
		while(!flag)
			try{wait();}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+"...消费者......"+this.name);
		flag=false;
		this.notifyAll();
	}
}

class Producer implements Runnable{
	private Resouce res;
	Producer(Resouce res){
		this.res=res;
	}
	public void run(){
		while(true){
			res.set("+商品+");
		}
	}
	
}
class Consumer implements Runnable{
	private Resouce res;
	Consumer(Resouce res){
		this.res=res;
	}
	public void run(){
		while(true){
			res.out();
		}
	}
	
}



public class ProducerConsumer1 {
	public static void main(String[] args)
	{Resouce r=new Resouce();
	new Thread(new Producer(r)).start();
	new Thread(new Consumer(r)).start();
	new Thread(new Producer(r)).start();
	new Thread(new Consumer(r)).start();
	}
}
