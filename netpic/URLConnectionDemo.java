import java.net.*;
import java.io.*;
public class URLConnectionDemo {
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://192.168.1.150:10009/");
		URLConnection conn=url.openConnection();
		System.out.println(conn);
		InputStream in=conn.getInputStream();
		byte[] buf=new byte[1024];
		int len=in.read(buf);
		System.out.println(new String (buf,0,len));
	}
}
