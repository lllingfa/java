package System;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateDemo {
	public static void main(String[] args) throws Exception{
		Date d=new Date();
		sop(d);
		String[] mons={"一月","二月","三月","四月",
						"五月","六月","七月","八月",
						"九月","十月","十一月","十二月"
						};
		//打印的时间看不懂，希望有些格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日E");
			//调用format方法让模式格式化指定Date对象	
			String time=	sdf.format(d);
				sop("time:"+time);
				//只取年
				SimpleDateFormat sdf1=new SimpleDateFormat("yyyy");
				String year=sdf1.format(d);
				sop("year="+year);
				//
				Calendar c=Calendar.getInstance();
				sop(c);
				//静态的获取年月日,以0开始计数
				sop(c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
				sop("星期"+c.get(Calendar.DAY_OF_WEEK));
				int index=c.get(Calendar.MONTH);
				sop(mons[index]);
				//上一个月
				c.add(Calendar.MONTH, -1);
				
				sop(c.get(Calendar.MONTH));
				
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
