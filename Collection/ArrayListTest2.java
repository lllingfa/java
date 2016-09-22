package Collection;

import java.util.*;

/*���Զ���Ķ�����ΪԪ�ش���ArrayList�����У���ȥ���ظ�Ԫ��
 * ��������Ϣ
 * */

class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	//����equals
	public boolean equals(Object obj){
		if(!(obj instanceof Person))
			return false;
		Person p=(Person)obj;
		return this.name.equals(p.name)&&this.age==p.age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class ArrayListTest2 {
	public static void main(String[] args){
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(new Person("lisi",30));
		al.add(new Person("lisi",30));
		al.add(new Person("lisi1",31));
		al.add(new Person("lisi2",32));
		al.add(new Person("lisi3",33));
		
		al=SingleElement(al);
		Iterator<Object> it=al.iterator();
		while(it.hasNext()){
			Person p=(Person)it.next();
			sop(p.getName()+"::"+p.getAge());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static ArrayList<Object> SingleElement(ArrayList<Object> al){
		//����һ����ʱ����
		ArrayList<Object> newAl=new ArrayList<Object>();
		Iterator<Object> it=al.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			if(!newAl.contains(obj))
				newAl.add(obj);
		}
		return newAl;
	}
	
	
}
