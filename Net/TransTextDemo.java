package Net;
/*���󣺽���һ���ı�װ��������
 * �ͻ��˸�����˷����ı�������˻Ὣ�ı�ת�ɴ�д�ڷ��ظ��ͻ���
 * ���ҿͻ��˿��Բ��ϵĽ����ı�ת�������ͻ�������overʱ��ת������
 * ������
 * ��Ȼ�ǲ����豸�ϵ����ݣ��Ϳ���ʹ��io������������io�Ĳ���������˼��
 * Դ������¼��
 * Ŀ�ģ����������
 * ���Ҳ��������ı����ݣ�����ѡ���ַ���
 * ���裺
 * 1.��������
 * 2.��ȡ����¼��
 * 3.�����ݷ��������
 * 4.��ȥ����˷��صĴ�д����
 * 5.����������Դ
 * �����ı����ݣ�����ʹ���ַ������������뻺��
 * 
 * */
import java.io.*;
import java.net.*;
class TranClient{
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("192.168.1.150",10005);
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		//����Ŀ�ģ�������д��socket����������������
		BufferedWriter bufOut=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	    //����һ��socket��ȡ������ȡ����˷��صĴ�д��Ϣ
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
/*����ˣ�
 * Դ��socket
 * Ŀ�ģ�*/
class TransServer{
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(10005);
		Socket s=ss.accept();
		//��ȡ���е�����
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//Ŀ�ģ�����д����д�뵽socket������������͸��ͻ���
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
/*�����ӳ��ֵ�����
 * ���󣺿ͻ��˺ͷ���˶���Ī���ĵȴ�
 * ��Ϊ�ͻ��˺ͷ���˶�������ʽ������û�н�����ǣ����ڵȴ�
 * */
