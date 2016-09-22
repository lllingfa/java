package File;
import java.io.*;
public class FileDemo2 {
	public static void main(String[] args) {
		listDemo();
		listRootDemo();
		list_Demo3();
	}
	public static void list_Demo3(){
		File dir=new File("D:\\Users\\workspace\\File\\src\\File");
		File[] files=dir.listFiles();
		for(File f:files){
			sop(f.getName()+"::"+f.length());
		}
	}
	public static void lisatDemo_2(){
		File dir=new File("D:\\Users\\workspace\\File\\src\\File");
		String[] arr=dir.list(new FilenameFilter(){
			public boolean accept(File dir,String name){
				sop("dir:"+dir+"....name...:"+name);
				return name.endsWith(".java");
				
			}
		});
		for(String name:arr){
			sop(name);
		}
	}
	
	public static void listDemo(){
		File f=new File("c:\\");
		//包含隐含文件
		String[] names=f.list();//调用list的方法的file对象必须是封装了一个目录
		for(String name:names){
			sop(name);
		}
	}
	public static void listRootDemo(){
		File[] files=File.listRoots();
		for(File f:files){
			sop(f.length());
		}
		}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
