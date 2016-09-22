package File;
/*Properties是hashtable的子类。
 * 也就是说它具备map集合的特点。而且它里面存储的键值对都是字符串。
 * 是集合中的和IO技术相结合的集合容器
 * 该对象的特点：可以用于键值对形式的配置文件
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
	    //将流中的数据加载进集合
		prop.load(fis);
		prop.setProperty("lisi", "40");
		FileOutputStream fos=new FileOutputStream("D:\\Users\\workspace\\File\\src\\File\\info.txt");
		prop.list(System.out);
		//方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流
		prop.store(fos, "haha");
		sop(prop);
	}
	//如何将流中的数据存储到集合中
	/*1.用一个流和info.txt文件关联
	 * 2.读取一行数据，将该行数据用“=”进行切割
	 * 3.等号左边的作为键，右边的作为值，存入到Properties中
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
	//设置和获取元素
	public static void setAndGet(){
		Properties prop=new Properties();
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "39");
		sop(prop);
		String value=prop.getProperty("lisi");
		sop(value);
		//打印所有的
		Set<String> names=prop.stringPropertyNames();
		for(String s:names){
			sop(s+":"+prop.getProperty(s));
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
