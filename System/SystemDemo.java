package System;
/*System�����еķ��������Զ��Ǿ�̬��
 * out�����
 * in����׼���룬Ĭ���Ǽ���
 * ����ϵͳ��һЩ��Ϣ
 * ��ȡϵͳ������Ϣ��getProperties() */
import java.util.*;
public class SystemDemo {
	public static void main(String[] args){
	Properties prop=System.getProperties();
	//��Ϊproperties��Hashtable�����࣬Ҳ����map�����е�һ��������󣬿�����Mapȡ��
	//�ü����д�ȡ�Ķ����ַ�����û�з��Ͷ���
	//����Զ�����Ϣ
	System.setProperty("mykey","myvalue");
	//��ȡ��������
	String value1=System.getProperty("os.name");
	sop("value="+value1);
	//�ɲ�������jvm����ʱ����̬�ļ���һЩ������Ϣ�أ�
	for(Object obj:prop.keySet())
	{String value=(String)prop.get(obj);
	sop(obj+"::"+value);
	}
	
		
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
