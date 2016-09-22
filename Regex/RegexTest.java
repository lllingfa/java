import java.util.TreeSet;

public class RegexTest {
	public static void main(String[] args){
		test_1();
		ipSort();
		 checkMail();
	}
	/*需求：对邮件地址进行校验*/
	public static void checkMail(){
		String mail="sdhu1@sina.com";
		String reg="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		reg="\\w+@\\w+(\\.\\w+)+";
		//mail.indexOf("@")!=-1;
		System.out.println(mail.matches(reg));
	}
	/*需求：
	 * 将下列字符串转成：我要学编程
	 * 思路
	 *1.先将点去掉
	 *2.可以将多个重复内容变成单个内容 */
	public static void test_1(){
		String str="我我我..要要..要要....学学学....编编...程.程....程";
		str=str.replaceAll("\\.+", "");
		System.out.println(str);
		str=str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}
	/*192.68.1.254 102.49.23.013 10.10.10.10将ip地址
	 * 进行地址段顺序的排序
	 * 还按照字符串自然顺序，只要让它们每一段都是3位即可
	 * 1.按照每一段需要的最多的0进行补齐，那么每一段就会至少保证有3位
	 * 2.将每一段只保留3位，这样，所有的ip地址都是3位*/
	public static void ipSort(){
	 String ip="192.68.1.254 102.49.23.013 10.10.10.10";
	 //补0
	 ip=ip.replaceAll("(\\d+)", "00$1");
	 System.out.println(ip);
	 //取3位
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
	
