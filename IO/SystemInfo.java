package IO;
import java.util.*;
import java.io.*;
public class SystemInfo {
	public static void main(String[] args) throws FileNotFoundException{
		Properties prop=System.getProperties();
		System.out.println(prop);
		prop.list(new PrintStream("D:\\Users\\workspace\\IO\\sysinfo.txt"));
		
		
		
	}
}
