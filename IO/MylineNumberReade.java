package IO;
import java.io.*;

class MyLineNumberReader{
	private Reader r;
	private int lineNumber;
	MyLineNumberReader(Reader r){
		this.r=r;
	}
	public String myReadLine() throws IOException{
		lineNumber++;
		StringBuilder sb=new StringBuilder();
		int ch=0;
		while((ch=r.read())!=-1){
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else 
				sb.append((char)ch);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
						
		}
	public void  myClose()throws IOException{
		r.close();
	}
		
	
	public void setLineNumber(int lineNumber){
		this.lineNumber=lineNumber;
	}
	
	public int getLineNumber(){
		return lineNumber;
	}
	
}
public class MylineNumberReade {
	 public static void main(String[] args) throws IOException{
		 FileReader fr=new FileReader("D:\\Users\\admin\\workspace\\IO\\src\\IO\\t.txt");
		 MyLineNumberReader mylnr=new MyLineNumberReader(fr);
		 String line=null;
		 mylnr.setLineNumber(1);
		 while ((line=mylnr.myReadLine())!=null){
			 System.out.println (mylnr.getLineNumber()+":"+line);
		 }
	 }
}
