import java.util.TreeSet;

public class RegexTest {
	public static void main(String[] args){
		test_1();
		ipSort();
		 checkMail();
	}
	/*���󣺶��ʼ���ַ����У��*/
	public static void checkMail(){
		String mail="sdhu1@sina.com";
		String reg="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		reg="\\w+@\\w+(\\.\\w+)+";
		//mail.indexOf("@")!=-1;
		System.out.println(mail.matches(reg));
	}
	/*����
	 * �������ַ���ת�ɣ���Ҫѧ���
	 * ˼·
	 *1.�Ƚ���ȥ��
	 *2.���Խ�����ظ����ݱ�ɵ������� */
	public static void test_1(){
		String str="������..ҪҪ..ҪҪ....ѧѧѧ....���...��.��....��";
		str=str.replaceAll("\\.+", "");
		System.out.println(str);
		str=str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}
	/*192.68.1.254 102.49.23.013 10.10.10.10��ip��ַ
	 * ���е�ַ��˳�������
	 * �������ַ�����Ȼ˳��ֻҪ������ÿһ�ζ���3λ����
	 * 1.����ÿһ����Ҫ������0���в��룬��ôÿһ�ξͻ����ٱ�֤��3λ
	 * 2.��ÿһ��ֻ����3λ�����������е�ip��ַ����3λ*/
	public static void ipSort(){
	 String ip="192.68.1.254 102.49.23.013 10.10.10.10";
	 //��0
	 ip=ip.replaceAll("(\\d+)", "00$1");
	 System.out.println(ip);
	 //ȡ3λ
	 ip=ip.replaceAll("0*(\\d{3})", "$1");
	 System.out.println(ip);
	 String[] arr=ip.split(" ");
	 TreeSet<String> ts=new TreeSet<String>();
	 for(String s:arr){
		 ts.add(s);
	 }
	 for(String s:ts){
		 System.out.println(s.replaceAll("0*(\\d+)", "$1"));
	 }
	}
	}
	
