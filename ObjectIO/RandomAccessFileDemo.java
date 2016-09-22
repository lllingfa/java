package ObjectIO;
/*RandomAccessFile
 * ���಻������IO��ϵ�е����ࡣ
 * ����ֱ�Ӽ̳���Object
 * ��������IO���г�Ա����Ϊ���߱�����д����
 * �ڲ���װ��һ�����飬����ͨ��ָ��������Ԫ�ؽ��в���
 * ����ͨ��getFilePointer��ȡָ��λ��
 * ͬʱ����ͨ��seek�ı�ָ��λ��
 * ��ʵ��ɶ�д��ԭ�����ڲ���װ���ֽ��������������
 * ͨ�����캯�����Կ���������ֻ�ܲ����ļ�
 * ���Ҳ����ļ�����ģʽ��ֻ��r,,��дrw��
 * ���ģʽΪֻ�������ᴴ���ļ�����ȥ��ȡһ���Ѵ��ڵ��ļ������û�У���ᱨ��
 * ���ģʽΪrw�����Զ������ļ�
 * ���Ҹö���Ĺ��캯��Ҫ�������ļ������ڣ����Զ�������������ڲ��Ḳ��
 * */
import java.io.*;
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		 writeFile();
		 writeFile_2();
		 System.out.println(Integer.toBinaryString(97));
		 readFile();
	}
	public static void readFile() throws IOException{
		RandomAccessFile raf=new RandomAccessFile("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\raf.txt","r");
		//��������ָ��
		raf.seek(8*0);
		//����ָ�����ֽ���,ֻ����ǰ��������������
		raf.skipBytes(8);
		byte[] buf=new byte[4];
		raf.read(buf);
		String name=new String(buf);
		int age=raf.readInt();
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	public static void writeFile_2() throws IOException{
		RandomAccessFile raf=new RandomAccessFile("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\raf.txt","rw");
		//���λ�ö�д
		raf.seek(8*3);
		raf.write("period".getBytes());
		raf.writeInt(103);
		raf.close();
	}
	public static void writeFile() throws IOException{
		RandomAccessFile raf=new RandomAccessFile("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\raf.txt","rw");
		raf.write("lisi".getBytes());
		raf.writeInt(97);
		raf.close();
	}
}
