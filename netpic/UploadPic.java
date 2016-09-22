/*客户端。
 * 1.服务端点
 * 2.读取客户端已有的图片数据
 * 3.通过Socket输出流将数据发给服务端
 * 4.读取服务端反馈信息
 * 5.关闭*/
import java.io.*;
import java.net.*;
class PicClient{
	public static void main(String[] args) throws IOException{
		//判断是否传入文件参数
		if(args.length!=1){
			System.out.println("please choose a pic end with jpg");
			return;
		}
		//判断文件是否存在
		File file=new File(args[0]);
		if(!(file.exists())&&file.isFile()){
			System.out.println("wrong file,or not exist or not file");
		}
		//判断文件格式
		if(!file.getName().endsWith(".jpg"))
		{
			System.out.println("wrong file format,please rechoose");
			return;
		}
		//限制文件的大小
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
		//告诉服务端数据已写完
		s.shutdownOutput();
		InputStream in=s.getInputStream();
		byte[] bufIn=new byte[1024];
		int num=in.read(bufIn);
		System.out.println(new String(bufIn,0,num));
		fis.close();
		s.close();
	}
}
/*服务端
 * 这个服务端有个局限性，当A客户端连接上以后，被服务端获取到，服务端执行具体流程
 * 这时B客户端只有等待
 * 因为服务端还没有处理完A客户端的请求，还没循环回来执行下次accept方法，所以暂时获取
 * 不到B客户端对象
 * 为了可以让多个客户端同时并发访问服务端。那么服务端最好就是讲每个客户端封装到一个单独的线程中
 * 这样，就可以同时处理多个客户端请求
 * 如何定义线程呢
 * 只要明确了每一个客户端在服务端执行的代码即可，将其存入run方法中*/
class PicThread implements Runnable{
	private Socket s;
	PicThread(Socket s){
		this.s=s;
	}
	public void run(){
		String ip=s.getInetAddress().getHostAddress();
		//不能共享，只能存局部
		int count=1;
		try{
			
			System.out.println(ip+"...connected");
			InputStream in=s.getInputStream();
			File file=new File("D:\\Users\\workspace\\NetPic\\src\\"+ip+"("+(count)+")"+".jpg");
			//while找到不存在的保存
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
