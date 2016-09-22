package ObjectIO;

import java.io.UnsupportedEncodingException;

public class EncodeDemo2 {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String s="ÁªÍ¨";
		byte[] by=s.getBytes("gbk");
		for(byte b:by){
			System.out.println(Integer.toBinaryString(b&255));
		}
	}
}
