package AWT;
import java.awt.*;
import java.awt.event.*;
class FrameDemo1{
	//�����ͼ������������������
	private Frame f;
	private Button but;
	//���캯���е��ó�ʼģʽ
	FrameDemo1(){init();}
	public void init(){
		f=new Frame("my frame");
		//��frame���л�������
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		but=new Button("my Button");
		//�������ӵ�frame��
		f.add(but);
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
		//�ð�ť�߱��˳�����Ĺ��ܣ���ť�����¼�Դ��������Լ��ڲ��ļ�������addActionListener(ActionListener l) 
		//��ťֻ��1��������û��������
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
