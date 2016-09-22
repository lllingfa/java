package IO;
/*装饰设计模式：
 * 当想要对已有的对象进行功能增强时，
 * 可以定义类，将已有的对象传入，基于已有的功能，并提供加强功能
 * 那么自定义的类称为装饰类
 * 装饰类通常会通过构造方法接收被装饰的对象
 * 并基于被装饰对象的功能，提供更强的功能
 * 装饰与继承的区别
 * 假设MyReader//专门用于读取数据的类
 * |--MyTextReader
 *    |--MyBUfferedReader 无
 * |--MyMediaReader
 *    |--MybufferMediaReader 无
 * |--MyBufferReader
 * class MyBufferReader extends Myreader{
 * MybufferReader(Myreader r){
 * }
 * }
 * 用多态的形式，可以提高扩展性，功能增强
 * 装饰比继承要灵活，降低了类与类之间的关系。*/
import java.io.IOException;

class Person{
	public void chifan(){
		System.out.println("chifan");
	}
}
class SuperPerson{
	private Person p;
	SuperPerson(Person p){
		this.p=p;
	}
	public void superChifan(){
		System.out.println("开胃酒");
		p.chifan();
		System.out.println("甜点");
	}
}
public class PersonDemo {
	public static void main(String[] args) throws IOException {
		Person p=new Person();
		SuperPerson sp=new SuperPerson(p);
		sp.superChifan();
	}
}
