package IO;
import java.io.*;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException{
		//����һ���ļ���ȡ�����󣬺�ָ�����Ƶ��ļ������
		//��֤�ļ��Ǵ��ڵģ���������ڣ��ᷢ�� FileNotFoundException
		FileReader fr=new FileReader("D:\\Users\\workspace\\System\\src\\IO\\demo.txt");
		//���ö������read����,read()һ�ζ�һ���ַ������һ��Զ����¶�
		while(true){
			int ch=fr.read();
			if(ch==-1)
				break;
		sop("ch:"+(char)ch);
		}
		//��������������,-1Ϊ�ļ�β
		int ch=0;
		while((ch=fr.read())!=-1)
			sop("ch:"+(char)ch);
		
		fr.close();
		//ͨ���ַ�������ж�ȡ
		FileReader fr1=new FileReader("D:\\Users\\workspace\\System\\src\\IO\\FileReaderDemo.java");
	    //����һ���ַ����飬���ڴ洢�������ַ�
		// read(char[] cbuf)�����ַ�����
		char[] buf=new char[1024];
		
		int num=0;
		while((num=fr1.read(buf))!=-1)
		sop(new String(buf,0,num));
		fr1.close();
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
