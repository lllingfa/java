package Map;
/*ѧ�����ԣ�����������
 * ע�⣺������������ͬ����Ϊͬһ��ѧ��
 * 1.����ѧ��
 * 2.����map��������ѧ����Ϊ������ַ��Ϊֵ������
 * 3.��ȡmap�����е�Ԫ��
 * ����*/

import java.util.*;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student s){
		int num=new Integer(this.age).compareTo(new Integer(s.age));
		if(num==0)
			return this.name.compareTo(s.name);
		return num;
	}
	public int hashCode(){
		return name.hashCode()+age*34;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Student))
			throw new RuntimeException("���Ͳ�ƥ��");
	
	Student s=(Student)obj;
	return this.name.equals(s.name)&&this.age==s.age;
}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

public class Maptest {
	public static void main(String[] args){
		HashMap<Student,String> hm=new HashMap<Student,String>();
		hm.put(new Student("lisi1",21), "beijing");
		hm.put(new Student("lisi2",20), "nanjing");
		hm.put(new Student("lisi3",22), "shanghai");
		//��һ�ַ�����keySet
		Set<Student> keySet=hm.keySet();
		//����Set���ϣ��Ϳ��Ի�ȡ�������
		Iterator<Student> it=keySet.iterator();
		while(it.hasNext()){
			Student stu=it.next();
			String addr=hm.get(stu);
			sop(stu.getName()+"..."+addr);
		}
		TreeMap<Student,String> tm=new TreeMap<Student,String>();
		tm.put(new Student("lisi1",21), "beijing");
		tm.put(new Student("lisi2",20), "nanjing");
		tm.put(new Student("lisi3",22), "shanghai");
		Set<Map.Entry<Student, String>> entrySet=tm.entrySet();
		Iterator<Map.Entry<Student, String>> it1=entrySet.iterator();
		while(it1.hasNext()){
			Map.Entry<Student, String> me=it1.next();
			Student stu =me.getKey();
			String addr=me.getValue();
			sop(stu.getName()+"����"+stu.getAge()+"..."+addr);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
