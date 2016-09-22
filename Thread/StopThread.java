/*stop方法已经过时
 * 如何停止线程？
 * 只有一种，run方法结束
 * 开启多线程，运行代码通常都是循环结构
 * 只要控制住循环，就可以让run方法（线程）结束
 * 特殊情况：
 * 当线程处于冻结状态
 * 就不会读取标记，那么线程就不会结束
 * 这时需要对冻结状态进行清除
 * 强制让线程恢复到运行状态中来。这样就可以操作标记让线程结束
 * Interrupt（）
 * setDaemon守护线程，主线程结束自动结束*/

class Stop implements Runnable{
	private boolean flag=true;
	public synchronized void run(){
		while(flag){
			/*try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				flag=false;
			}*/
			System.out.println(Thread.currentThread().getName()+"....run");
		}
	}
	public void changeFlag(){
		flag=false;
	}
}

public class StopThread {
	public static void main(String[] args){
		Stop st=new Stop();
		Thread t1=new Thread(st);
		Thread t2=new Thread(st);
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		int num=0;
		while(true){
			if(num++==60){
				t1.interrupt();
				t2.interrupt();
				st.changeFlag();
				break;
			}
		System.out.println(Thread.currentThread().getName()+num);
		}
	}
}
