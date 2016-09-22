package File;
import java.io.*;
import java.nio.file.Files;
/*�г�ָ��Ŀ¼�µ��ļ������ļ���
 * ��ΪĿ¼�»���Ŀ¼��ֻҪʹ��һ���г�Ŀ¼���ܵĺ�����ɼ���
 * ���г������г��ֵĻ���Ŀ¼�Ļ����������ٴε��ñ�����
 * Ҳ���Ǻ�������������������ݹ�
 * �ݹ�Ҫע�⣺
 * 1.�޶�����
 * 2.ע��ݹ�Ĵ��������������ڴ������*/
public class FileDemo3 {
	public static void main(String[] args){
		File dir=new File("D:\\Users\\workspace\\File");
		showDir(dir,0);
		
		//toBin1(6);
		//sop(getSum(10));
	}
	//����ε�
	public static String getLevel(int level){
		StringBuilder sb=new StringBuilder();
		sb.append("|--");
		for(int x=0;x<level;x++){
			sb.insert(0,"| ");
		}
		return sb.toString();
 	}
	public static void toBin(int num){
		while(num>0){
			sop(num%2);
			num=num/2;
		}
	}
	public static void toBin1(int num){
		if(num>0){
			toBin1(num/2);
			sop(num%2);
			
		}
	}
	public static int getSum(int n){
		if(n==1)
			return 1;
		return n+getSum(n-1);
	}
	public static void showDir(File dir,int level){
		sop(getLevel(level)+dir.getName());
		level++;
		File[] files=dir.listFiles();
		for(int x=0;x<files.length;x++){
			if(files[x].isDirectory())
				showDir(files[x],level);
			else
			sop(getLevel(level)+files[x]);
		}
	} 
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
