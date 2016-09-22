package File;
/*Properties��hashtable�����ࡣ
 * Ҳ����˵���߱�map���ϵ��ص㡣����������洢�ļ�ֵ�Զ����ַ�����
 * �Ǽ����еĺ�IO�������ϵļ�������
 * �ö�����ص㣺�������ڼ�ֵ����ʽ�������ļ�
 * */
import java.io.*;
import java.util.*;
public class PropertiesDemo {
	public static void main(String[] args) throws IOException{
		setAndGet();
		method_1();
		loadDemo();
	}
	public static void loadDemo() throws IOException{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Users\\workspace\\File\\src\\File\\info.txt");
	    //�����е����ݼ��ؽ�����
		prop.load(fis);
		prop.setProperty("lisi", "40");
		FileOutputStream fos=new FileOutputStream("D:\\Users\\workspace\\File\\src\\File\\info.txt");
		prop.list(System.out);
		//�������ص� Properties ���еĸ�ʽ������ Properties ���е������б�����Ԫ�ضԣ�д�������
		prop.store(fos, "haha");
		sop(prop);
	}
	//��ν����е����ݴ洢��������
	/*1.��һ������info.txt�ļ�����
	 * 2.��ȡһ�����ݣ������������á�=�������и�
	 * 3.�Ⱥ���ߵ���Ϊ�����ұߵ���Ϊֵ�����뵽Properties��
	 * */
	public static void method_1() throws IOException{
		BufferedReader bufr=new BufferedReader(new FileReader("D:\\Users\\workspace\\File\\src\\File\\info.txt"));
	    String line=null;
	    Properties prop=new Properties();
	    while((line=bufr.readLine())!=null){
	    	String[] arr=line.split("=");
	    	prop.setProperty(arr[0], arr[1]);
	    }
	    sop(prop);
	}
	//���úͻ�ȡԪ��
	public static void setAndGet(){
		Properties prop=new Properties();
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "39");
		sop(prop);
		String value=prop.getProperty("lisi");
		sop(value);
		//��ӡ���е�
		Set<String> names=prop.stringPropertyNames();
		for(String s:names){
			sop(s+":"+prop.getProperty(s));
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
