package System;

public class MathDemo {
	public static void main(String[] args) throws Exception{
		double d=Math.ceil(-16.34);//���ش���ָ�����ݵ���С����
		double d1=Math.floor(-12.34);//����С��ָ�����ݵ��������
		long l=Math.round(12.34);//��������
		sop("d:"+d);
		sop("d1:"+d1);
		sop("l:"+l);
		double d3=Math.pow(2,3);
		sop("d3:"+d3);
		//�����
		for(int x=0;x<10;x++){
			int d4=(int)(Math.random()*10+1);
			sop("d4="+d4);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
