
package helloworld;

import java.util.Arrays;

public class hello {
	public static void main(String[] args){
	//int[] x=new int[3];
	int[]  arr=new int[]{3,1,6,5,4};
	
	/* selectSort(arr);
	print(arr);
	bubbleSort(arr);
	print(arr);
	Arrays.sort(arr);
	print(arr);*/
	
	int index=getIndex(arr,5);
	System.out.println(index);
}
	//—°‘Ò≈≈–Ú
public static void selectSort(int[] arr){
	for(int x=0;x<arr.length-1;x++)
		for(int y=x+1;y<arr.length;y++)
		{
			if(arr[x]>arr[y]){
				int temp;
				temp=arr[x];
				arr[x]=arr[y];
				arr[y]=temp;
				
			}
		}

}
//√∞≈›≈≈–Ú
public static void bubbleSort(int[] arr){
	for(int x=0;x<arr.length-1;x++){
		for(int y=0;y<arr.length-x-1;y++)
		{
			if(arr[y]>arr[y+1]){
				int temp;
				temp=arr[y];
				arr[y]=arr[y+1];
				arr[y]=temp;
			}
		}
	}
}
//¥Ú”° ˝◊È
public static void print(int[] arr){
	for(int x=0;x<arr.length;x++)
		System.out.print(arr[x]+"\t");
}
//’“œ¬±Í
public static int getIndex(int[] arr,int key){
	for(int x=0;x<arr.length;x++){
		if(arr[x]==key)
            return x;
	}
	return -1;
}
//’€∞Î≤È’“
public static int halfSearch(int[] arr,int key){
	int min,max,mid;
	min=0;
	max=arr.length-1;
	mid=(max+min)/2;
	while(arr[mid]!=key){
		if(key>arr[mid])
			min=mid+1;
		else if(key<arr[mid])
			max=mid-1;
		if(min>max)
			return -1;
		mid=(max+min)/2;
	}
	return mid;
}

}
