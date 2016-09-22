package IO;

import java.io.FileReader;
import java.io.IOException;

class MyBuferReader{
	private FileReader r;
	MyBuferReader(FileReader r){
		this.r=r;
	}
//����һ�ζ�һ�����ݵķ���
public String myReaderLine() throws IOException{
	
	//����һ����ʱ������ԭBufferReader��װ�����ַ�����
	StringBuilder sb=new StringBuilder();
	int ch=0;
	while((ch=r.read())!=-1){
		if(ch=='\r')
			continue;
		if(ch=='\n')
			return sb.toString();
		else
			sb.append((char)ch);
	}
	if(sb.length()!=0)
		return sb.toString();
	return null;
}
public void myclose() throws IOException{
	r.close();
}
}
public class MyBufferedReader {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("buf.txt");
		MyBuferReader myBuf=new MyBuferReader(fr);
		String line=null;
		while((line=myBuf.myReaderLine())!=null){
			System.out.println(line);
		}
		myBuf.myclose();
		
	}
}
