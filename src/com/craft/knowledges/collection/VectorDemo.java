package com.craft.knowledges.collection;

import java.util.Iterator;
import java.util.*;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> v=new Vector<String>();
		
		v.add("messi");
		v.add("ronaldo");
		v.add("rooney");
		v.add("neymar");
		//v.clear();
		Iterator<String> itr=v.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
