package File;
import java.io.*;
import java.util.*;
/*��ӡ����
 * �����ṩ�˴�ӡ���������Խ������������͵����ݶ�ԭ����ӡ
 * �ֽڴ�ӡ����
 * PrintStream
 * ���캯�����Խ��յĲ�������
 * 1.file����
 * 2.�ַ���·��
 * 3���ֽ������
 * �ַ���ӡ��
 *  1.file����file
 * 2.�ַ���·��string
 * 3���ֽ������OutputStream
 * 4.�ַ������ writer
 * PrintWriter
 * */
public class PrintStreamDemo {
	public static void main(String[] args) throws IOException{
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out =new PrintWriter(System.out);
		//FileWriter�Զ���ˢ�£�����Ҫover�Ľ���
		PrintWriter out =new PrintWriter(new FileWriter("D:\\Users\\workspace\\File\\src\\File\\a.txt"),true);
		String line=null;
		while((line=bufr.readLine())!=null)
		{if("over".equals(line))
			break;
			out.println(line.toUpperCase());
			//out.flush();
		}
		out.close();
		bufr.close();
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
