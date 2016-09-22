package File;
import java.io.*;
/*File�ೣ��������
 * 1.����
 *  boolean createNewFile():��ָ��λ�ô����ļ�������Ѿ�������
 *   boolean	mkdir() :�����ļ���
 *   boolean	mkdirs() �������༶�ļ���
 * 2.ɾ��
 *  boolean	delete() ɾ��ʧ�ܷ���false
 *   void deleteOnExit() �ڳ����˳�ʱɾ��ָ���ļ�
 * 3.�ж�
 * boolean	exists():�ļ��Ƿ����
 * boolean	isFile() 
 * boolean	isDirectory()
 * boolean	isAbsolute() 
 * 4.��ȡ��Ϣ
 *  String	getName() 
 *  String	getParent() 
 *  String	getPath() 
 *  String	getAbsolutePath() 
 *  long	lastModified() 
 *  long	length() 
 * 
 * 2.static File[]	listRoots() */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//consMethod();
		//method_1();
		method_2();
		method_3();
		method_4();
		method_5();
		
	}
	
	public static void method_5(){
		File f1=new File("D:\\Users\\workspace\\File\\file.txt");
		File f2=new File("D:\\Users\\workspace\\File\\file1.txt");
		sop("rename:"+f1.renameTo(f2));
		//�����ƶ�
				
		}
	public static void method_4(){
		
		File f=new File("D:\\Users\\workspace\\File\\src\\File\\file.txt");
		sop("path:"+f.getPath());
		sop("abspath:"+f.getAbsolutePath());
		sop("parent:"+f.getParent());//�÷������ص��Ǿ���·���е��ļ��ĸ�Ŀ¼��������·�������ؿ�
		//������·������Ŀ¼������һ�β�Ŀ¼���н��
	}
	public static void method_3(){
		File f=new File("D:\\Users\\workspace\\File\\src\\File\\file.txt");
		//�ж��Ƿ����ļ�����Ŀ��ʱ�������ж��Ƿ����
		f.mkdir();
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());
	   sop(f.isAbsolute());
	}
	public static void method_2(){
		File f=new File("D:\\Users\\workspace\\File\\src\\File\\file.txt");
		sop("execute:"+f.canExecute());
		
		sop("exists:"+f.exists());
		//����Ŀ¼1��
		File dir=new File("D:\\Users\\workspace\\File\\src\\File\\abc");
		sop("mkdir:"+dir.mkdir());
	}
	public static void method_1() throws IOException{
		File f=new File("D:\\Users\\workspace\\File\\src\\File\\file.txt");
		sop("create:"+f.createNewFile());
		sop("delete:"+f.delete());
		f.deleteOnExit();
	}
	//����File����
	public static void consMethod(){
		//��a.txt��װ��file���󡣿��Խ����еĺ�δ���ֵ��ļ������ļ��з�װ�ɶ���
		File f1=new File("D:\\Users\\workspace\\File\\src\\File\\a.txt");
		File f2=new File("D:\\Users\\workspace\\File\\src\\File","b.txt");
		File d=new File("D:\\Users\\workspace\\File\\src\\File");
	    File f3=new File(d,"c.txt");
	    File f4=new File("D:"+File.separator+"Users"+File.separator+"workspace"+File.separator+"File"+File.separator+"src"+File.separator+"File"+File.separator+"a.txt");
	    //\\��/Ч��һ����Ŀ¼�ָ���
	    sop("f1:"+f1);
	    sop("f2:"+f2);
	    sop("f3:"+f3);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
