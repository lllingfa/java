package class2;



/*object�����ж���ֱ�ӻ��߼�Ӹ��࣬�����ж���Ŀ϶�������
 * ���󶼾߱��Ĺ���
 * */
class Demo12
{   private int num;
    Demo12(int num){
    	this.num=num;
    }
	public boolean equals(Object obj){
	if(!(obj instanceof Demo))
         return false;
			Demo12 d=(Demo12)obj;
	return this.num==d.num;
}
	}
class person221{}
public class DTObject {
	public static void main(String[] args){
		Demo12 d1=new Demo12(4);
		Demo12 d2=new Demo12(4);
		System.out.println(d1.toString());
		System.out.println(Integer.toHexString(d1.hashCode()));
		Demo12 d3=d1;
		//��ֵַ
		System.out.println(d1.equals(new person221()));
		
	}
}
