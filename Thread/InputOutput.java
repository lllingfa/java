/*�̼߳�ͨѶ
 * ��ʵ���Ƕ���߳��ڲ���ͬһ����Դ
 * ���ǲ����Ķ�����ͬ
 * wait(),notify() ,notifyAll()��ʹ����ͬ���У���ΪҪ�Գ��м��������������̲߳���
 * ����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž������ĸ���
 * ΪʲôҪ������Object��
 * ��Ϊ��Щ�����ڲ���ͬ���е��߳�ʱ��������Ҫ��ʶ�����������߳�ֻ�е���
 * ֻ��ͬһ�����ϵı��ȴ��̣߳����Ա�ͬһ�����ϵ�notify����
 * �����ԶԲ�ͬ���ϵ��߳̽��л���
 * ������ͬһ����
 * �����Ǳ����������ã��ڶ�����*/
class Res{
	String name;
	String sex;
	boolean flag=false;
	public synchronized void set(String name,String sex){
		if(flag)
			try{this.wait();}catch(Exception e){}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
	}
	public synchronized void out(){if(!flag)
		try{this.wait();}catch(Exception e){}

		System.out.println(name+"..."+sex);
		flag=false;
		this.notify();
	}
}

class Input implements Runnable{
	private Res r;
	
	Input(Res r){
		this.r=r;
	}
	public void run(){
		int x=0;
		while(true){
			//synchronized(Input.class){
				
			if(x==0){
		/*r.name="mike";
		r.sex="man";*/
				r.set("mike", "man");}
			else{
				/*r.name="����";
				r.sex="ŮŮ";*/
				r.set("����", "ŮŮ");
			}
			x=(x+1)%2;
			
	}}
}

class Output implements Runnable{
	//Res r= new Res();
   private Res r;
	
	Output(Res r){
		this.r=r;
	}
	public void run(){
		while(true){
			//synchronized(Input.class){
						//System.out.println(r.name+"...."+r.sex);
		r.out();
	}
		}
}
public class InputOutput {
	public static void main(String[] args)
	{
Res r=new Res();
new Thread(new Input(r)).start();
new Thread(new Output(r)).start();
/*Input in=new Input(r);
Output out=new Output(r);
Thread t1=new Thread(in);
Thread t2=new Thread(out);
  t1.start();
   t2.start();*/
}}
//noyifyAll();