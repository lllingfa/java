/*正则表达式：符合一定规则的表达式
 * 作用：用于专门操作字符串
 * 特点：用于一些特定的符号来表示一些代码操作。这样简化书写
 * 所以学习正则表达式，就是学习一些符号的使用
 * 好处：简化书写
 * 弊端：符号定义越多，正则越长，阅读性越差
 * 具体：String matches
 * 切割：String split
 * 替换：String replaceall()
 * */
public class RegexDemo {
	public static void main(String[] args){
		checkQQ();
		demo();
		checkTel();
		splitDemo("zhj.daiohuihd    shdu","\\.");
		splitDemo("dhuuuaigsd","(.)\\1+");//按照叠词完成切割.为了可以让规则的结果被重用
		                                  //可以将规则封装成一个组。用（）完成。组的出现都
		                                  //有编号，从1开始。想要使用已有的组可以通过\n(n)的形式获取
		String str="jdiosahwd66697ujke";
		replaceallDemo(str,"\\d{5,}","#");
		String str1="afsafdsafdfff";
		replaceallDemo(str1,"(.)\\1+","$1");//获取组内的符号
		
	}
	public static void replaceallDemo(String str,String reg,String newStr){
		str=str.replaceAll(reg, newStr);
		System.out.println(str);
		
	}
	public static void splitDemo(String str,String reg){
		//String str="zhj.daiohuihd    shdu";
		//String reg=" +";//按照多个空格来进行切割
		//String reg="\\.";
		String[] arr=str.split(reg);
		System.out.println(arr.length);
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
	/*对QQ号码进行校验
	 * 要求：5-15 0不能开头，只能是数字*/
	/*手机号段只有13*** 15*** 18**** */
	public static void checkTel(){
		String tel="13900000111";
		String telReg="1[358]\\d{9}";
		System.out.println(tel.matches(telReg));
	}
	public static void demo(){
		String str="b23";
		String reg="[bcd]\\d*";
		boolean b=str.matches(reg);
		System.out.println(b);
				
	}
	public static void checkQQ(){
		String qq="1738297";
		String regex="[1-9]\\d{4,14}";
		boolean flag=qq.matches(regex);
		if(flag)
			System.out.println(qq+"...is ok");
		else
			System.out.println(qq+"...nonono");
	}
	public static void checkQQ_1(){
		String qq="fasfe";
		int len=qq.length();
		if(len>=5&&len<=15){
			if(!qq.startsWith("0")){
				try{
					long l=Long.parseLong(qq);
					System.out.println("qq:"+qq);
				}
				catch(NumberFormatException e){
					System.out.println("character error");
				}
				/*char[] arr=qq.toCharArray();
				boolean flag=true;
				for(int x=0;x<arr.length;x++){
					if(!(arr[x]>='0'&&arr[x]<='9'))
						flag=false;
					break;
				}
				if(flag){
					System.out.println("qq:"+qq);
				}
				else{
					System.out.println("character error");
				}*/
				
			}else{
				System.out.println("never start with 0");
			}
			
		}else{
				System.out.println("length error");
			}
	}
}
