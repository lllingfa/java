package Connectin;
import java.util.*;

public class CollectionToArray {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String> ();
		al.add("abc01");
		al.add("abc02");
		al.add("abc03");
		/*��ָ�����͵����鳤��С���˼��ϵ�size,��ô�÷����ڲ��ᴴ��һ���µ�����
		 * ����Ϊ���ϵ�size
		 * ��ָ�����͵����鳤�ȴ����˼��ϵ�size,�Ͳ����´��������飬����ʹ�ô�����������
		 * �����ոպõ���������
		 * ΪʲôҪ���ϱ�����
		 * Ϊ���޶���Ԫ�صĲ���*/
		String[] arr=al.toArray(new String[2]);
		sop(Arrays.toString(arr));
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
