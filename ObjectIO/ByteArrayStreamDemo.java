package ObjectIO;
import java.io.*;
/*���ڲ����ֽ������������
 * ByteArrayInputStream���ڹ�������ʱ����Ҫ��������Դ������������Դ��һ���ֽ�����
 * ByteArrayOutputStream���ڹ����ʱ�򣬲��ö�������Ŀ�ģ���Ϊ�ö������Ѿ��ڲ���װ�˿ɱ䳤�ȵ��ֽ�����
 * ��������ݵ�Ŀ�ĵ�
 * ��Ϊ�����������󶼲��������飬��û��ʹ��ϵͳ��Դ�����ԣ����ý���close�ر�
 * �����������ɽ���ʱ��
 * Դ�豸��
 * ����System.in��Ӳ��filestream���ڴ�arraystream
 * Ŀ���豸��
 * ����̨system.out��Ӳ��filestream���ڴ�arraytstream
 * �����Ķ�д˼������������*/
public class ByteArrayStreamDemo {
	public static void main(String[] args) {
		//����Դ
		ByteArrayInputStream bis=new ByteArrayInputStream("ADFBH".getBytes());
		//����Ŀ��
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		//��д
		int by=0;
		while((by=bis.read())!=-1){
			bos.write(by);
		}
		System.out.println(bos.size());
	}
}
