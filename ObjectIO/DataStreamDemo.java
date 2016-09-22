package ObjectIO;
import java.io.*;
/*可以用于操作基本数据类型的数据的流对象*/
public class DataStreamDemo {
	public static void main(String[] args) throws IOException{
		readData();
		writeData();
		writeUTFDemo();
		readUTFDemo();
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\utf.txt"),"utf-8");
	    osw.write("nihao");
	    osw.close();
	}
	public static void readUTFDemo() throws IOException{
		DataInputStream dis=new DataInputStream(new FileInputStream("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\UTFdat.txt"));
		String s=dis.readUTF();
		System.out.println(s);
		dis.close();
	}
	public static void writeUTFDemo() throws IOException{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\UTFdat.txt")); 
		dos.writeUTF("nihao");
		dos.close();
	}
	public static void readData() throws IOException{
		DataInputStream dis=new DataInputStream(new FileInputStream("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\dat.txt"));
		int num=dis.readInt();
		boolean b=dis.readBoolean();
		double d=dis.readDouble();
		System.out.println(num);
		System.out.println(b);
		System.out.println(d);
		dis.close();
	}
	public static void writeData() throws IOException{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\dat.txt"));
		dos.writeInt(32);
		dos.writeBoolean(true);
		dos.writeDouble(98887.54);
	}
}
