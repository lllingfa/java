package Collection;

import java.util.*;
/*ö�پ���vector���е�ȥ����ʽ
 * ����ö�ٺ͵���������
 * ��󱻵�����ȡ����*/
public class VectorDemo {
	public static void main(String[] args){
		Vector v=new Vector();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}
}
