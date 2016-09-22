package Collection1;

import java.util.*;

public class GenericDemo5 {
	public static void main(String[] args){
		TreeSet<Student11> ts=new TreeSet<Student11>(new Comp11());
		ts.add(new Student11("dhakhd"));
		ts.add(new Student11("dhaksfehd"));
		Iterator<Student11> it=ts.iterator();
        while(it.hasNext()){
			
			sop(it.next().getName());
			
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
/*class Comp11  implements Comparator<Student11>{
	public int compare(Student11 s1,Student11 s2){
		return s1.getName().compareTo(s2.getName());
	}
	
}*/
class Comp11  implements Comparator<Person11>{
	public int compare(Person11 s1,Person11 s2){
		return s1.getName().compareTo(s2.getName());
	}}
class Person11 
{
	private String name;
   Person11(String name){

	   this.name=name;
	}public String getName(){
		return name;
	}

	

}
class Student11 extends Person11{
	Student11(String name){
		super(name);
	}
}