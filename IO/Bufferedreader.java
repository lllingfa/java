package IO;
/*�ַ���ȡ��������
 * �û������ṩ��һ��һ�ζ�һ�еķ���radline,������ı����ݵĻ�ȡ
 * ������nullʱ����ʾ�����ļ���ĩβ*/
import java.io.*;
public class Bufferedreader {
	public static void main(String[] args) throws IOException{
		//����һ����ȡ��������ļ������
		FileReader fr=new FileReader("buf.txt");
		//Ϊ�����Ч�ʡ����뻺�弼�������ַ���ȡ��������Ϊ�������ݸ��������Ĺ��캯��
		BufferedReader bufr=new BufferedReader(fr);
		String line=null;
		while((line=bufr.readLine())!=null){
			System.out.println(line);
		}
		bufr.close();
	}
}
