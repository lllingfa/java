package Map;

import java.util.*;

/*一对多映射*/
public class MapDemo2 {
	public static void main(String[] args){
		HashMap<String,String> yure=new HashMap<String,String>();
		yure.put("01", "lisi");
		HashMap<String,String> jiuye=new HashMap<String,String>();
		jiuye.put("01", "zhaoliu");
		HashMap<String,HashMap<String,String>> czbk=new HashMap<String,HashMap<String,String>>();
		czbk.put("yereban", yure);
		czbk.put("jiueyeban", jiuye);
		getStudentInfo(jiuye);
		//遍历czbk集合。获取所有的教室
		Iterator<String> it=czbk.keySet().iterator();
		while(it.hasNext())
		{
			String roomName=it.next();
			HashMap<String,String> room=czbk.get(roomName);
			//sop(roomName);
			getStudentInfo(room);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void getStudentInfo(HashMap<String,String> roomMap){
		Iterator<String> it=roomMap.keySet().iterator();
		while(it.hasNext()){
			String id=it.next();
			String name=roomMap.get(id);
			sop(id+":"+name);
			
		}
	}
}
