package Connectin;
import java.util.*;

public class ArraysDemo {
	public static void main(String[] args){
		int[] arr={2,4,5};
		sop(Arrays.toString(arr));
		String[] arr1={"abc","cc","kkkk"};
		/*������list�ĺô�;
		 * ����ʹ�ü��ϵ�˼��ͷ��������������е�Ԫ��
		 * ע�⣺�������ɼ��ϣ�������ʹ�ü��ϵ���ɾ��������Ϊ����ĳ����ǹ̶���
		 * contains
		 * get
		 * indexof()
		 * sublist()*/
		List<String> list=Arrays.asList(arr1);
		sop("contains:"+list.contains("cc"));
		sop(list);
		/*��������е�Ԫ�ض��Ƕ�����ô��ɼ���ʱ�������е�Ԫ�ؾ�ֱ��ת�ɼ����е�Ԫ��
		 * ������ǻ����������ͣ�������ͻ���Ϊ�����е�Ԫ�ش���*/
		int[] nums={2,3,4};
		List<int[]> li=Arrays.asList(nums);
		sop(list);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
