package com.edureka.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		Map<String, String> mapObj = new HashMap<>();
		
		mapObj.put("1", "duplicated");
		mapObj.put("1", "duplicated");
		mapObj.put("2", "duplicated");
		mapObj.put("2", "Value");
		
		
		String value = mapObj.get("2");
		//System.out.println(value);
		System.out.println(mapObj.size());
		
		System.out.println(mapObj.keySet());
		System.out.println(mapObj.values());
		System.out.println(mapObj.containsKey("1dsfsfd"));
		
		Set<Map.Entry<String, String>> entrySet = mapObj.entrySet();
		for(Map.Entry<String, String> entry: entrySet) {
			System.out.println("Key : "+entry.getKey()+" Value : "+ entry.getValue());
		}
	}

}
