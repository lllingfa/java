import java.io.*;
import java.net.*;
public class MyIE {
	public static void main(String[] args) throws IOException {
		Socket s=new Socket("192.168.1.150",10009);
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		out.println("set:Accept:*/*");
		out.println();
		String line=null;
		BufferedReader bufr=new BufferedReader(new InputStreamReader(s.getInputStream()));
	    while((line=bufr.readLine())!=null){
	    	out.println(line);
	    }
	    s.close();
	}
}
