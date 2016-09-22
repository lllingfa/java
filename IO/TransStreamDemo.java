package IO;
/*readline方法是字符流BufferedReader类中的方法
 * read是字节流InputStream的方法
 * InputStreamReader
 * 流操作的基本规律：
 * 1.明确源和目的
 * 源：输入流 InputStream Reader
 * 目的：输出流 OutputStream Writer
 * 2.操作的数据是否是纯文本
 * 是：字符流
 * 不是：字节流
 * 3.当体系明确后，在明确要使用哪个具体的对象
 * 通过设备进行划分
 * 源设备：内存，硬盘，键盘
 * 目的设备：内存，硬盘，控制台
 * 1.将一个文件中的数据存储到另一个文件中，复制文件
 * 源：文件因为是源，所以使用读取流  InputStream Reader
 * 是不是操作文本文件：这时选择Reader
 * FIleReader fr=new FileReader("a.txt")
 * 是否需要提高效率
 * BufferedReader
 * BufferedReader bufr=new BufferedReader(fr)
 * 接下来明确要使用该体系中的哪个对象
 * 明确设备：reader体系中可以操作文件的对象是FileReader
 * 目的：文件
 *是否是纯文本
 *是：Writer
 *设备：硬盘，一个文件
 *可以操作文件的对象FileWriter
 *FileWriter fw=new DileWriter("b.txt")
 *BufferedWriter bufw=new BufferedWriter(fw)
 *-----------------------------------------------------
 *2.将键盘录入的数据保存到一个文件中
 *源：InputStream Reader
 *是不是纯文本
 *Reader
 *设备：键盘
 *对应的对象是System.in
 *对应的是字节流，转成字符流
 *InputStreamReader
 *BufferedReader
 *目的：OutputStream Writer
 *是否是纯文本，Writer
 *设备：硬盘，使用FileWriter,使用默认编码表
 *扩展，按照指定的编码表，存到文件中（utf-8）
 *只有转换流可以指定
 *OutputStreamWriter
 *
 *
 *
 * */
import java.io.*;
 class TransStreamDemo {
	public static void main(String[] args) throws IOException{
		//获取键盘录入对象
		InputStream in=System.in;
		//将字节流转为字符流,使用转换流 InputStreamReader
		InputStreamReader isr=new InputStreamReader(in);
	    //为了提高效率，将字符串进行缓冲区技术高效存取
		BufferedReader bufr=new BufferedReader(isr);
		//键盘录入最常见写法
		BufferedReader bufr1=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bufr2=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Users\\admin\\workspace\\IO\\src\\IO\\Copypic.java")));
		OutputStream out=System.out;
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bufw=new BufferedWriter(osw);
		BufferedWriter bufw1=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bufw2=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Users\\admin\\workspace\\IO\\src\\IO\\Copy1.txt"),"UTF-8"));
		System.setIn(new FileInputStream("D:\\Users\\admin\\workspace\\IO\\src\\IO\\Copy1.txt"));
		System.setOut(new PrintStream("zz.txt"));
		String line=null;
		while((line=bufr2.readLine())!=null){
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
			bufw2.write(line.toUpperCase());
			bufw2.newLine();
			bufw2.flush();
			//osw.write(line.toUpperCase()+"\r\n");
			//osw.flush();
			//System.out.println(line.toUpperCase());
		}
		bufr.close();
		bufr1.close();
		bufw2.close();
		bufw.close();
		bufw1.close();
		bufr2.close();
	}
}
