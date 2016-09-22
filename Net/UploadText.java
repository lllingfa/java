package Net;

import java.io.*;
import java.net.*;
class TextClient{
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("192.168.1.150",10006);
		BufferedReader bufr=new BufferedReader(new FileReader("D:\\Users\\workspace\\Net\\src\\Net\\IPDemo.java"));
	    PrintWriter out=new PrintWriter(s.getOutputStream(),true);
	    //时间戳
	   /* DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	    long time=System.currentTimeMillis();
	    dos.writeLong(time);*/
	    //out.println(time);
	    String line=null;
	    while((line=bufr.readLine())!=null){
	    	out.println(line);
	    }
	    s.shutdownOutput();//关闭客户端输出流，给流中加标记
	    //out.println("over");
	    BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line1=bufIn.readLine();
		
		System.out.println("server:"+line1);
		 bufr.close();
	     s.close();
	}
}
class TextServer{
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(10006);
		Socket s=ss.accept();
		String ip=s.getInetAddress().getHostAddress();
		System.out.print(ip+"...connected");
	/*	DataInputStream dis=new DataInputStream(s.getInputStream());
		long l=dis.readLong();*/
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter out=new PrintWriter(new FileWriter("D:\\Users\\workspace\\Net\\src\\Net\\IPDemo1.java"),true);
	    String line=null;
	    while((line=bufIn.readLine())!=null){
	    	/*if("over".equals(line))
	    		break;*/
	    	out.println(line);
	    }
	    PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
	    pw.println("upload sucess");
	    s.close();
	     ss.close();
	}
}

