package Map;

import java.util.*;

/*什么时候使用map集合呢？
 * 当数据之间存在映射关系时，就要用到map
 * 记录出现次数
 * 思路：
 * 1.将字符串转换成字符数组，因为要对每一个字母进行操作
 * 2.定义一个map集合，因为打印的结果的字母游戏魂徐，所以使用treemap集合
 * 3.遍历字符数组
 * 将每一个字母作为键去查map集合
 * 如果返回null，就将字母1存入到map集合中
 * 如果返回不是null,说明已经存在并有对应次数
 * 那么获取该次数并进行自增，并将该字母和自增后的次数存入到map集合中，覆盖调用原来键
 * 所对应的值
 * 4.将map集合中的数据变成指定的字符串形式返回*/

public class Maptest1 {
	public static void main(String[] args){
		String str="shdaiu--hdiuq";
		sop(charCount(str));
	}
	public static String charCount(String str){
		char[]chs=str.toCharArray();
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		int count=0;
		for(int x=0;x<chs.length;x++){
			if(!(chs[x]>='a'&&chs[x]<='z'||chs[x]>='A'&&chs[x]<='Z'))
				continue;
				
			Integer value=tm.get(chs[x]);
			/*if(value==null){
				tm.put(chs[x], 1);
			}
			else{
				value=value+1;
				tm.put(chs[x], value);
			}*/
			if(value!=null)
				count=value;
			count++;
			tm.put(chs[x], count);
			count=0;
		}
		sop(tm);
		//以要求的方式显示
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<Character, Integer>> entrySet=tm.entrySet();
		Iterator<Map.Entry<Character, Integer>> it=entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<Character, Integer> me=it.next();
			Character ch=me.getKey();
			Integer value=me.getValue();
			sb.append(ch+"("+value+")");
		}
		return sb.toString();
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
