package Net;
import java.io.*;
import java.net.*;
/*演示tcp的传输的客户端和服务端的互访
 * 需求：客户端给服务端发送数据，服务端收到后，给客户端反馈信息
 * 
 * */
class TcpClient2{
	public static void main(String[] args) throws IOException{
	Socket s=new Socket("192.168.1.150",10004);
	//为了发送数据，应该获取Socket流中的输出流
	OutputStream out=s.getOutputStream();
	out.write("tcp is come".getBytes());
	InputStream in=s.getInputStream();
	byte[] buf=new byte[1024];
	int len=in.read(buf);
	System.out.println(new String(buf,0,len));
	s.close();}
}
class TcpServer2{
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(10004);
		//获取连接过来的客户端对象
		Socket s=ss.accept();
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		InputStream in=s.getInputStream();
		byte[] buf=new byte[1024];
		int len=in.read(buf);
		System.out.println(new String(buf,0,len));
		OutputStream out=s.getOutputStream();
		out.write("received,thank you".getBytes());
		
	}
}

