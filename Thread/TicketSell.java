/*�������ͬʱ��Ʊ
 * ʵ��Runnable�ӿ�
 * 1.������ʵ��Runnable�ӿ�
 * 2.����Runnable��run����
 * ���߳�Ҫʵ�ֵķ���run������
 * 3.ͨ��Thread�����̶߳���
 * 4.��runnable������Ϊ���ݸ�Thread���캯��
 * ��ʽ�������˵��̳еľ�����
 * �ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ
 * 2�з�ʽ������
 * �̳�Thread:�̴߳���Thread����ķ�����
 * ʵ��Runnable:�ӿڵ������run������
 * ͨ�����У����� �а�ȫ����
 * �������ݣ�һ���̶߳Զ������ִ����һ���֣���û��ִ���꣬��һ���߳�
 * ����ִ�У����¹������ݵĴ���
 * ����������Զ���������������ݣ���һ���߳���ִ���ִ꣬�й����У�����
 * �̲߳�ִ��
 * ͬ�������synchronized(����){
 * ��Ҫ��ͬ���Ĵ���}
 * ��������������������߳̿�����ͬ����ִ��
 * ǰ�᣺
 * 1.���߳�
 * 2.ʹ��ͬһ����
 * �׶ˣ���Ҫ�ж�������Ϊ������Դ
 */

class Ticket implements Runnable//extends Thread
{
	private  static int tick =100;
	Object obj=new Object();
	public void run(){
		while(true){
			show();
			/*synchronized(objTicket.classs){
			if(tick>0){
				try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread()+"sale:"+tick--);}*/
		}}
	
	public static synchronized void show(){
		if(tick>0){
			//try{Thread.sleep(10);}catch(Exception e){}
		System.out.println(Thread.currentThread()+"sale:"+tick--);}
		
	}
}

public class TicketSell {
	public static void main(String[] args){
		Ticket t=new Ticket();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		/*Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		Ticket t4=new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/
	}
}
