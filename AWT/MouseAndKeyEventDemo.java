package AWT;
import java.awt.*;
import java.awt.event.*;

public class MouseAndKeyEventDemo {
	
		//�����ͼ������������������
		private Frame f;
		private Button but1;
		private TextField tf;
		
		//���캯���е��ó�ʼģʽ
		 MouseAndKeyEventDemo (){init();}
		public void init(){
			f=new Frame("my frame");
			//��frame���л�������
			f.setBounds(300,100,600,500);
			f.setLayout(new FlowLayout());
			 but1 = new Button("my Button");
			//�������ӵ�frame��
			f.add(but1);tf=new TextField(10);
			f.add(tf);
			//����һ�´������¼�
			myEvent();
			//��ʾ����
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
					//�Ƿ��Ĳ�������
						e.consume();}
				}
			});
			
			//�ð�ť�߱��˳�����Ĺ��ܣ���ť�����¼�Դ��������Լ��ڲ��ļ�������addActionListener(ActionListener l) 
			//��ťֻ��1��������û��������
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
			//��But���һ�����̼���
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

