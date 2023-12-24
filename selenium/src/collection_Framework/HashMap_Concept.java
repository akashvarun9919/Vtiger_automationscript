package collection_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.checkerframework.checker.units.qual.K;

public class HashMap_Concept {

	public static void main(String[] args) {
		HashMap_Concept obj= new HashMap_Concept();
		
		Map<String,String>hsa=new HashMap<String,String>();
		hsa.put("id","01");
		hsa.put("city", "Mugalsarai");
		hsa.put("prof", "IT");
		hsa.put("fname", "Akash");
		hsa.put("lname", "Varun");
		
//		String name=hsa.get("fname");
//		System.out.println(name);
//		Set<String> data=hsa.keySet();
//     	System.out.println(data);
//		for (String keyname : data) {
//		String keyValueName	=hsa.get(keyname);
//		System.out.println(keyValueName);
//		}
		Set<Entry<String,String>> o=hsa.entrySet();
		System.out.println("***"+hsa.entrySet());
		
		// by using LinkedHashMap...
		LinkedHashMap<String, String> LHM=new LinkedHashMap<String, String>();
		LHM.putAll(hsa);
			System.out.println("###"+LHM.entrySet());
		    
		// by using TreeMap...
		TreeMap<String,String> tm=new TreeMap<String, String>();
		
		tm.putAll(hsa);
		System.out.println("--"+tm);
		
	}
	
	}


