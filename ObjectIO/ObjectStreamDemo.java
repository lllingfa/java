package ObjectIO;
import java.io.*;

public class ObjectStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		//writeObj();
		//∂¡∂‘œÛ
		readObj();
	}
	public static void readObj() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\obj.txt"));
		Person p=(Person)ois.readObject();
		System.out.println(p);
		ois.close();
	}
	public static void writeObj() throws FileNotFoundException, IOException{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\obj.txt"));
		oos.writeObject(new Person("lisi",39,"kr"));
		oos.close();
	}
}
