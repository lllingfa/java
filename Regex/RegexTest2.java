import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*��ҳ���棨֩�룩
 * */
public class RegexTest2 {
	public static void main(String[] args) throws IOException{
		getMail() ;
	}
	/*��ȡָ���ĵ��е��ʼ���ַ
	 * pattern Matchera*/
	public static void getMail() throws IOException{
		BufferedReader bufr=new BufferedReader(new FileReader("D:\\Users\\workspace\\Regex\\src\\mail.txt"));
		String line =null;
		String reg="\\w+@\\w+(\\.\\w+)+";
		Pattern p=Pattern.compile(reg);
		while((line=bufr.readLine())!=null){
			Matcher m=p.matcher(line);
			while(m.find()){System.out.println(m.group());}
			
		}
		
	}
}
