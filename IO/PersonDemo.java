package IO;
/*װ�����ģʽ��
 * ����Ҫ�����еĶ�����й�����ǿʱ��
 * ���Զ����࣬�����еĶ����룬�������еĹ��ܣ����ṩ��ǿ����
 * ��ô�Զ�������Ϊװ����
 * װ����ͨ����ͨ�����췽�����ձ�װ�εĶ���
 * �����ڱ�װ�ζ���Ĺ��ܣ��ṩ��ǿ�Ĺ���
 * װ����̳е�����
 * ����MyReader//ר�����ڶ�ȡ���ݵ���
 * |--MyTextReader
 *    |--MyBUfferedReader ��
 * |--MyMediaReader
 *    |--MybufferMediaReader ��
 * |--MyBufferReader
 * class MyBufferReader extends Myreader{
 * MybufferReader(Myreader r){
 * }
 * }
 * �ö�̬����ʽ�����������չ�ԣ�������ǿ
 * װ�αȼ̳�Ҫ��������������֮��Ĺ�ϵ��*/
import java.io.IOException;

class Person{
	public void chifan(){
		System.out.println("chifan");
	}
}
class SuperPerson{
	private Person p;
	SuperPerson(Person p){
		this.p=p;
	}
	public void superChifan(){
		System.out.println("��θ��");
		p.chifan();
		System.out.println("���");
	}
}
public class PersonDemo {
	public static void main(String[] args) throws IOException {
		Person p=new Person();
		SuperPerson sp=new SuperPerson(p);
		sp.superChifan();
	}
}
