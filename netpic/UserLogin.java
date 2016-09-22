import java.io.*;
import java.net.*;
/*用户登录，最多3次*/
class LoginClient{
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("192.168.1.150",10008);
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		  PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		  BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		  for(int x=0;x<3;x++){
			  String line=bufr.readLine();
			  //空
			  if(line==null)
				  break;
			  
			  out.println(line);
			  String info=bufIn.readLine();
			  System.out.print("info:"+info);
			  //welcome。跳转
			  if(info.contains("welcome"))
				  break;
		  }
		  bufr.close();
		  s.close();
	}
}

class UserThread implements Runnable{
	private Socket s;
	UserThread(Socket s){
		this.s=s;
	}
	public void run(){
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		try{
			
			 PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			 for(int x=0;x<3;x++){
				 BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
				 String name=bufIn.readLine();
				 if(name==null)
					 break;
				 BufferedReader bufr=new BufferedReader(new FileReader("D:\\Users\\workspace\\NetPic\\src\\user.txt"));
				 String line=null;
				 boolean flag=false;
				 while((line=bufr.readLine())!=null)
				 {
					 if(line.equals(name)){
						 flag=true;
						 break;
					 }
					 
				 }
				 if(flag){
					 System.out.println(name+":login in");
					 out.println(name+"welcome");
					 break;
				 }
				 else{
					 System.out.println(name+":try to login");
					 out.println(name+"...no user");
				 }
			 }
			 s.close();
		}
		catch(Exception e){
			throw new RuntimeException("fail");
		}
	}
	
}
//线程，多用户登录,循环监听
class LoginServer{
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(10008);
		while(true){
			Socket s=ss.accept();
			new Thread(new UserThread(s)).start();}
	}
}