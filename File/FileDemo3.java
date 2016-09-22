package File;
import java.io.*;
import java.nio.file.Files;
/*列出指定目录下的文件或者文件夹
 * 因为目录下还有目录，只要使用一个列出目录功能的函数完成即可
 * 在列出过程中出现的还是目录的话，还可以再次调用本功能
 * 也就是函数自身调用自身，叫做递归
 * 递归要注意：
 * 1.限定条件
 * 2.注意递归的次数。尽量避免内存溢出。*/
public class FileDemo3 {
	public static void main(String[] args){
		File dir=new File("D:\\Users\\workspace\\File");
		showDir(dir,0);
		
		//toBin1(6);
		//sop(getSum(10));
	}
	//带层次的
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
