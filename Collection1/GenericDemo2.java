package Collection1;
/*class Tool{
	private Worker w;
	public void setWorker(Worker w){
		this.w=w;
	}
	public Worker getWorker(){
		return w;
	}
}
//��̬���������Զ���������ϵĶ�������ͣ�������Ͳ�ȷ�������Զ����ڷ�����*/
//����ǰ����
class Tool{
	private Object w;
	public void setWorker(Object w){
		this.w=w;
	}
	public Object getWorker(){
		return w;
	}}
class Worker{
	
	
}
class Stydent{
	
}
//������
class Utils<QQ>{
	private QQ q;
	public void setObject(QQ q){
		this.q=q;
	}
	public QQ getObject(){
		return q;
	}
}
class Demo<T>{
	public void show(T t){
		sop("show:"+t);
	}
	public void print(T t){
		sop("print:"+t);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
//�����ڷ�����
class Demo22{
	public <T> void show(T t){
		sop("show:"+t);
	}
	public <T> void print(T t){
		sop("print:"+t);
	}
	public static <w> void method(w t){
		sop("method:"+t);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
public class GenericDemo2 {
	public static void main(String[] args){
		Tool t=new Tool();
		t.setWorker(new Stydent());
		Stydent w=(Stydent)t.getWorker();
		//��������ʾ
	Utils<Worker> u=new Utils<Worker>();
	Worker w1=(Worker)u.getObject();
	//�����ඨ���������������Ч�����������ʹ�ã���ô���з��������������;͹̶�
	//Ϊ���ò�ͬ�������Բ�����ͬ���ͣ��������ͻ���ȷ�����Ͷ����ڷ�����
		Demo<Integer>d=new Demo<Integer>();
		d.show(4);
		Demo d1=new Demo();
		d1.show("haha");
		d1.show(new Integer(4));
		d1.print("hehiehi");
		Demo22.method("shduai");
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
