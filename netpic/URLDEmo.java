import java.io.IOException;
import java.net.*;
public class URLDEmo {
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://192.168.1.150:10009/");
		System.out.println("getProtocol()"+url.getProtocol());
		System.out.println("getPort()"+url.getPort());
	}
	
}
/*getHost()
 *getPort()
 *getProtocol() 
 *getPath() 
 * */
 