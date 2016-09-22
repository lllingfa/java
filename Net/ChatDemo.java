package Net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*��д�������
 * �������ݵĲ��֣��ͷ����ݵĲ���
 * ����������Ҫͬʱ����
 * ��Ҫ�õ����̼߳���
 * һ���߳̿����գ�һ�����Ʒ�
 * ��Ϊ�շ������ǲ�һ�µģ�����Ҫ��������run����
 * ��������������Ҫ��װ����ͬ������*/
class Send implements Runnable{
	private DatagramSocket ds;
	public Send( DatagramSocket ds){
		this.ds=ds;
	}
	public void run(){
		try{
			BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while((line=bufr.readLine())!=null){
				if("886".equals(line))
					break;
				byte[] buf=line.getBytes();
				DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.150"),10002);
				ds.send(dp);
		}}
		catch(Exception e){
			throw new RuntimeException("send error");
		}
		}
}
class Race1 implements Runnable{
	private DatagramSocket ds;
	public Race1( DatagramSocket ds){
		this.ds=ds;
	}
	public void run(){
		try{
			while(true){
				byte[] buf=new byte[1024];
				DatagramPacket dp=new DatagramPacket(buf,buf.length);
				ds.receive(dp);
				String ip=dp.getAddress().getHostAddress();
				String data=new String(dp.getData(),0,dp.getLength());
				System.out.println(ip+"::"+data);
				
			}
		}
		catch(Exception e){
			throw new RuntimeException("receive error");
		}
	}
	
}
public class ChatDemo {
	public static void main(String[] args) throws SocketException{
		DatagramSocket sendSocket=new DatagramSocket();
		DatagramSocket raceSocket=new DatagramSocket(10002);
		new Thread(new Send(sendSocket)).start();
		new Thread(new Race1(raceSocket)).start();
		
	}
}
