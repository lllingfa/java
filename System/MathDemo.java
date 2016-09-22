package System;

public class MathDemo {
	public static void main(String[] args) throws Exception{
		double d=Math.ceil(-16.34);//返回大于指定数据的最小整数
		double d1=Math.floor(-12.34);//返回小于指定数据的最大整数
		long l=Math.round(12.34);//四舍五入
		sop("d:"+d);
		sop("d1:"+d1);
		sop("l:"+l);
		double d3=Math.pow(2,3);
		sop("d3:"+d3);
		//随机数
		for(int x=0;x<10;x++){
			int d4=(int)(Math.random()*10+1);
			sop("d4="+d4);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
