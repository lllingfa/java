/*�ͻ��ˡ�
 * 1.����˵�
 * 2.��ȡ�ͻ������е�ͼƬ����
 * 3.ͨ��Socket����������ݷ��������
 * 4.��ȡ����˷�����Ϣ
 * 5.�ر�*/
import java.io.*;
import java.net.*;
class PicClient{
	public static void main(String[] args) throws IOException{
		//�ж��Ƿ����ļ�����
		if(args.length!=1){
			System.out.println("please choose a pic end with jpg");
			return;
		}
		//�ж��ļ��Ƿ����
		File file=new File(args[0]);
		if(!(file.exists())&&file.isFile()){
			System.out.println("wrong file,or not exist or not file");
		}
		//�ж��ļ���ʽ
		if(!file.getName().endsWith(".jpg"))
		{
			System.out.println("wrong file format,please rechoose");
			return;
		}
		//�����ļ��Ĵ�С
		if(file.length()>1024*1024*5){
			System.out.println("too big");
			return;
		}
		
		Socket s=new Socket("192.168.1.150",10007);
		//"D:\\Users\\workspace\\IO\\src\\273-1-1600x900.jpg"
		FileInputStream fis=new FileInputStream(file);
		OutputStream out=s.getOutputStream();
		byte[] buf=new byte[1024];
		int len=0;
		while((len=fis.read(buf))!=-1){
			out.write(buf,0,len);
		}
		//���߷����������д��
		s.shutdownOutput();
		InputStream in=s.getInputStream();
		byte[] bufIn=new byte[1024];
		int num=in.read(bufIn);
		System.out.println(new String(bufIn,0,num));
		fis.close();
		s.close();
	}
}
/*�����
 * ���������и������ԣ���A�ͻ����������Ժ󣬱�����˻�ȡ���������ִ�о�������
 * ��ʱB�ͻ���ֻ�еȴ�
 * ��Ϊ����˻�û�д�����A�ͻ��˵����󣬻�ûѭ������ִ���´�accept������������ʱ��ȡ
 * ����B�ͻ��˶���
 * Ϊ�˿����ö���ͻ���ͬʱ�������ʷ���ˡ���ô�������þ��ǽ�ÿ���ͻ��˷�װ��һ���������߳���
 * �������Ϳ���ͬʱ�������ͻ�������
 * ��ζ����߳���
 * ֻҪ��ȷ��ÿһ���ͻ����ڷ����ִ�еĴ��뼴�ɣ��������run������*/
class PicThread implements Runnable{
	private Socket s;
	PicThread(Socket s){
		this.s=s;
	}
	public void run(){
		String ip=s.getInetAddress().getHostAddress();
		//���ܹ���ֻ�ܴ�ֲ�
		int count=1;
		try{
			
			System.out.println(ip+"...connected");
			InputStream in=s.getInputStream();
			File file=new File("D:\\Users\\workspace\\NetPic\\src\\"+ip+"("+(count)+")"+".jpg");
			//while�ҵ������ڵı���
			while(file.exists())
				file=new File("D:\\Users\\workspace\\NetPic\\src\\"+ip+"("+(count++)+")"+".jpg");
			FileOutputStream fos=new FileOutputStream(file);
			byte[] buf=new byte[1024];
			int len=0;
			while((len=in.read(buf))!=-1){
				fos.write(buf,0,len);
			}
			OutputStream out=s.getOutputStream();
			out.write("upload success".getBytes());
			fos.close();
			s.close();
		
	}
	catch(Exception e){
		throw new RuntimeException(ip+"upload failed");
	}
		
	}
	
}

class PicServer{
	
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(10007);
		while(true){
		Socket s=ss.accept();
		new Thread(new PicThread(s)).start();
		//ss.close();
	}}
}
