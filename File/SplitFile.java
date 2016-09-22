package File;
import java.io.*;
import java.util.*;
public class SplitFile {
	public static void main(String[] args) throws IOException{
		 //splitFile();
		merge();
	}
	public static void merge() throws IOException{
		ArrayList<FileInputStream> al=new ArrayList<FileInputStream>();
		for(int x=1;x<3;x++){
			al.add(new FileInputStream("D:\\Users\\workspace\\File\\src\\File\\"+x+".part"));
			
		}
		Iterator<FileInputStream>it=al.iterator();
		Enumeration<FileInputStream> en=new Enumeration<FileInputStream>(){
			public boolean hasMoreElements(){
				return it.hasNext();
			}
			public FileInputStream nextElement(){
				return it.next();
			}
			
			};
			SequenceInputStream sis=new SequenceInputStream(en);
			FileOutputStream fos=new FileOutputStream("D:\\Users\\workspace\\File\\src\\File\\0.jpg");
			byte[] buf=new byte[1024];
			int len=0;
			while((len=sis.read(buf))!=-1){
				fos.write(buf,0,len);
			}
			fos.close();
			sis.close();
	}
	public static void splitFile() throws IOException{
		FileInputStream fis=new FileInputStream("D:\\Users\\workspace\\IO\\src\\273-1-1600x900.jpg");
		FileOutputStream fos=null;
		//1M
		byte[] buf=new byte[1024*64];
		int len=0;
		int count=1;
		while((len=fis.read(buf))!=-1)
		{
			fos=new FileOutputStream("D:\\Users\\workspace\\File\\src\\File\\"+(count++)+".part");
			fos.write(buf,0,len);
			fos.close();
		}
		fis.close();
	}
}
