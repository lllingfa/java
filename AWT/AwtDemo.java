package AWT;
import java.awt.*;
import java.awt.event.*;
/*����ͼ�λ����棺
 * 1.����frame����
 * 2.�Դ�����л�������
 * �����С��λ�ã�����
 * 3.�������
 * 4.�����ͨ�������add������ӵ�������
 * 5.�ô�����ʾ��ͨ��SetVisible(true)
 * �¼��������Ƶ��ص㣺
 * 1.�¼�Դ
 * 2.�¼�
 * 3.������
 * 4.�¼�����ʽ
 * �¼�Դ������awt������swing���е���Щͼ�ν������
 * �¼���ÿһ���¼�Դ�����Լ������еĶ�Ӧ�¼��͹����¼�
 * �������������Դ���ĳһ���¼��Ķ������Ѿ���װ���˼�������
 * �������ߣ���java�ж��Ѿ�������ˣ�ֱ�ӻ�ȡ��������þͿ����� 
 * ����Ҫ���������ǶԲ����Ķ������д���
 * addWindowListener(WindowListener l)*/
public class AwtDemo {
	public static void main(String[] args){
		Frame f=new Frame("my awt");
		f.setSize(500,400);
		f.setLocation(300, 200);
		f.setLayout(new FlowLayout());
		Button b=new Button("i am a button");
		//Ĭ�ϱ߽�ʽ����
		f.add(b);
		
		//f.addWindowListener(new MyWin());
		//�����ڲ���
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
//��ΪWindowListener������WindowAdapter�Ѿ�ʵ����WindowListener�ӿ�.
//�����������е����з�������ô��ֻҪ�̳�����Windowadapter��������Ҫ�ķ�������
class MyWin extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.out.println("window closing--"+e.toString());
		System.exit(0);
	}
}