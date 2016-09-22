package System;
//import java.util.*;
/*Runtime对象
 * 该类并没有提供构造函数
 * 说明不可以new对象。那么会直接想到该类中的方法的都是静态的
 * 发现该类中还有非静态方法
 * 说明该类肯定会提供了方法获取本类对象，而且该方法是静态的，并返回值类型是本类类型
 *由这个特点可以知道该类使用了单例设计模式
 * 该方法是static Runtime getRuntime()
 * */
public class RuntimeDemo {
	public static void main(String[] args) throws Exception{
		Runtime r=Runtime.getRuntime();
		//启动进程
		//r.exec("C:\\Program Files\\Internet Explorer\\iexplore.exe");
		//杀死进程
		Process p=r.exec("C:\\Program Files\\Internet Explorer\\iexplore.exe");
		//4秒杀死进程
		//Thread.sleep(4000);
		p.destroy();
		Process p1=r.exec("notepad.exe SystemDemo.java");
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
