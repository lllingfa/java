/*������ʽ������һ������ı��ʽ
 * ���ã�����ר�Ų����ַ���
 * �ص㣺����һЩ�ض��ķ�������ʾһЩ�����������������д
 * ����ѧϰ������ʽ������ѧϰһЩ���ŵ�ʹ��
 * �ô�������д
 * �׶ˣ����Ŷ���Խ�࣬����Խ�����Ķ���Խ��
 * ���壺String matches
 * �иString split
 * �滻��String replaceall()
 * */
public class RegexDemo {
	public static void main(String[] args){
		checkQQ();
		demo();
		checkTel();
		splitDemo("zhj.daiohuihd    shdu","\\.");
		splitDemo("dhuuuaigsd","(.)\\1+");//���յ�������и�.Ϊ�˿����ù���Ľ��������
		                                  //���Խ������װ��һ���顣�ã�����ɡ���ĳ��ֶ�
		                                  //�б�ţ���1��ʼ����Ҫʹ�����е������ͨ��\n(n)����ʽ��ȡ
		String str="jdiosahwd66697ujke";
		replaceallDemo(str,"\\d{5,}","#");
		String str1="afsafdsafdfff";
		replaceallDemo(str1,"(.)\\1+","$1");//��ȡ���ڵķ���
		
	}
	public static void replaceallDemo(String str,String reg,String newStr){
		str=str.replaceAll(reg, newStr);
		System.out.println(str);
		
	}
	public static void splitDemo(String str,String reg){
		//String str="zhj.daiohuihd    shdu";
		//String reg=" +";//���ն���ո��������и�
		//String reg="\\.";
		String[] arr=str.split(reg);
		System.out.println(arr.length);
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
	/*��QQ�������У��
	 * Ҫ��5-15 0���ܿ�ͷ��ֻ��������*/
	/*�ֻ��Ŷ�ֻ��13*** 15*** 18**** */
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
