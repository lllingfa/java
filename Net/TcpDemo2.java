package Net;
import java.io.*;
import java.net.*;
/*��ʾtcp�Ĵ���Ŀͻ��˺ͷ���˵Ļ���
 * ���󣺿ͻ��˸�����˷������ݣ�������յ��󣬸��ͻ��˷�����Ϣ
 * 
 * */
class TcpClient2{
	public static void main(String[] args) throws IOException{
	Socket s=new Socket("192.168.1.150",10004);
	//Ϊ�˷������ݣ�Ӧ�û�ȡSocket���е������
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
		//��ȡ���ӹ����Ŀͻ��˶���
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

