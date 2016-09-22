package ObjectIO;
import java.io.*;
/*用于操作字节数组的流对象
 * ByteArrayInputStream：在构造对象的时候，需要接收数据源，。而且数据源是一个字节数组
 * ByteArrayOutputStream：在构造的时候，不用定义数据目的，因为该对象中已经内部封装了可变长度的字节数组
 * 这就是数据的目的地
 * 因为这两个流对象都操作的数组，并没有使用系统资源，所以，不用进行close关闭
 * 在流操作规律讲解时：
 * 源设备：
 * 键盘System.in，硬盘filestream，内存arraystream
 * 目的设备：
 * 控制台system.out，硬盘filestream，内存arraytstream
 * 用流的读写思想来操作数组*/
public class ByteArrayStreamDemo {
	public static void main(String[] args) {
		//数据源
		ByteArrayInputStream bis=new ByteArrayInputStream("ADFBH".getBytes());
		//数据目的
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		//读写
		int by=0;
		while((by=bis.read())!=-1){
			bos.write(by);
		}
		System.out.println(bos.size());
	}
}
