package AWT;
import java.awt.*;
import java.awt.event.*;
class FrameDemo1{
	//定义该图形中所需的组件的引用
	private Frame f;
	private Button but;
	//构造函数中调用初始模式
	FrameDemo1(){init();}
	public void init(){
		f=new Frame("my frame");
		//对frame进行基本设置
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		but=new Button("my Button");
		//将组件添加到frame中
		f.add(but);
		//加载一下窗体上事件
		myEvent();
		//显示窗体
		f.setVisible(true);
	}
	private void myEvent(){
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
		//让按钮具备退出程序的功能，按钮就是事件源，找组件自己内部的监听器，addActionListener(ActionListener l) 
		//按钮只有1个方法，没有适配器
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("exit by button");
				System.exit(0);
			}
		});
	}
}
public class FrameDemo {
	public static void main(String[] args){
		new FrameDemo1();
	}
}
