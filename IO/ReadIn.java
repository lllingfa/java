package IO;

import java.io.*;

/*读取键盘录入
 * System.out:对应的是标准的输出设备，控制台
 * System.in:对应的是标准输入设备：键盘
 * 读一行数据的原理，即readline方法
 * 能不能直接使用readline方法读取呢*/
public class ReadIn {
	public static void main(String[] args) throws IOException{
		InputStream in =  System.in;
		StringBuilder sb=new StringBuilder();
		while(true){
			int ch=in.read();
			if(ch=='\r')
				continue;
			if(ch=='\n')
			{
				String s=sb.toString();
				if("over".equals(s))
					break;
				//打印字符
				System.out.println(s.toUpperCase());
				//清空缓存
				sb.delete(0, sb.length());
			}
			else
				sb.append((char)ch);
		}
		
	}
}