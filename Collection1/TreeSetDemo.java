package Collection1;

import java.util.*;
import java.util.Iterator;

/*TreeSet:可以对Set集合中的元素排序
 * 往集合中存储自定义对象学生，想按学生的年龄进行排序
 * 当主要条件相同时，一定要比较次要条件
 * 排序的第一种方式：让元素自身具备比较性。元素需要实现CompareTo接口，覆盖compare
 * To方法
 * 也称为字典顺序，也叫默认排序
 * 第二种排序方式：
 * 当元素自身不具备比较性时，或自身的比较性不是所需要的
 * 这时就需要让集合自身具备比较性。
 * 在集合初始化时，就有了比较方式
 * 当2种排序都存在时，以比较器为主
 *  定义了比较器，将比较器的对象
 * 
 * */
public class TreeSetDemo {
	public static void main(String[] args){
		//那年龄排序
		//TreeSet<Student> hs=new TreeSet<Student>();
		//按姓名排序
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
	//实现接口比较
	public int compareTo(Object obj){
		if(!(obj instanceof Student))
			throw new RuntimeException("不是学生对象");
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
//接口
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