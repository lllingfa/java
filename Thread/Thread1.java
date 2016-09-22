/*进程：是一个正在执行中的程序。
 * 每一个进程执行度有一个执行顺序。该顺序是一个执行路径，或者叫一个控制单元
 * 线程：就是进程中的一个独立的控制单元
 * 线程在控制着进程的执行
 * 一个进程中至少有一个线程
 * java VM 启动的时候会有一个进程Java.exe
 * 该进程中至少一个线程负责java程序的执行
 * 这个线程运行的代码存在于main方法中，称为主线程
 * 扩展：jvm启动不只一个线程，还有负责垃圾回收机制的线程
 * 继承thread类,复写run方法，调用线程的start方法
 * start方法：1.启动线程
 * 2.调用run方法
 * 发现运行结果每次都不同，因为多个线程都在获取cpu的执行权
 * cpu执行到谁，谁就运行
 * 某一时刻只能有一个程序在运行，cpu在做着快速的切换
 * 随机性
 * run:存储要运行的代码
 * 原来线程都有自己的名称，Thread0-1-……
 * public static currentThread():获取当前的线程对象
 * 设置线程名称“setName或者构造函数
 * */

class thread extends Thread
{//private String name;
  thread(String name){
	//this.name=name;
	  super(name);
}
public void run(){
	for(int x=0;x<60;x++)
	System.out.println((Thread.currentThread()==this)+this.getName()+"Thread run--"+x);

}

}

public class Thread1 {
	public static void main(String[] args){
		thread d=new thread("d---");
		thread d1=new thread("d1+++");
		d.start();
		d1.start();
		//d.run();并没有开启线程，没有随机性
		for(int x=0;x<60;x++)
			System.out.println("Hello World --"+x);
		
	}
}
