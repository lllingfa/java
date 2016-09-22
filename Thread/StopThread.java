/*stop�����Ѿ���ʱ
 * ���ֹͣ�̣߳�
 * ֻ��һ�֣�run��������
 * �������̣߳����д���ͨ������ѭ���ṹ
 * ֻҪ����סѭ�����Ϳ�����run�������̣߳�����
 * ���������
 * ���̴߳��ڶ���״̬
 * �Ͳ����ȡ��ǣ���ô�߳̾Ͳ������
 * ��ʱ��Ҫ�Զ���״̬�������
 * ǿ�����ָ̻߳�������״̬�����������Ϳ��Բ���������߳̽���
 * Interrupt����
 * setDaemon�ػ��̣߳����߳̽����Զ�����*/

class Stop implements Runnable{
	private boolean flag=true;
	public synchronized void run(){
		while(flag){
			/*try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				flag=false;
			}*/
			System.out.println(Thread.currentThread().getName()+"....run");
		}
	}
	public void changeFlag(){
		flag=false;
	}
}

public class StopThread {
	public static void main(String[] args){
		Stop st=new Stop();
		Thread t1=new Thread(st);
		Thread t2=new Thread(st);
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		int num=0;
		while(true){
			if(num++==60){
				t1.interrupt();
				t2.interrupt();
				st.changeFlag();
				break;
			}
		System.out.println(Thread.currentThread().getName()+num);
		}
	}
}
