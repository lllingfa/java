package shuzu;

public class shuzu {
public static void main(String[] args){
	toBin(6);
	toBin1(-6);
	toBin2(-6);
	toHex(60);
	int[][] arr=new int[3][4];
	int[][]  arr1=new int[3][];
	arr1[0]=new int[3];
	arr1[1]=new int[1];
	arr1[2]=new int[2];
	//x1为一维，y1为二维
	int []x1,y1[];
	System.out.println(arr1[0].length);
	int[][] arr2={{3,5,1,7},{2,3,5,8},{6,1,8,2}};
	int sum=0;
	for(int x=0;x<arr2.length;x++)
		for(int y=0;y<arr[x].length;y++)
			sum+=arr[x][y];
System.out.println("sum="+sum);}
//十进制转二进制
public static void toBin(int num){
	StringBuffer sb=new StringBuffer();
	while(num>0){
		sb.append(num%2);
		num=num/2;
	}
	System.out.println(sb.reverse());
}
//查表法十进制转二进制
public static void toBin1(int num){
	char[] chs={'0','1'};
	char[] arr=new char[32];
	//定义数组的指针
	int pos=arr.length;
	while(num!=0){
		int temp=num&1;
		arr[--pos]=chs[temp];
		num=num>>>1;
		
	}
	for( int x=pos;x<arr.length;x++){
		System.out.print(arr[x]);
	}
	System.out.println();
	
}
//模板,进制转化
public static void toBin2(int num){
	trans(num,1,1);
}
public static void trans(int num,int base,int offset){
	char[] chs={'0','1','2','3'
		     ,'4','5','6','7'
		     ,'8','9','A','B'
		     ,'C','D','E','F'};
	char[] arr=new char[32];
	int pos=arr.length;
	if(num==0){
		System.out.println(0);
		return;
	}
	while(num!=0){
		int temp=num&base;
		arr[--pos]=chs[temp];
		num=num>>>offset;
	}
	for( int x=pos;x<arr.length;x++){
		System.out.print(arr[x]);
	}
	System.out.println();
}
//十进制转十六进制
public static void toHex(int num){
	char[] chs={'0','1','2','3'
			     ,'4','5','6','7'
			     ,'8','9','A','B'
			     ,'C','D','E','F'};
	StringBuffer sb=new StringBuffer();
	//while(num!=0)
	for(int x=0;x<8;x++){
		int temp=num&15;
		if(temp>9)
			sb.append((char)(temp-10+'A'));
		//sb.append(chs[temp]);
		else
			sb.append(temp);
			
		num=num>>>4;
	}
	System.out.println(sb.reverse());
}
//查表法：将所有的元素临时存储起来，建立对应关系。将结果值作为索引去查建立好的表
  


}
