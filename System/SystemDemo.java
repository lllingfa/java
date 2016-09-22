package System;
/*System：类中的方法和属性都是静态的
 * out：输出
 * in：标准输入，默认是键盘
 * 描述系统的一些信息
 * 获取系统属性信息：getProperties() */
import java.util.*;
public class SystemDemo {
	public static void main(String[] args){
	Properties prop=System.getProperties();
	//因为properties是Hashtable的子类，也就是map集合中的一个子类对象，可以用Map取出
	//该集合中存取的都是字符串，没有泛型定义
	//如何自定义信息
	System.setProperty("mykey","myvalue");
	//获取单个属性
	String value1=System.getProperty("os.name");
	sop("value="+value1);
	//可不可以在jvm启动时，动态的加载一些属性信息呢？
	for(Object obj:prop.keySet())
	{String value=(String)prop.get(obj);
	sop(obj+"::"+value);
	}
	
		
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
