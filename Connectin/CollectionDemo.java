package Connectin;
import java.util.*;
public class CollectionDemo {
	public static void main(String[] args){
		sortDemo();
		maxDemo();
		binarySerarchDemo();
	}
	//�����±�
	public static void binarySerarchDemo(){
		List<String> list=new ArrayList<String>();
		list.add("dhauish");
		list.add("duish");
		list.add("dhzh");
		
		Collections.sort(list);
		sop(list);
		int index=Collections.binarySearch(list, "dhzdh");
		sop("index="+index);
		int index1=halfSearch(list,"dhzh");
		sop("index1="+index1);
		//���ֲ���ǰҪ����
		Collections.sort(list,new StrLenComparator());
		sop(list);
		int index2=halfSearch2(list,"dhzh",new StrLenComparator());
		sop("index2="+index2);
	}
	//���ַ�������ĸ˳��
	public static int halfSearch(List<String>list,String key){
		int max,min,mid;
		max=list.size()-1;
		min=0;
		while(min<=max){
			mid=(max+min)>>1;
		String str=list.get(mid);
		int num=str.compareTo(key);
		if(num>0)
			max=mid-1;
		else if(num<0)
			min=mid+1;
		else
			return mid;
		}
		return -min-1;
	}
	//���ַ���������
	public static int halfSearch2(List<String>list,String key,Comparator<String> cmp){
		int max,min,mid;
		max=list.size()-1;
		min=0;
		while(min<=max){
			mid=(max+min)>>1;
		String str=list.get(mid);
		//int num=str.compareTo(key);
		int num=cmp.compare(str,key);
		if(num>0)
			max=mid-1;
		else if(num<0)
			min=mid+1;
		else
			return mid;
		}
		return -min-1;
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	//�����ֵ������ȽϷ���
	public static void maxDemo(){
		List<String> list=new ArrayList<String>();
		list.add("dhauish");
		list.add("duish");
		list.add("dhzh");
		
		Collections.sort(list);
		sop(list);
		String max=Collections.max(list);
		sop("max="+max);}
	//���򣬼��ϱȽϷ���
	public static void sortDemo(){
		List<String> list=new ArrayList<String>();
		list.add("dhauish");
		list.add("duish");
		list.add("dhzh");
		sop(list);
		Collections.sort(list);
		Collections.sort(list,new StrLenComparator ());
		sop(list);
	}
}
//����һ���Ƚ���
class StrLenComparator implements Comparator<String>{
	public int compare(String s1,String s2){
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}