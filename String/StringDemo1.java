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
	//练习1，去除两边的空格
	public static String myTrim(String str){
		int start=0,end=str.length()-1;
		while(start<=end&&str.charAt(start)==' ')
			start++;
		while(start<=end&&str.charAt(end)==' ')
			end--;
		return str.substring(start,end+1);
	}
	//练习二，将字符串反转
	/*将字符串变成数组
	对数组反转
	将数组变成字符串*/
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
	//字符串在另一个字符串中出现的次数
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
	/*练习三，方式二
	 * 不产生太多的String对象
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
	/*练习4，求最大相同子串*/
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
