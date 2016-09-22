package AWT;
import java.awt.*;
import java.awt.event.*;

public class MouseAndKeyEventDemo {
	
		//定义该图形中所需的组件的引用
		private Frame f;
		private Button but1;
		private TextField tf;
		
		//构造函数中调用初始模式
		 MouseAndKeyEventDemo (){init();}
		public void init(){
			f=new Frame("my frame");
			//对frame进行基本设置
			f.setBounds(300,100,600,500);
			f.setLayout(new FlowLayout());
			 but1 = new Button("my Button");
			//将组件添加到frame中
			f.add(but1);tf=new TextField(10);
			f.add(tf);
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
			tf.addKeyListener(new KeyAdapter(){
				public void keyPressed(KeyEvent e){
					int code=e.getKeyCode();
					if(!(code>=KeyEvent.VK_0&&code<=KeyEvent.VK_9))
						{System.out.println("illegel");
					//非法的不让输入
						e.consume();}
				}
			});
			
			//让按钮具备退出程序的功能，按钮就是事件源，找组件自己内部的监听器，addActionListener(ActionListener l) 
			//按钮只有1个方法，没有适配器
			but1.addMouseListener(new MouseAdapter(){
				private int count=1;
				private int clickCount=1;
				public void mouseEntered(MouseEvent e){
					System.out.println("mouse enter"+count++);
				}
				public void mouseClicked(MouseEvent e){
					if(e.getClickCount()==2)
					System.out.println(" double cliced"+clickCount++);
				}
			});
			//给But添加一个键盘监听
			but1.addKeyListener(new KeyAdapter(){
				public void keyPressed(KeyEvent e){
				//	System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"..."+e.getKeyCode());//e.getKeyChar()
					if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER)
						System.out.println("contrl+enter is run");
						//System.exit(0);
				}
			});
		}
	
			public static void main(String[] args){
				new MouseAndKeyEventDemo();
			}
	}

