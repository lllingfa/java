package File;
import java.io.*;
import java.util.*;
/*用于记录应用程序运行次数
 * 如果次数已达到，那么给出注册提示
 * 很容易想到的是：计数器
 * 可是计数器定义在程序中，随着程序的运行而在内存中存在，并进行自增
 * 可是随着应用程序的退出，该计数器也在内存中消失了
 * 下一次在启动该程序，又重新开始从0开始计数
 * 我们需要
 * 程序计数即使结束，该计数器的值也存在
 * 程序开始，在该计数器的基础上继续计数
 * 该配置文件使用键值对的形式。
 * 这样便于阅读数据，并操作数据
 * 键值对数据是map集合
 * 配置文件实现应用程序的共享
 * xml
 * dom4j 读取格式*/
public class RunCount {
	public static void main(String[] args) throws IOException{
		Properties prop=new Properties();
		File file=new File("D:\\Users\\workspace\\File\\src\\File\\count.ini");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		int count=0;
		String value=prop.getProperty("time");
		if(value!=null){
			count=Integer.parseInt(value);
			if(count>=5)
				{
				sop("hello,you need to regester!!");
				}}
		count++;
		prop.setProperty("time", count+"");
		FileOutputStream fos=new FileOutputStream(file);
		prop.store(fos, "");
		fos.close();
		fis.close();
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
