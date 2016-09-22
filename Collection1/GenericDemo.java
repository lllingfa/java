package Collection1;
import java.util.*;
/*好处：将运行时期出现问题出现在编译时期，问题减少
 * 避免了强制转换的麻烦
 * 泛型格式：通过<>来定义要操作的引用数据类型。
 * 在使用Java提供的对象时，什么时候写泛型呢？
 * 集合框架中，只要有<>就要定义泛型*/
public class GenericDemo {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		al.add("abc01");
		al.add("abc0991");
		al.add("shdu001");
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			sop(s+":"+s.length());
			
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
