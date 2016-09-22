package ObjectIO;
/*1.����ѧ������
 * 2.����һ�����Բ���ѧ������Ĺ�����
 * ˼��
 * 1.ͨ������¼�����ݣ����������е�����ȡ����װ��ѧ������
 * 2.��Ϊѧ�������кܶ࣬��ô����Ҫ�洢��ʹ�ü��ϣ���ΪҪ��ѧ�����ܷ��������Կ���ʹ��
 * TreeSet
 * 3.�������е���Ϣд�뵽�ļ��С�*/
import java.io.*;
import java.util.*;
class Student implements Comparable<Student>{
	private String name;
	private int ma,cn,en;
	private int sum;
	Student(String name,int ma,int cn,int en){
		this.name=name;
		this.ma=ma;
		this.cn=cn;
		this.en=en;
		sum=ma+cn+en;
	}
	public int compareTo(Student s){
		int num=new Integer(this.sum).compareTo(new Integer(s.sum));
		if(num==0)
			return this.name.compareTo(s.name);
		return num;
			
	}
	public String getName(){
		return name;
	}
	public int getSum(){
		return sum;
	}
	public int hashCode(){
		return name.hashCode()+sum*78;
	}
	public boolean eguals(Object obj){
		if(!(obj instanceof Student))
			throw new ClassCastException("���Ͳ�ƥ��");
		Student s=(Student)obj;
		return this.name.equals(s.name)&&this.sum==s.sum;
	}
	public String toString(){return "Student["+name+","+ma+","+cn+","+en+"]";}
	
	
}
class StudentInfoTool{
	public static Set<Student> getStudents() throws IOException{
		return getStudents(null);
	}
	public static Set<Student> getStudents(Comparator<Student> cmp) throws IOException{
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		Set<Student> stus=null;
		if(cmp==null)
				stus=new TreeSet<Student>();
		else
			stus=new TreeSet<Student>(cmp);
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			String[] info=line.split(",");
			Student stu=new Student(info[0],Integer.parseInt(info[1]),
					Integer.parseInt(info[2]),Integer.parseInt(info[3]));
			stus.add(stu);
		}
		bufr.close();
        return stus;
	}
	public static void write2File(Set<Student> stus) throws IOException{
		BufferedWriter bufw=new BufferedWriter(new FileWriter("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\stu.txt"));
		for(Student stu:stus){
			bufw.write(stu.getName()+"\t");
			bufw.write(stu.getSum()+"");
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
	}
}
public class StudentInfoTest {
	public static void main(String[] args) throws IOException{
		//ǿת
		Comparator<Student> cmp=Collections.reverseOrder();
		Set<Student> stus=StudentInfoTool.getStudents(cmp);
		StudentInfoTool.write2File(stus);
	}
}
