package collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Set_Concepts {

	public static void main(String[] args) {
		Set hSobject=new LinkedHashSet();
		ArrayList Sobject=new ArrayList ();
		Integer num=new Integer(2);
		String name=new String("My NAME");	
		Sobject.add(name);
		Sobject.add(num);
		Sobject.add("AKASH");
		Sobject.add("b");
		Sobject.add(1);
		Sobject.add(455);
		Sobject.add(null);
		Sobject.add(new HashSet());
		//...............................................
		hSobject.add(1);
		hSobject.add(null);
		hSobject.add("AKASH");
		hSobject.add(new HashSet());
		hSobject.add(455);
		hSobject.add(null);
		hSobject.add(num);
		hSobject.add(name);

//		hSobject.clone();...?
		
		boolean ret=hSobject.removeAll(Sobject);
		System.out.println(ret);
		System.out.println(Sobject);
		System.out.println(hSobject);
		
		
		
		
		
		
		
		
		
	}

}
