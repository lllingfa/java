package Map;
/*学生属性：姓名，年龄
 * 注意：姓名和年龄相同的视为同一个学生
 * 1.描述学生
 * 2.定义map容器。将学生作为键，地址作为值。存入
 * 3.获取map集合中的元素
 * 排序*/

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
			throw new RuntimeException("类型不匹配");
	
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
		//第一种方法，keySet
		Set<Student> keySet=hm.keySet();
		//有了Set集合，就可以获取其迭代器
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
			sop(stu.getName()+"：："+stu.getAge()+"..."+addr);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
