package DemoCollection.demoMap;

import java.util.*;

public class DemoMap {

	static void oldStyleMap(){
		Map map=new HashMap();
		map.put(1,"Abhishek");
//		map.put(1,"Abhishek");
		map.put(4,"Lokesh");
		map.put(null,"demo");
		map.put(2,"Abhijeet");
		map.put(3,"Laxman");

		//Converting to Set so that we can traverse
		Set s=map.entrySet();

		Iterator itr=s.iterator();

//
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		System.out.println("===============");
//		Also we can solve it by //Converting to Map.Entry so that we can get key and value separately
		while (itr.hasNext()){
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}

	}
	static void newStyleMap(){
		Map<Integer, String>kv=new HashMap<>();
		kv.put(101,"Tata");
		kv.put(102,"Mahindra");
		kv.put(110,"VW");

		Set ss=kv.entrySet();
		Iterator itr = ss.iterator();

		while (itr.hasNext()){
			Map.Entry<Integer,String> keyValue=(Map.Entry)itr.next();
			System.out.println(keyValue.getKey()+" "+ keyValue.getValue());
		}
		//or below this
//		Set<Map.Entry<Integer, String>> entry = kv.entrySet();
//		for(Map.Entry<Integer,String> i:entry){
//			System.out.println(i);
//		}
	}
	public static void main(String[] args) {
//	oldStyleMap();
	newStyleMap();
	}
}
