package String;

/*StringBuffer字符串缓冲区
 * 是一个容器，
 * 1.长度可以变化
 * 2.可以字节操作多个数据类型
 * 3.都可以通过tostring转成string类型
 * 1.存储
 * append(boolean b)
 * insert(int offset, String str)
 * 2.删除
 * delete(int start, int end)
 * deleteCharAt(int index) 
 * 3.获取
 * charAt(int index)
 * indexOf(String str, int fromIndex)
 * substring(int start)
 * lastIndexOf(String str) 
 * length() 
 * 4.修改
 * replace(int start, int end, String str) 
 * 5.反转
 * reverse() 
 * 6.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
 * StringBuffer是线程同步
 * StringBuilder是线程不同步
 * 建议使用StringBuilder
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
		sb.delete(0, sb.length());//清空缓冲区
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
