

public class Single {

	
	private int num;
	 public void setNum(int num){
		 this.num=num;
	 }
	 public int getNum(){
		 return num;
	 }
	 private Single(){}
	private static Single  s=new Single();
	public static Single getInstance(){
		return s;
	}	
	
}
class SingleDemo{
	public static void main(String[] args){
		System.out.println("hello");
}}