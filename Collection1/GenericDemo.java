package Collection1;
import java.util.*;
/*�ô���������ʱ�ڳ�����������ڱ���ʱ�ڣ��������
 * ������ǿ��ת�����鷳
 * ���͸�ʽ��ͨ��<>������Ҫ�����������������͡�
 * ��ʹ��Java�ṩ�Ķ���ʱ��ʲôʱ��д�����أ�
 * ���Ͽ���У�ֻҪ��<>��Ҫ���巺��*/
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
