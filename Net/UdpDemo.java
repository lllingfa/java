package Net;
import java.io.IOException;
import java.net.*;
/*通过Udp传输方式，将一段文字数据发送出去。
 * 思路：
 * 1.建立udpSocket服务
 * 2.提供数据，并将数据封装到数据包中
 * 3.通过socket服务的发送功能，将数据包发出去
 * 4.关闭资源*/
public class UdpDemo {
	public static void main(String[] args) throws IOException{
		//创建udp服务，通过DatagramSocket对象
		DatagramSocket ds=new DatagramSocket(8888);
		//确定数据，并封装成数据包,DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		byte[] buf="udp is come".getBytes();
		DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.150"),10000);
		//将已有的数据发送出去，通过send方法
		ds.send(dp);
		//关闭资源
		ds.close();
	}
	
}
//定义一个应用程序，用于接收udp协议传输的数据并处理的
/*
 * 思路
 * 1.定义udpsocket服务，定义接收端，监听一个端口，
 * 其实就是给这个接收网络应用程序定义数字标识，方便于明确哪些数据过来会做出处理
 * 2.定义一个数据包，因为要存储接收到的字节数据
 * 因为数据包对象中有更多的功能可以提取字节书记中的不同数据信息
 * 3.通过socket服务的receive方法将受到的数据存入已定义好的数据包中
 * 4.通过数据包对象的特有功能。将这些不同的数据取出，打印在控制台上
 * 5.关闭资源*/
class UdpRace{
	public static void main(String[] args) throws IOException{
		//1.创建udp socket，建立端点
		DatagramSocket ds=new DatagramSocket(10000);
		//2.定义数据包，用于存储数据
		byte[] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		//通过服务的receive方法将收到的数据存入数据包中
		ds.receive(dp);
		//4.通过数据包的方法获取其中的数据
		String ip=dp.getAddress().getHostAddress();
		
		String data=new String(dp.getData(),0,dp.getLength()); 
		int port=dp.getPort();
		System.out.println(ip+"::"+data+"::"+port);
		//关闭资源
		ds.close();
		
	}
}
