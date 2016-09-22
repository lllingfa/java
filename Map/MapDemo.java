package Map;

import java.util.*;

/*Map集合：
 * 1.添加
 * put(K key, V value)
 * putAll(Map<? extends K,? extends V> m) 
 * 2.删除
 * clear()
 * remove(Object key)
 * 3.判断
 * containsKey(Object key)
 * containsValue(Object value)
 * isEmpty()  
 * 4.获取
 * get(Object key)
 * size() 
 * values()
 * --Hashtable:底层是哈希表数据结构，不可以存入空的情况，该集合是线程同步的，效率低
 * --HashMap：底层是哈希表的数据结构，允许使用null值和null键，该集合是不同步，效率高
 * --TreeMap：底层是二叉树树结构，线程不同步。可以用于给map集合中的键进行排序
 * 和Set很像，Set底层就是使用了Map集合
 * 
 * */
public class MapDemo {
	public static void main(String[] args){
		Map<String,String> map=new HashMap<String,String>();
		//添加元素,添加相同的键，会被覆盖，并返回被覆盖的值
		map.put("01","zhangsan1" );
		map.put("02","zhangsan2" );
		map.put("03","zhangsan3" );
		sop("cotainKey:"+map.containsKey("01"));
		//sop("remove:"+map.remove("02"));
		map.put("04", null);
		sop("get:"+map.get("02"));//通过返回空来判断是否存在
		//获取map集合中所有的值
		Collection<String> coll=map.values();
		sop(coll);
		
		sop(map);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
