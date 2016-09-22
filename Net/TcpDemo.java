package Net;
/*tcp分客户端和服务端
 * 2.客户端对应的对象时Socket
 * 服务端对应的对象是ServerSocket
 * 客户端：
 * 通过查阅Socke对象，发现在该对象建立时，就可以去连接指定主机。
 * 因为tcp是面向连接的，所以在建立socket服务时，就要有服务端存在，并连接成功
 * 
 * 步骤
 * 1.创建Socket服务，并指定要连接的主机和端口
 * */
import  java.io.*;
import java.net.*;
class TcpClient{
	public static void main(String[] args) throws IOException{
		//创建客户端,指定目的主机和端口
		Socket s=new Socket("192.168.1.150",10003);
		//为了发送数据，应该获取Socket流中的输出流
		OutputStream out=s.getOutputStream();
		out.write("tcp is come".getBytes());
		s.close();
	}
}
/*需求：定义端点接收数据并打印在控制台上
 * 服务端
 * 1.建立服务端的socket服务，ServerSocket();,并监听一个端口
 * 2.获取链接过来的客户对象
 * 通过ServerSocket的accpet方法，所以这个方法是阻塞的。没有连接就会等
 * 3.如果客户端发过来数据，那么服务端要使用对应的客户端对象，并获取到该客户端对象的
 * 读取流
 * 来读取发过来的数据，并打印在控制台
 * 4.关闭服务端（可选，一直开）*/
class TcpServer{
	public static void main(String[] args) throws IOException{
		//建立服务
		ServerSocket ss=new ServerSocket(10003);
		//获取连接过来的客户端对象
		Socket s=ss.accept();
		//接收数据
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		InputStream in=s.getInputStream();
		byte[] buf=new byte[1024];
		int len=in.read(buf);
		System.out.println(new String(buf,0,len));
		s.close();
		ss.close();
		
	}
}
