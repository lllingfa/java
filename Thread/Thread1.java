/*���̣���һ������ִ���еĳ���
 * ÿһ������ִ�ж���һ��ִ��˳�򡣸�˳����һ��ִ��·�������߽�һ�����Ƶ�Ԫ
 * �̣߳����ǽ����е�һ�������Ŀ��Ƶ�Ԫ
 * �߳��ڿ����Ž��̵�ִ��
 * һ��������������һ���߳�
 * java VM ������ʱ�����һ������Java.exe
 * �ý���������һ���̸߳���java�����ִ��
 * ����߳����еĴ��������main�����У���Ϊ���߳�
 * ��չ��jvm������ֻһ���̣߳����и����������ջ��Ƶ��߳�
 * �̳�thread��,��дrun�����������̵߳�start����
 * start������1.�����߳�
 * 2.����run����
 * �������н��ÿ�ζ���ͬ����Ϊ����̶߳��ڻ�ȡcpu��ִ��Ȩ
 * cpuִ�е�˭��˭������
 * ĳһʱ��ֻ����һ�����������У�cpu�����ſ��ٵ��л�
 * �����
 * run:�洢Ҫ���еĴ���
 * ԭ���̶߳����Լ������ƣ�Thread0-1-����
 * public static currentThread():��ȡ��ǰ���̶߳���
 * �����߳����ơ�setName���߹��캯��
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
		//d.run();��û�п����̣߳�û�������
		for(int x=0;x<60;x++)
			System.out.println("Hello World --"+x);
		
	}
}
