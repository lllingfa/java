package IO;
/*ÓÃ»º³åÇø¸´ÖÆÎÄ¼þ*/
import java.io.IOException;
import java.io.*;
public class CopyTextByBuf {
	public static void main(String[] args) {
		BufferedReader bufr=null;
		BufferedWriter bufw=null;
		try{
			bufr=new BufferedReader(new FileReader("D:\\Users\\workspace\\IO\\src\\IO\\Buffferedwriter.java"));
			bufw=new BufferedWriter(new FileWriter("bufWriter_copy.txt"));
			String line=null;
			while((line=bufr.readLine())!=null){
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
			}
		}
		catch(IOException e){
			throw new RuntimeException("¶ÁÐ´Ê§°Ü");
		}
		finally{
			try{
				if(bufr!=null){
					bufr.close();
				}}
				catch(IOException e){
					throw new RuntimeException("¶Á¹Ø±ÕÊ§°Ü");
					
				}
				try{
					if(bufw!=null){
						bufw.close();
					}}
					catch(IOException e){
						throw new RuntimeException("Ð´¹Ø±ÕÊ§°Ü");
						
					}
			}
		}
	}

