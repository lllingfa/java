package IO;

import java.io.*;

/*��ȡ����¼��
 * System.out:��Ӧ���Ǳ�׼������豸������̨
 * System.in:��Ӧ���Ǳ�׼�����豸������
 * ��һ�����ݵ�ԭ����readline����
 * �ܲ���ֱ��ʹ��readline������ȡ��*/
public class ReadIn {
	public static void main(String[] args) throws IOException{
		InputStream in =  System.in;
		StringBuilder sb=new StringBuilder();
		while(true){
			int ch=in.read();
			if(ch=='\r')
				continue;
			if(ch=='\n')
			{
				String s=sb.toString();
				if("over".equals(s))
					break;
				//��ӡ�ַ�
				System.out.println(s.toUpperCase());
				//��ջ���
				sb.delete(0, sb.length());
			}
			else
				sb.append((char)ch);
		}
		
	}
}