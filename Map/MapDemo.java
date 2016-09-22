package Map;

import java.util.*;

/*Map���ϣ�
 * 1.���
 * put(K key, V value)
 * putAll(Map<? extends K,? extends V> m) 
 * 2.ɾ��
 * clear()
 * remove(Object key)
 * 3.�ж�
 * containsKey(Object key)
 * containsValue(Object value)
 * isEmpty()  
 * 4.��ȡ
 * get(Object key)
 * size() 
 * values()
 * --Hashtable:�ײ��ǹ�ϣ�����ݽṹ�������Դ���յ�������ü������߳�ͬ���ģ�Ч�ʵ�
 * --HashMap���ײ��ǹ�ϣ������ݽṹ������ʹ��nullֵ��null�����ü����ǲ�ͬ����Ч�ʸ�
 * --TreeMap���ײ��Ƕ��������ṹ���̲߳�ͬ�����������ڸ�map�����еļ���������
 * ��Set����Set�ײ����ʹ����Map����
 * 
 * */
public class MapDemo {
	public static void main(String[] args){
		Map<String,String> map=new HashMap<String,String>();
		//���Ԫ��,�����ͬ�ļ����ᱻ���ǣ������ر����ǵ�ֵ
		map.put("01","zhangsan1" );
		map.put("02","zhangsan2" );
		map.put("03","zhangsan3" );
		sop("cotainKey:"+map.containsKey("01"));
		//sop("remove:"+map.remove("02"));
		map.put("04", null);
		sop("get:"+map.get("02"));//ͨ�����ؿ����ж��Ƿ����
		//��ȡmap���������е�ֵ
		Collection<String> coll=map.values();
		sop(coll);
		
		sop(map);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
