package IO;
/*����һ��ͼƬ
 * ˼·��
 * 1.���ֽڶ�ȡ�������ͼƬ����
 * 2.���ֽ�д�������󴴽�һ��ͼƬ�ļ������ڴ洢��ȡ����ͼƬ����
 * 3.ͨ��ѭ����д��������ݵĴ洢
 * 4.�ر���Դ*/
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
        	   throw new RuntimeException("����ʧ��");
           }
	       finally{
	    	   try{
	    		   if(fis!=null)
	    			   fis.close();
	    	   }
	    	   catch(IOException e){
	    		   throw new RuntimeException("��ȡ�ر�ʧ��");
	    	   }
	    	   try{
	    		   if(fos!=null)
	    			   fos.close();
	    	   }
	    	   catch(IOException e){
	    		   throw new RuntimeException("д��ر�ʧ��");
	    	   }
	       }
	
	}
}