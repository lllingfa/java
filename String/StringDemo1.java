package String;

public class StringDemo1 {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void main(String[] args){
		String s="      sb d            ";
		sop("("+s+")");
		s=myTrim(s);
		sop("("+s+")");
		sop("("+reverseString(s)+")");
		String s1="ssdaskdksdsfkakkk";
		sop(getSubCount(s1,"kk"));
		String s2="ssdas";
		getMaxSubString(s1,s2);
	}
	//��ϰ1��ȥ�����ߵĿո�
	public static String myTrim(String str){
		int start=0,end=str.length()-1;
		while(start<=end&&str.charAt(start)==' ')
			start++;
		while(start<=end&&str.charAt(end)==' ')
			end--;
		return str.substring(start,end+1);
	}
	//��ϰ�������ַ�����ת
	/*���ַ����������
	�����鷴ת
	���������ַ���*/
	public static String reverseString(String s,int start,int end){
		char[]chs=s.toCharArray();
		reverse(chs,start,end);
		return new String(chs);
	}
	public static String reverseString(String s){
		return reverseString(s, 0, s.length());
	}
	private static void reverse(char[] arr,int x,int y){
		for(int start=x,end=y-1;start<end;start++,end--){
			swap(arr,start,end);
		}
	}
	private static void swap(char[]arr,int start,int end){
		char temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
	}
	//�ַ�������һ���ַ����г��ֵĴ���
	/*"ssdaskdksdsfkakkk"
	 * */
	public static int getSubCount(String str,String key){
		int count=0;
		int index=0;
		while((index=str.indexOf(key))!=-1){
			str=str.substring(index+key.length());
			count++;
		}
		return count;
	}
	/*��ϰ������ʽ��
	 * ������̫���String����
	 * */
	public static int getSubCount2(String str,String key){
		int count=0;
		int index=0;
		while((index=str.indexOf(key,index))!=-1){
			index=index+key.length();
			count++;
		}
		return count;
	}
	/*��ϰ4���������ͬ�Ӵ�*/
	public static String getMaxSubString(String s1,String s2){
		String max="";
		String min="";
		max=(s1.length()>s2.length())?s1:s2;
		min=(max==s1)?s2:s1;
		for(int x=0;x<min.length();x++){
			for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++){
				String temp=min.substring(y,z);
			   sop(temp);
			   if(max.contains(temp));
			   return temp;
			}
		}
		return "";
	}
}
