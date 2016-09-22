package Map;
import java.util.*;
/*map���ϵ�����ȡ����ʽ��
 * 1.keyset:��map�����еļ����뵽Set���ϡ���ΪSet�߱�������
 * ���п��Ե�����ʽȡ�����еļ����ڸ���get��������ȡÿһ������Ӧ��ֵ
 * ȡ��ԭ��Map�ļ���ת��Set���ϣ���ͨ��������ȡ��
 * 2.entrySet: Set<Map.Entry<K,V>> entrySet()����Map�����е�ӳ���ϵȡ��*/
public class MapDemo1 {
	public static void main(String[] args){
		Map<String,String> map=new HashMap<String,String>();
		//���Ԫ��,�����ͬ�ļ����ᱻ���ǣ������ر����ǵ�ֵ
		map.put("01","zhangsan1" );
		map.put("02","zhangsan2" );
		map.put("03","zhangsan3" );
		//�Ȼ�ȡmap���ϵ����м���Set���ϣ�KeySet();
		Set<String> keySet=map.keySet();
		//����Set���ϣ��Ϳ��Ի�ȡ�������
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()){
			String key=it.next();
			//���˼�����ͨ��map���ϵ�get������ȡ����ڵ�ֵ
			String value=map.get(key);
			sop("key:"+key+",value:"+value);
		}
		//����ϵȡ��������Set������
		Set<Map.Entry<String,String>> entrySet=map.entrySet();
		Iterator<Map.Entry<String,String>> it1=entrySet.iterator();
		while(it1.hasNext()){
			Map.Entry<String, String> me=it1.next();
			String key=me.getKey();
			String value=me.getValue();
			sop("key:"+key+",value:"+value);
		}
		/*Map.Entry��ʵEntryҲ��һ���ӿڣ�����Map�ӿ��е�һ���ڲ��ӿڡ�*/
		
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