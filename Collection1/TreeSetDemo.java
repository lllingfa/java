package Collection1;

import java.util.*;
import java.util.Iterator;

/*TreeSet:���Զ�Set�����е�Ԫ������
 * �������д洢�Զ������ѧ�����밴ѧ���������������
 * ����Ҫ������ͬʱ��һ��Ҫ�Ƚϴ�Ҫ����
 * ����ĵ�һ�ַ�ʽ����Ԫ������߱��Ƚ��ԡ�Ԫ����Ҫʵ��CompareTo�ӿڣ�����compare
 * To����
 * Ҳ��Ϊ�ֵ�˳��Ҳ��Ĭ������
 * �ڶ�������ʽ��
 * ��Ԫ�������߱��Ƚ���ʱ��������ıȽ��Բ�������Ҫ��
 * ��ʱ����Ҫ�ü�������߱��Ƚ��ԡ�
 * �ڼ��ϳ�ʼ��ʱ�������˱ȽϷ�ʽ
 * ��2�����򶼴���ʱ���ԱȽ���Ϊ��
 *  �����˱Ƚ��������Ƚ����Ķ���
 * 
 * */
public class TreeSetDemo {
	public static void main(String[] args){
		//����������
		//TreeSet<Student> hs=new TreeSet<Student>();
		//����������
		TreeSet<Student> hs=new TreeSet<Student>(new MyCompare());
		hs.add(new Student("lisi02",22));
		//sop(hs.add("java01"));
		hs.add(new Student("java02",21));
		hs.add(new Student("java023",21));
		hs.add(new Student("java03",33));
		Iterator<Student> it=hs.iterator();
		while(it.hasNext()){
			Student stu=(Student)it.next();
			//sop(it.next());
			sop(stu.getName()+"..."+stu.getAge());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
class Student implements Comparable<Object>
{
	private String name;
	private int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	//ʵ�ֽӿڱȽ�
	public int compareTo(Object obj){
		if(!(obj instanceof Student))
			throw new RuntimeException("����ѧ������");
			Student s=(Student)obj;
		if(this.age>s.age)
			return 1;
		if(this.age==s.age)
		{
			return this.name.compareTo(s.name);}
		return -1;
	}
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
}
//�ӿ�
class MyCompare implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		int num=s1.getName().compareTo(s2.getName());
		if(num==0){
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
		}
		return num;
	}
}