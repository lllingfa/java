package IO;
/*�������ĳ�����Ϊ��������Ĳ���Ч�ʶ����ֵ�
 * �����ڴ���������֮ǰ������Ҫ����������
 * �û��������ṩ��һ����ƽ̨�Ļ��з�
 * newline()*/

import java.io.*;
public class Buffferedwriter {
	public static void main(String[] args) throws IOException{
		//����һ���ַ�д��������
		FileWriter fw=new FileWriter("buf.txt");
		//Ϊ������ַ�д����Ч�ʡ������˻��弼��
		//ֻҪ����Ҫ�����Ч�ʵ���������Ϊ�������ݸ��������Ĺ��캯������
		BufferedWriter bufw=new BufferedWriter(fw);
		bufw.write("abcde");
		bufw.newLine();
		//��ס��ֻҪ�õ�����������Ҫ�ǵ�ˢ��
		bufw.flush();
		//�رջ����������ǹر�������
		bufw.close();
		
	}
}
