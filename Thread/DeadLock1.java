

class Test implements Runnable{
	private boolean flag;
	Test(boolean flag){
		this.flag=flag;
		
	}
	public void run(){
		if(flag){
			synchronized(MyLock.locka){
				System.out.println("if locka");
				synchronized(MyLock.lockb){
					System.out.println("if lockb");
				}
			}
		}
		else{
			synchronized(MyLock.lockb){
				System.out.println("else lockb");
				synchronized(MyLock.locka){
					System.out.println("else locka");
				}
			}
		}
		}
	}
class MyLock{
	static Object locka=new Object();
	static Object lockb=new Object();
}

public class DeadLock1 {
	public static void main(String[] args)
	{
		Thread  t4=new Thread(new Test(true));
		Thread  t5=new Thread(new Test(false));
		t4.start();
		t5.start();
		
	}
}
