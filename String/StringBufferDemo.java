package String;

/*StringBuffer�ַ���������
 * ��һ��������
 * 1.���ȿ��Ա仯
 * 2.�����ֽڲ��������������
 * 3.������ͨ��tostringת��string����
 * 1.�洢
 * append(boolean b)
 * insert(int offset, String str)
 * 2.ɾ��
 * delete(int start, int end)
 * deleteCharAt(int index) 
 * 3.��ȡ
 * charAt(int index)
 * indexOf(String str, int fromIndex)
 * substring(int start)
 * lastIndexOf(String str) 
 * length() 
 * 4.�޸�
 * replace(int start, int end, String str) 
 * 5.��ת
 * reverse() 
 * 6.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
 * StringBuffer���߳�ͬ��
 * StringBuilder���̲߳�ͬ��
 * ����ʹ��StringBuilder
*/

public class StringBufferDemo {
	public static void method_add(){
	StringBuffer sb=new StringBuffer();
	sb.append("abc").append(true).append(34);
	sb.insert(1, "qq");
	StringBuffer sb1=sb.append(34);
	sop("sb==sb1:"+(sb==sb1));
	sop(sb.toString());
	sop(sb1.toString());
}
	public static void method_del(){
		StringBuffer sb=new StringBuffer("fdsf");
		sb.delete(1, 2);
		sb.delete(2, 3);
		sop(sb.toString());
		sb.deleteCharAt(0);
		sop(sb.toString());
		sb.delete(0, sb.length());//��ջ�����
		sop(sb.toString());
	}
	public static void method_update(){
		StringBuffer sb=new StringBuffer("fdsf");
		sb.replace(0, 4, "java");
		sb.setCharAt(2, 'k');
		sop(sb.toString());
	}
	public static void main(String[] args){
		method_del();
		method_update();
		StringBuffer sb=new StringBuffer("fdsf");
		char[] chs=new char[4];
		sb.getChars(1, 4, chs, 1);
		for(int x=0;x<chs.length;x++)
			sop("chs["+x+"]="+chs[x]+";");
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
