package Connectin;
/*����������ʱ����Ҫָ������ķ���
 * ����������ʱ��ָ���߱�����Ķ��������*/
import java.util.Arrays;
import static java.util.Arrays.*;//�������еľ�̬��Ա
import static java.lang.System.*;
/*StaticImport ��̬����*/
public class StaticImport {
	public static void main(String[] args){
		int[] arr={3,1,5};
		sort(arr);
		//int index=Arrays.binarySearch(arr, 1);
		int index=binarySearch(arr, 1);
		sop(Arrays.toString(arr));
		sop("index="+index);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
