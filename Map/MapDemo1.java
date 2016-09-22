package Map;
import java.util.*;
/*map集合的两种取出方式：
 * 1.keyset:将map中所有的键存入到Set集合。因为Set具备迭代器
 * 所有可以迭代方式取出所有的键，在根据get方法，获取每一个键对应的值
 * 取出原理：Map的集合转成Set集合，在通过迭代器取出
 * 2.entrySet: Set<Map.Entry<K,V>> entrySet()：将Map集合中的映射关系取出*/
public class MapDemo1 {
	public static void main(String[] args){
		Map<String,String> map=new HashMap<String,String>();
		//添加元素,添加相同的键，会被覆盖，并返回被覆盖的值
		map.put("01","zhangsan1" );
		map.put("02","zhangsan2" );
		map.put("03","zhangsan3" );
		//先获取map集合的所有键的Set集合，KeySet();
		Set<String> keySet=map.keySet();
		//有了Set集合，就可以获取其迭代器
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()){
			String key=it.next();
			//有了键可以通过map集合的get方法获取其对于的值
			String value=map.get(key);
			sop("key:"+key+",value:"+value);
		}
		//将关系取出，存在Set集合中
		Set<Map.Entry<String,String>> entrySet=map.entrySet();
		Iterator<Map.Entry<String,String>> it1=entrySet.iterator();
		while(it1.hasNext()){
			Map.Entry<String, String> me=it1.next();
			String key=me.getKey();
			String value=me.getValue();
			sop("key:"+key+",value:"+value);
		}
		/*Map.Entry其实Entry也是一个接口，它是Map接口中的一个内部接口。*/
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
/*interface Map{
	public static interface Entry{
		public abstract Object getKey();
		public abstract Object getValue();
	}
}
class HashMap implements Map{
	class haha implements Map.Entry{
	public abstract Object getKey(){}
	public abstract Object getValue(){}}
}*/