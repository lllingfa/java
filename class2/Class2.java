package class2;
/*static:��̬
 * ���η������γ�Ա�����ͳ�Ա��������ʡÿ�δ�������Ĵ洢�ռ䣬
 * Ϊ���������������˿��Ա���������⣬�����Ա��������á�����.��̬��Ա
 * ���ԣ����е������洢������������������������������ļ��ض����أ����������ʧ����ʧ
 * ����������������ڶ������
 * ���ʳ��־�����
 * �������Ǿ�̬��
 * ע������
 * ��̬����ֻ�ܷ��ʾ�̬��Ա
 *  �Ǿ�̬�����ȿ��Է��ʾ�̬Ҳ���Է��ʷǾ�̬
 * ��̬���������Զ���this��super�ؼ���
 *   ��Ϊ�����ڶ�����ڣ����Բ����Գ���this
 *  
 * */ 
class Person1{
	String name;//��Ա������ʵ������
	static String country="CN";//��̬�ĳ�Ա�����������
	public void show(){
		System.out.println(name+"::"+country);
	}
}
/*ʲôʱ���þ�̬������
 * ��������
 * ʲôʱ���徲̬������
 * �������ڲ�û�з��ʵ��Ǿ�̬���ݣ�������������ݣ�������ô���ܿ��Ա�����Ϊ��̬��
 
 * */
/*//��Ȼ���ԣ����ǲ���Ҫ�����е����е����ݣ���static
*����һ�����Զ�������в����Ĺ�����
*@author falingling
*@version V1.1
*/
class   ArrayTool{
	//�ղ������캯��
	private ArrayTool(){}
	//��ȡ�Ը�������������ֵ
	/*@param arr����һ��int������
	 *@return�᷵�����ֵ
*/
	public static int getMax(int[] arr){
		int max=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
		}
	
	public static int getMin(int[] arr){
		int min=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]<arr[min])
				min=x;
		}
		return arr[min];
		}
	/*ѡ������
	 * */
	public static void  selectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++)
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
	}
	/*ð������
	 * */
	public static void bubbleSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-x-1;y++)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				}
			}
		}
	}
	private static void  swap(int[] arr,int x,int y){
		int temp;
		temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	/*���ڴ�ӡ�����е�Ԫ��
	 * ��ӡ��ʽΪ[element,...elment]*/
	public static void printArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(x!=arr.length-1){
				System.out.print(arr[x]+",");
			}
			else
			{
				System.out.println(arr[x]);
			}
		}
	}
	
}
/*//��̬�����
 * �ص㣺������ļ��ض�ִ�У�ִֻ��һ�Σ����ڸ����ʼ����
*/
class StaticCode{
	//��̬�����,ִ����1�Σ�ֻ���þ�̬��Ա
	int num=9;
	static{
		System.out.println("a");
	}
	//�������飬ִ��
	{System.out.println("b"+this.num);}
	StaticCode(){
		System.out.println("c");
	}
	StaticCode(int x){
		System.out.println("d"+x);
	}
	public static void show(){
		System.out.println("show run");
	}
}
/*��ʼ��˳��
 * 1.new �����ļ����ص��ڴ���
 * 2.static�����
 * 3.���ڴ濪�ٿռ䣬�����ַ
 * 4.������������ԣ�Ĭ�ϳ�ʼ��
 * 5.������ʾ��ʼ��
 * 6.�Զ����������ʼ��
 * 7.�Զ���Ķ�Ӧ�Ĺ��캯����ʼ��
 * 8.���ڴ��ַ�����ڴ��е�p����
 * */
public class Class2 {
	/*����������һ������ĺ�������Ϊ�������ڣ����Ա�jvm����
 *  public��Ȩ�����
 *  static��������ļ��ش�����
 *  void���޷���ֵ
 *  main:����ĵ��ʣ����Ա�jvmʶ��
 *  String[] args���ַ�������*/
	public static void main(String[] args){
	Person1 p1=new Person1();
	p1.show();System.out.println(Person1.country);
	int[] arr={3,4,1,8};
	System.out.println("max="+getMax(arr));
	//ArrayTool tool=new ArrayTool();ֱ�ӵ��ã���ʡ�ռ�
	int max=ArrayTool.getMax(arr);
	System.out.println("max="+max);
	ArrayTool.printArray(arr);
	ArrayTool.bubbleSort(arr);
	ArrayTool.printArray(arr);
	//��̬�����
	new  StaticCode(5);
	StaticCode.show();
	}
	//ÿ��Ӧ�ó����ж��й��ԵĹ��ܣ����Խ��и���
	public static int getMax(int[] arr){
	int max=0;
	for(int x=1;x<arr.length;x++){
		if(arr[x]>arr[max])
			max=x;
	}
	return arr[max];
	}
}
