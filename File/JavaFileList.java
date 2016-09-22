package File;
/*��һ��ָ��Ŀ¼�µ�java�ļ��ľ���·�����洢��һ���ı��ļ��С�
 * ����һ��java�ļ����б��ļ�
 * ˼·��
 * 1.��ָ����Ŀ¼���еݹ�
 * 2.��ȡ�ݹ�������е�java�ļ���·��
 * 3.����Щ·���洢��������
 * 4.�������е�����д�뵽һ���ļ���*/
import java.io.*;
import java.util.*;

public class JavaFileList {
	public static void main(String[] args) throws IOException{
		File dir=new File("D:\\Users\\workspace\\File\\src\\File");
		List<File> list=new ArrayList<File>();
		fileToList(dir,list);
		File file=new File(dir,"file.txt");
		writeToFile(list,file.toString());
		sop(list.size());
	}
	public static void fileToList(File dir,List<File> list){
		File[] files=dir.listFiles();
		for(File file:files){
			if(file.isDirectory())
				fileToList(file,list);
			else{
				if(file.getName().endsWith(".java"))
					list.add(file);
			}
		}
	}
	//�浽�ļ���
	public static void writeToFile(List<File> list,String javaListFile) throws IOException{
		BufferedWriter bufw=null;
		try{
			bufw=new BufferedWriter(new FileWriter(javaListFile));
			for(File f:list)
			{
				String path=f.getAbsolutePath();
				bufw.write(path);
				bufw.newLine();
				bufw.flush();
			}
		}
		catch(IOException e){
			throw e;
			
		}
		finally{
			try{
				if(bufw!=null)
					bufw.close();
				}
			catch(IOException e){
				throw e;
			}
		}
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
