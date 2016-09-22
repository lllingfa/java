package IO;
/*复制一个图片
 * 思路：
 * 1.用字节读取流对象和图片关联
 * 2.用字节写入流对象创建一个图片文件，用于存储获取到的图片数据
 * 3.通过循环读写，完成数据的存储
 * 4.关闭资源*/
import java.io.*;

public class Copypic {
	public static void main(String[] args) {
           FileOutputStream fos=null;
           FileInputStream fis=null;
           try{
        	   fos=new FileOutputStream("D:\\Users\\admin\\workspace\\IO\\src\\273-1-1600x9001.jpg");
        	   fis=new FileInputStream("D:\\Users\\admin\\workspace\\IO\\src\\273-1-1600x900.jpg");
               byte[] buf=new byte[1024];
               int len=0;
               while((len=fis.read(buf))!=-1){
            	   fos.write(buf,0,len);
               }
           }
           catch(IOException e){
        	   throw new RuntimeException("复制失败");
           }
	       finally{
	    	   try{
	    		   if(fis!=null)
	    			   fis.close();
	    	   }
	    	   catch(IOException e){
	    		   throw new RuntimeException("读取关闭失败");
	    	   }
	    	   try{
	    		   if(fos!=null)
	    			   fos.close();
	    	   }
	    	   catch(IOException e){
	    		   throw new RuntimeException("写入关闭失败");
	    	   }
	       }
	
	}
}