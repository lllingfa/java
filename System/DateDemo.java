package System;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateDemo {
	public static void main(String[] args) throws Exception{
		Date d=new Date();
		sop(d);
		String[] mons={"һ��","����","����","����",
						"����","����","����","����",
						"����","ʮ��","ʮһ��","ʮ����"
						};
		//��ӡ��ʱ�俴������ϣ����Щ��ʽ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��E");
			//����format������ģʽ��ʽ��ָ��Date����	
			String time=	sdf.format(d);
				sop("time:"+time);
				//ֻȡ��
				SimpleDateFormat sdf1=new SimpleDateFormat("yyyy");
				String year=sdf1.format(d);
				sop("year="+year);
				//
				Calendar c=Calendar.getInstance();
				sop(c);
				//��̬�Ļ�ȡ������,��0��ʼ����
				sop(c.get(Calendar.YEAR)+"��"+c.get(Calendar.MONTH)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");
				sop("����"+c.get(Calendar.DAY_OF_WEEK));
				int index=c.get(Calendar.MONTH);
				sop(mons[index]);
				//��һ����
				c.add(Calendar.MONTH, -1);
				
				sop(c.get(Calendar.MONTH));
				
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
