package Collection1;

import java.util.ArrayList;
import java.util.Iterator;
/*?��ͨ�����Ҳ�������Ϊռλ��
 * ���͵��޶���
 * �� extends E:���Խ���E���ͻ���E�������͡�����
 * ��super E:���Խ���E���ͻ���E�ĸ����͡�����*/
public class GenericDemo4 {
	public static void main(String[] args){
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("abc01");
		al.add("abc0991");
		al.add("shdu001");
		printColl(al);
		ArrayList<Student22>all=new ArrayList<Student22>();
		all.add(new Student22("abs--1"));
		all.add(new Student22("abs--12"));
				
		printColl1(all);
		
	}
	public static void printColl1(ArrayList<? extends Person22> al){
		Iterator<? extends Person22> it=al.iterator();
		while(it.hasNext()){
			
			sop(it.next().getName());
			
		}
	}
	//ͨ�÷���
	public static void printColl(ArrayList<?> al){
		Iterator<?> it=al.iterator();
		while(it.hasNext()){
			
			sop(it.next());
			
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
class Person22 
{
	private String name;
   Person22(String name){

	   this.name=name;
	}public String getName(){
		return name;
	}

	

}
class Student22 extends Person22{
	Student22(String name){
		super(name);
	}
}