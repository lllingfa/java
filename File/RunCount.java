package File;
import java.io.*;
import java.util.*;
/*���ڼ�¼Ӧ�ó������д���
 * ��������Ѵﵽ����ô����ע����ʾ
 * �������뵽���ǣ�������
 * ���Ǽ����������ڳ����У����ų�������ж����ڴ��д��ڣ�����������
 * ��������Ӧ�ó�����˳����ü�����Ҳ���ڴ�����ʧ��
 * ��һ���������ó��������¿�ʼ��0��ʼ����
 * ������Ҫ
 * ���������ʹ�������ü�������ֵҲ����
 * ����ʼ���ڸü������Ļ����ϼ�������
 * �������ļ�ʹ�ü�ֵ�Ե���ʽ��
 * ���������Ķ����ݣ�����������
 * ��ֵ��������map����
 * �����ļ�ʵ��Ӧ�ó���Ĺ���
 * xml
 * dom4j ��ȡ��ʽ*/
public class RunCount {
	public static void main(String[] args) throws IOException{
		Properties prop=new Properties();
		File file=new File("D:\\Users\\workspace\\File\\src\\File\\count.ini");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		int count=0;
		String value=prop.getProperty("time");
		if(value!=null){
			count=Integer.parseInt(value);
			if(count>=5)
				{
				sop("hello,you need to regester!!");
				}}
		count++;
		prop.setProperty("time", count+"");
		FileOutputStream fos=new FileOutputStream(file);
		prop.store(fos, "");
		fos.close();
		fis.close();
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
