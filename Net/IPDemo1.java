package Net;
import java.net.*;
public class IPDemo1 {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress i=InetAddress.getLocalHost();
		System.out.println(i.toString());
		System.out.println("adress:"+i.getHostAddress());
		System.out.println("name:"+i.getHostName());
		//Ö÷»úÃû
		InetAddress ia=InetAddress.getByName("www.baidu.com");
		System.out.println("adress:"+ia.getHostAddress());
		System.out.println("name:"+ia.getHostName());
		
		
	}
}
