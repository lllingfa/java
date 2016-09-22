package String;
/*String�����������ַ�������
 * ��ô�����ṩ�˶���������ַ������в�����
 * �����Ĳ�������Щ��
 * "abcd"
 * 1.��ȡ
 *  1,1�ַ����а������ַ�����Ҳ�����ַ����ĳ���
 *      int length():��ȡ����
 *  1.2 ����λ�û�ȡλ���ϵ�ĳ���ַ�
 *      char(int index)
 *  1.3 �����ַ���ȡλ��
 *  int indexof(int ch):���ص���ch���ַ����е�һ�γ��ֵ�λ��
 *  int indexof(int ch,int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����еĳ��ֵ�
 *  λ��
 *  int indexof(str str)
 *  int indexof(str str,int fromIndex):
 * 2.�ж�
 * 2.1�ַ������Ƿ����һ���Ӵ�
 * contains(CharSequence s)
 * ����֮����indexof(str):��������str��һ�γ��ֵ�λ�ã��������-1����ʾ������
 * ���������ж��Ƿ����
 * 2.2�ַ������Ƿ�������
 * isEmpty() ��ԭ���жϳ����Ƿ�Ϊ0
 * 2.3�ַ������Ƿ���ָ�����ݿ�ͷ
 * startsWith(String prefix)
 * 2.4�ַ������Ƿ���ָ�����ݽ�β
 * endsWith(String suffix) 
 * 2.5�ж��ַ��������Ƿ���ͬ����д��equals����
 * equals(Object anObject)
 * 2.6�ж��ַ��������Ƿ���ͬ�������Դ�Сд
 * equalsIgnoreCase(String anotherString)
 * 3.ת��
 * 3.1���ַ�����ת���ַ���
 * String(char[] value) 
 * String(char[] value, int offset, int count)
 * ��̬����
 * copyValueOf(char[] data, int offset, int count)  
 * copyValueOf(char[] data)
 * valueOf(char[] data) 
 * 3.2���ַ���ת���ַ�����
 * toCharArray() 
 * 3.3 ���ֽ�����ת���ַ���
 * String(byte[] bytes) 
 * String(byte[] bytes, int offset, int length) 
 * 
 * 3.4���ַ���ת���ֽ�����
 * getBytes(String charsetName) 
 * 3.5��������������ת���ַ���
 * valueOf(double d)
 * ת�������У�����ָ�������
 * 4.�滻
 * replace(char oldChar, char newChar)
 * 5.�и�
 * split(String regex) 
 * 6.�Ӵ�
 * substring(int beginIndex)
 * subSequence(int beginIndex, int endIndex)
 * 7.ת��
 * 7.1 ���ַ���ת�ɴ�д����Сд
 * toUpperCase() 
 * toLowerCase()
 * 7.2���ַ������˵Ķ���ո�ȥ��
 * trim() 
 * 7.3�������ַ���������Ȼ˳��ıȽ�
 * compareTo(String anotherString)
 * */
public class String1 {
	public static void method_7(){
		String s="    Hello Java    ";
		sop(s.toLowerCase());
		sop(s.toUpperCase());
		sop(s.trim());
		String s1="abc";
		String s2="aea";
		sop(s1.compareTo(s2));//���ڷ�������������0��С�ڸ���
	}
	public static void method_sub(){
		String s="abcdef";
		sop(s.substring(2));//��ָ��λ�ÿ�ʼ����β������Ǳ겻���ڣ�������ַ����Ǳ�Խ���쳣
		sop(s.substring(2, 4));//����ͷ��������β��s.substring(0, s.length)
	}
	public static void method_split(){
		String s="zhangsan,lisi,wangwu";
		String[] arr=s.split(",");
		for(int x=0;x<arr.length;x++){
			sop(arr[x]);
		}
	}
	public static void method_replace(){
		String s="hello java";
		String s1=s.replace('q', 'n');//���Ҫ�滻���ַ������ڣ����صĻ���ԭ��
		String s2=s.replace("java", "world");
		sop(s2);
	}
	public static void method_trans(){
		char[]arr={'a','b','c','d','e','f'};
		String s=new String(arr,0,3);
		sop("s="+s);
		String s1="ahsdfiah";
		char[] chs=s1.toCharArray();
		for(int x=0;x<chs.length;x++){
			sop("chs  "+chs[x]);
		}
	}
	public static void method_is(){
		String str="ArrayDemo.java";
		sop(str.startsWith("Array"));
		sop(str.endsWith(".java"));
		sop(str.contains("Demo"));
	}
	public static void method_get(){
		String str="abcdefghdsk";
		//����
		sop(str.length());
		//��4λ��ֵ
		sop(str.charAt(4));
		
		sop(str.indexOf('a', 4));//���û���ҵ�����-1
		//��������һ���ַ����ֵ�λ��
		sop(str.lastIndexOf("a"));
	}
	public static void main(String[] args){
		 method_trans();
		method_is();
method_get();
method_split();
method_sub();

method_replace();method_7();
/*String s1="abc";//s1��һ�������ͱ�������abc"��һ������
//�ַ�������ص㣺һ������ʼ���Ͳ����Ըı�
String s2=new String("abc");

//s1="xxx";
s1��s2�кβ�ͬ
 * s1һ������
 * s2��������
String s3="abc";
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1.equals(s2));//��д��equals�����������ж��ַ����Ƿ���ͬ
*/}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}