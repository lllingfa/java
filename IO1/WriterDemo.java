package IO;

import java.io.*;

/*�ַ������ֽ���
 * �ֽ����������ࣺ
 * InputStream outputStream
 * �ַ�����
 * Reader Writer
 * ��ѧϰ���ַ�����
 * ��ȻIO�������ڲ������ݵ�
 * ��ô���ݵ����������ʽ�ǣ��ļ�
 * ��ô���Բ����ļ�Ϊ������ʾ
 * ������Ӳ���ϣ�����һ���ļ���д��һЩ��������
 * �ҵ�һ��ר�����ڲ����ļ���Writer����Ķ���FileWriter��
 * ��׺���Ǹ�������ǰ׺���Ǹ�������Ĺ���
 * IO�쳣�Ĵ���ʽ*/
public class WriterDemo {
	public static void main(String[] args) throws IOException{
		//����һ��FIleWriter�Ķ��󣬸ö����ѳ�ʼ���ͱ���Ҫ��ȷ���������ļ�
		//���Ŀ¼����ͬ���ļ��Ḳ��
		FileWriter fw=new FileWriter("D:\\Users\\workspace\\System\\src\\IO\\demo.txt");
	    //����write���������ַ���д�뵽����
		fw.write("shduiah");
		//ˢ���������еĻ��������ݣ��ŵ�Ŀ�ĵ���
	    fw.flush();
	    fw.write("skhfia");
	    //�ر�����Դ�����ǹر�֮ǰ��ˢ��һ���ڲ��Ļ����е����ݡ�
	    //������ˢ��Ŀ�ĵأ�flushˢ�º������Լ���ʹ�ã�closeˢ�º����ر�
	    fw.close();
	
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
