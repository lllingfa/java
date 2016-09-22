package IO;
import java.io.*;
//练习一个带行号的读
public class LineNumberReaderDemo {
 public static void main(String[] args) throws IOException{
	 FileReader fr=new FileReader("D:\\Users\\admin\\workspace\\IO\\src\\IO\\t.txt");
	 LineNumberReader ln=new LineNumberReader(fr);
	 String line=null;
	 ln.setLineNumber(0);
	 while ((line=ln.readLine())!=null){
		 System.out.println(ln.getLineNumber()+":"+line);
	 }
	 ln.close();
 }
}
