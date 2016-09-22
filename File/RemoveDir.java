package File;
/*删除一个带内容的目录
 * 多目录需要递归*/
import java.io.*;
public class RemoveDir {

	public static void main(String[] args){
		File f1=new File ("D:\\Users\\workspace\\File\\src\\File\\file.txt");
		removeDir(f1);
	}
	public static void removeDir(File dir){
		File[] files=dir.listFiles();
		for(int x=0;x<files.length;x++){
			if(!files[x].isHidden()&&files[x].isDirectory())
				removeDir(files[x]);
		
		else
			sop(files[x].toString()+"::"+files[x].delete());
	}
	sop(dir+"::dir::"+dir.delete());	
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
