package ObjectIO;
import java.io.*;
import java.util.*;
/*���룺�ַ�������ֽ�����
 * 
 *���룺�ֽ��������ַ���
 *String-->byte[];str.getBytes(charseName)
 *byte[]-->String:new String(byte[],charsetName)*/
public class EncodeDemo {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String s="���";
		byte[] b1=s.getBytes("GBK");
		String s1=new String (b1,"ISO8859-1");
		
		System.out.println(Arrays.toString(b1));
		System.out.println("s1="+s1);	
		//��s1����iso8859-1����
		byte[] b2=s1.getBytes("ISO8859-1");
		System.out.println(Arrays.toString(b2));
		String s2=new String(b2,"gbk");
		System.out.println("s2="+s2);
				
	}
}
