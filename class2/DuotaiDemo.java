package class2;

abstract class StudentDemo{
	public abstract void study();
	public void sleep(){
		System.out.println("ливек╞");
	}
}
class BaseStudent1 extends StudentDemo{
	public void study(){
		System.out.println("Base study");
	}
}

class AdvStudent1 extends StudentDemo{
	public void study(){
		System.out.println("Adv study");
	}
}

class DoStudent{
	public void doSome (StudentDemo stu){
		stu.study();
		stu.sleep();
	}
}
public class DuotaiDemo {
	public static void main(String[] args){
		DoStudent ds=new DoStudent();
		ds.doSome(new BaseStudent1());
		ds.doSome(new AdvStudent1());
		
		
	}
	
}
