package Net;
import java.io.IOException;
import java.net.*;
/*ͨ��Udp���䷽ʽ����һ���������ݷ��ͳ�ȥ��
 * ˼·��
 * 1.����udpSocket����
 * 2.�ṩ���ݣ��������ݷ�װ�����ݰ���
 * 3.ͨ��socket����ķ��͹��ܣ������ݰ�����ȥ
 * 4.�ر���Դ*/
public class UdpDemo {
	public static void main(String[] args) throws IOException{
		//����udp����ͨ��DatagramSocket����
		DatagramSocket ds=new DatagramSocket(8888);
		//ȷ�����ݣ�����װ�����ݰ�,DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		byte[] buf="udp is come".getBytes();
		DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.150"),10000);
		//�����е����ݷ��ͳ�ȥ��ͨ��send����
		ds.send(dp);
		//�ر���Դ
		ds.close();
	}
	
}
//����һ��Ӧ�ó������ڽ���udpЭ�鴫������ݲ������
/*
 * ˼·
 * 1.����udpsocket���񣬶�����նˣ�����һ���˿ڣ�
 * ��ʵ���Ǹ������������Ӧ�ó��������ֱ�ʶ����������ȷ��Щ���ݹ�������������
 * 2.����һ�����ݰ�����ΪҪ�洢���յ����ֽ�����
 * ��Ϊ���ݰ��������и���Ĺ��ܿ�����ȡ�ֽ�����еĲ�ͬ������Ϣ
 * 3.ͨ��socket�����receive�������ܵ������ݴ����Ѷ���õ����ݰ���
 * 4.ͨ�����ݰ���������й��ܡ�����Щ��ͬ������ȡ������ӡ�ڿ���̨��
 * 5.�ر���Դ*/
class UdpRace{
	public static void main(String[] args) throws IOException{
		//1.����udp socket�������˵�
		DatagramSocket ds=new DatagramSocket(10000);
		//2.�������ݰ������ڴ洢����
		byte[] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		//ͨ�������receive�������յ������ݴ������ݰ���
		ds.receive(dp);
		//4.ͨ�����ݰ��ķ�����ȡ���е�����
		String ip=dp.getAddress().getHostAddress();
		
		String data=new String(dp.getData(),0,dp.getLength()); 
		int port=dp.getPort();
		System.out.println(ip+"::"+data+"::"+port);
		//�ر���Դ
		ds.close();
		
	}
}
