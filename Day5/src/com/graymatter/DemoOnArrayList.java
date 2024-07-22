package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoOnArrayList {
	
	public static void main(String Args[])
	{
		ArrayList alist = new ArrayList();
		alist.add(56);
		alist.add("hello");
		alist.add(30000);
		alist.add(34.45);
		alist.add(true);
		
		System.out.println(alist);
		
		alist.add(56);
		alist.add(null);
		alist.add(true);
		System.out.println(alist);
		
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(56);
		al.add(35);
		al.add(67);
		
		for(int i:al)
			System.out.println(i);
		
		al.add(2, 89);
		System.out.println(al);
		
		al.addAll(3, alist);
		System.out.println(al);
		//initial capcity of arraylist is 10
		// if arrraylist capacity gets exhausted then capacity increases to the current capacity cc + cc/2
		
		al.remove(4);
		al.remove((Integer)89);
		al.removeFirst();
		al.removeLast();
		System.out.println(al);
		
		System.out.println(al.contains(89));
		
		
		al.clear();
		al.add(56);
		al.add(35);
		al.add(67);
		al.add(45);
		
		Iterator<Integer> itr =al.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			if(i==35)
				itr.remove();
		}
		System.out.println(al);
			//System.out.println(itr.next());
		
		ListIterator<Integer> listitr = al.listIterator();
		System.out.println("list in forward direction");
		while (listitr.hasNext())
		{
			System.out.println(listitr.next());
		}

		System.out.println("list in backward direction");
		while(listitr.hasPrevious())
		{
			System.out.println(listitr.previous());
		}
		
		al.add(23);
		al.add(45);
		al.add(67);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
