package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/*HashSet����α�֤Ԫ�ص�Ψһ�Ե��أ�
 * ��ͨ��Ԫ�ص�����������hashcode��equals�����
 * ���Hashcode��ͬ���Ƚ�equals
 * �����ͬ,�������equals
 * ע�⣬�����ж�Ԫ���Ƿ���ڣ��Լ�ɾ���Ȳ���������hashcode��equals*/
class Person1{
	private String name;
	private int age;
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int hashCode(){
		return name.hashCode()+age*39 ;
	}
	//����equals
	public boolean equals(Object obj){
		if(!(obj instanceof Person1))
			return false;
		Person1 p=(Person1)obj;
		return this.name.equals(p.name)&&this.age==p.age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class HashSetTest {
	public static void main(String[] args){
		
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(new Person1("lisi",30));
		hs.add(new Person1("lisi",30));
		hs.add(new Person1("lisi1",31));
		hs.add(new Person1("lisi2",32));
		hs.add(new Person1("lisi3",33));
		sop("lisi:"+hs.contains(new Person1("lisi",30)));
		Iterator<Object> it=hs.iterator();
		while(it.hasNext()){
			Person1 p=(Person1)it.next();
			sop(p.getName()+"::"+p.getAge());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
