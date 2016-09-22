package AWT;
import java.awt.*;
import java.awt.event.*;
/*创建图形化界面：
 * 1.创建frame窗体
 * 2.对窗体进行基本设置
 * 比如大小，位置，布局
 * 3.定义组件
 * 4.将组件通过窗体的add方法添加到窗体中
 * 5.让窗体显示，通过SetVisible(true)
 * 事件监听机制的特点：
 * 1.事件源
 * 2.事件
 * 3.监听器
 * 4.事件处理方式
 * 事件源：就是awt包或者swing包中的那些图形界面组件
 * 事件：每一个事件源都有自己的特有的对应事件和共性事件
 * 监听器：将可以触发某一个事件的动作都已经封装到了监听器中
 * 以上三者，在java中读已经定义好了，直接获取其对象来用就可以了 
 * 我们要做的事情是对产生的动作进行处理
 * addWindowListener(WindowListener l)*/
public class AwtDemo {
	public static void main(String[] args){
		Frame f=new Frame("my awt");
		f.setSize(500,400);
		f.setLocation(300, 200);
		f.setLayout(new FlowLayout());
		Button b=new Button("i am a button");
		//默认边界式布局
		f.add(b);
		
		//f.addWindowListener(new MyWin());
		//匿名内部类
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("window closing--"+e.toString());
				System.exit(0);
			}
			public void windowActivated(WindowEvent e){
				System.out.println("i am activated");
			} 
			public void windowOpened(WindowEvent e){
				System.out.println("i am opened!!");
			}
		}
		);
		f.setVisible(true);
		System.out.println("hello world");
	}
}
//因为WindowListener的子类WindowAdapter已经实现了WindowListener接口.
//并覆盖了其中的所有方法，那么我只要继承来自Windowadapter覆盖我需要的方法即可
class MyWin extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.out.println("window closing--"+e.toString());
		System.exit(0);
	}
}