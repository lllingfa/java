package class3;
/*异常在子父类覆盖中的体现：
 * 1.子类只能是父类问题或者父类的子问题，如果子类有其他的异常，就不能抛出，只能try处理
 * 2.如果父类方法抛出多个异常，那么子类在覆盖改方法时，只能抛出父类异常的子集
 * 3.如果父类或者接口的方法中没有异常抛出，那么子类在覆盖方法时，也不可以抛出异常
 * */
class Demo{
	public void method() throws Exception{
		try{
			throw new Exception();
		}
		finally{
			
		}
		
		/*catch(Exception e){
			try{
				throw e;
			}
			catch(){
				
			}
		}*/
		/*有catch,问题能解决，函数可以不用抛出,必须要声明*/
	}
}



public class Exception4 {
	public static void main(String[] args)//throws Exception
	{
		
		
		
	}
}
