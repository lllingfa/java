package Net;
/*需求：建立一个文本装换服务器
 * 客户端给服务端发送文本，服务端会将文本转成大写在返回给客户端
 * 而且客户端可以不断的进行文本转换。当客户端输入over时，转换结束
 * 分析：
 * 既然是操作设备上的数据，就可以使用io技术，并按照io的操作规律来思考
 * 源：键盘录入
 * 目的：网络输出流
 * 而且操作的是文本数据，可以选择字符流
 * 步骤：
 * 1.建立服务
 * 2.获取键盘录入
 * 3.将数据发给服务端
 * 4.后去服务端返回的大写数据
 * 5.结束，关资源
 * 都是文本数据，可以使用字符流操作，加入缓冲
 * 
 * */
import java.io.*;
import java.net.*;
class TranClient{
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("192.168.1.150",10005);
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		//定义目的，将数据写入socket输出流，发给服务端
		BufferedWriter bufOut=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	    //定义一个socket读取流，读取服务端返回的大写信息
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;
	     while((line=bufr.readLine())!=null){
				if("over".equals(line))
					break;
				bufOut.write(line);
				bufOut.newLine();
				bufOut.flush();
				
				String str=bufIn.readLine();
				System.out.println("server:"+str);
				
				}
	     bufr.close();
	     s.close();
	}
}
/*服务端：
 * 源：socket
 * 目的：*/
class TransServer{
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(10005);
		Socket s=ss.accept();
		//读取流中的数据
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//目的，将大写数据写入到socket输出流，并发送给客户端
		BufferedWriter bufOut=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line=null;
	     while((line=bufIn.readLine())!=null){
	    	 bufOut.write(line.toUpperCase());
	    	 bufOut.newLine();
	    	 bufOut.flush();
	     }
	     s.close();
	     ss.close();
	}
}
/*该例子出现的问题
 * 现象：客户端和服务端都在莫名的等待
 * 因为客户端和服务端都有阻塞式方法，没有结束标记，都在等待
 * */
