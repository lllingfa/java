package IO;

import java.io.FileWriter;
import java.io.IOException;
//¥¶¿Ì“Ï≥£
public class FileWriterDemo {
	public static void main(String[] args)  {
		FileWriter fw=null;
		try{
		fw=new FileWriter("D:\\Users\\workspace\\System\\src\\IO\\demo.txt");
		fw.write("shduiah");
		}
		catch(IOException e){
			sop("catch"+e.toString());
		}
		finally{
			try{
				if(fw!=null)
				fw.close();
			}
			catch(IOException e){
				sop(e.toString());
			}
			
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
