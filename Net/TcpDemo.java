package Net;
/*tcp�ֿͻ��˺ͷ����
 * 2.�ͻ��˶�Ӧ�Ķ���ʱSocket
 * ����˶�Ӧ�Ķ�����ServerSocket
 * �ͻ��ˣ�
 * ͨ������Socke���󣬷����ڸö�����ʱ���Ϳ���ȥ����ָ��������
 * ��Ϊtcp���������ӵģ������ڽ���socket����ʱ����Ҫ�з���˴��ڣ������ӳɹ�
 * 
 * ����
 * 1.����Socket���񣬲�ָ��Ҫ���ӵ������Ͷ˿�
 * */
import  java.io.*;
import java.net.*;
class TcpClient{
	public static void main(String[] args) throws IOException{
		//�����ͻ���,ָ��Ŀ�������Ͷ˿�
		Socket s=new Socket("192.168.1.150",10003);
		//Ϊ�˷������ݣ�Ӧ�û�ȡSocket���е������
		OutputStream out=s.getOutputStream();
		out.write("tcp is come".getBytes());
		s.close();
	}
}
/*���󣺶���˵�������ݲ���ӡ�ڿ���̨��
 * �����
 * 1.��������˵�socket����ServerSocket();,������һ���˿�
 * 2.��ȡ���ӹ����Ŀͻ�����
 * ͨ��ServerSocket��accpet������������������������ġ�û�����Ӿͻ��
 * 3.����ͻ��˷��������ݣ���ô�����Ҫʹ�ö�Ӧ�Ŀͻ��˶��󣬲���ȡ���ÿͻ��˶����
 * ��ȡ��
 * ����ȡ�����������ݣ�����ӡ�ڿ���̨
 * 4.�رշ���ˣ���ѡ��һֱ����*/
class TcpServer{
	public static void main(String[] args) throws IOException{
		//��������
		ServerSocket ss=new ServerSocket(10003);
		//��ȡ���ӹ����Ŀͻ��˶���
		Socket s=ss.accept();
		//��������
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
