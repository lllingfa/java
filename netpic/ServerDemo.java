import java.io.*;
import java.net.*;
/*演示客户端和服务端
 * 1.客户端：浏览器
 * 服务端：自定义
 * 2
 * 客户端：浏览器
 * 服务端：Tomcat服务器*/
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10009);

		Socket s=ss.accept();
		//只回复你好
		String ip=s.getInetAddress().getHostAddress();
		InputStream in=s.getInputStream();
		byte[] buf=new byte[1024];
		int len=in.read(buf);
		System.out.print(new String(buf,0,len));
		System.out.println(ip+"...connected");
		 PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		 //html语言，浏览器能解析
		 
		 //out.println("hello,client");
		out.println("<font color='red' size='7'>hello,client</font>");
		 s.close();
		 ss.close();
	}
}
