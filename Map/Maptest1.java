package Map;

import java.util.*;

/*ʲôʱ��ʹ��map�����أ�
 * ������֮�����ӳ���ϵʱ����Ҫ�õ�map
 * ��¼���ִ���
 * ˼·��
 * 1.���ַ���ת�����ַ����飬��ΪҪ��ÿһ����ĸ���в���
 * 2.����һ��map���ϣ���Ϊ��ӡ�Ľ������ĸ��Ϸ���죬����ʹ��treemap����
 * 3.�����ַ�����
 * ��ÿһ����ĸ��Ϊ��ȥ��map����
 * �������null���ͽ���ĸ1���뵽map������
 * ������ز���null,˵���Ѿ����ڲ��ж�Ӧ����
 * ��ô��ȡ�ô�����������������������ĸ��������Ĵ������뵽map�����У����ǵ���ԭ����
 * ����Ӧ��ֵ
 * 4.��map�����е����ݱ��ָ�����ַ�����ʽ����*/

public class Maptest1 {
	public static void main(String[] args){
		String str="shdaiu--hdiuq";
		sop(charCount(str));
	}
	public static String charCount(String str){
		char[]chs=str.toCharArray();
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		int count=0;
		for(int x=0;x<chs.length;x++){
			if(!(chs[x]>='a'&&chs[x]<='z'||chs[x]>='A'&&chs[x]<='Z'))
				continue;
				
			Integer value=tm.get(chs[x]);
			/*if(value==null){
				tm.put(chs[x], 1);
			}
			else{
				value=value+1;
				tm.put(chs[x], value);
			}*/
			if(value!=null)
				count=value;
			count++;
			tm.put(chs[x], count);
			count=0;
		}
		sop(tm);
		//��Ҫ��ķ�ʽ��ʾ
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<Character, Integer>> entrySet=tm.entrySet();
		Iterator<Map.Entry<Character, Integer>> it=entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<Character, Integer> me=it.next();
			Character ch=me.getKey();
			Integer value=me.getValue();
			sb.append(ch+"("+value+")");
		}
		return sb.toString();
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
