package Connectin;
/*jdk�汾��������
 * �ɱ����һ��Ҫ�����ڲ����б�������*/
public class ParamMethodDemo {
	public static void main(String[] args){
		//��Ȼ�ٶ����˶������������ÿһ�ζ�Ҫ����������Ϊʵ�ʲ���
		show(2);
		show(2,3,4);
		/*�ɱ����...
		 * ��ʵ������һ����������ļ�д��ʽ
		 * ����ÿһ���ֶ��Ľ����������
		 * ֻҪ��Ҫ������Ԫ����Ϊ�������ݼ���
		 * ��ʽ�Ľ����������װ��������
		 * */
	}
	public static void show(int... arr){
		sop(arr.length);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
