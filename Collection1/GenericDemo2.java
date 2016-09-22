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
//静态方法不可以定义访问类上的定义的类型，如果类型不确定，可以定义在方法上*/
//泛型前做法
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
//泛型类
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
//定义在方法上
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
		//泛型类演示
	Utils<Worker> u=new Utils<Worker>();
	Worker w1=(Worker)u.getObject();
	//泛型类定义的在整个类中有效，如果被方法使用，那么所有方法所操作的类型就固定
	//为了让不同方法可以操作不同类型，而且类型还不确定，就定义在方法上
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
