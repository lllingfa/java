package System;
//import java.util.*;
/*Runtime����
 * ���ಢû���ṩ���캯��
 * ˵��������new������ô��ֱ���뵽�����еķ����Ķ��Ǿ�̬��
 * ���ָ����л��зǾ�̬����
 * ˵������϶����ṩ�˷�����ȡ������󣬶��Ҹ÷����Ǿ�̬�ģ�������ֵ�����Ǳ�������
 *������ص����֪������ʹ���˵������ģʽ
 * �÷�����static Runtime getRuntime()
 * */
public class RuntimeDemo {
	public static void main(String[] args) throws Exception{
		Runtime r=Runtime.getRuntime();
		//��������
		//r.exec("C:\\Program Files\\Internet Explorer\\iexplore.exe");
		//ɱ������
		Process p=r.exec("C:\\Program Files\\Internet Explorer\\iexplore.exe");
		//4��ɱ������
		//Thread.sleep(4000);
		p.destroy();
		Process p1=r.exec("notepad.exe SystemDemo.java");
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
