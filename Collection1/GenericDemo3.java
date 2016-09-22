package Collection1;
//泛型定义在接口上
interface Inter<T>{
	void show(T t);
}
class InterIMP1 implements Inter<String>{
	public void show(String t){
		sop("show:"+t);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
class InterIMP2<T> implements Inter<T>{
	public void show(T t){
		sop("show:"+t);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
public class GenericDemo3 {
	public static void main(String[] args){
		
		InterIMP1 i=new InterIMP1();
		i.show("haha");
		InterIMP2<Integer> i2=new InterIMP2<Integer>();
		i2.show(4);
	}
}
