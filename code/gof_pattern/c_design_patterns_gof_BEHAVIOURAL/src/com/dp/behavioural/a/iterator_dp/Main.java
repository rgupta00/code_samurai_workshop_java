package com.dp.behavioural.a.iterator_dp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

//		List<String> list=new ArrayList<>();//Growable array
//		List<String> list=new LinkedList<>();//doubly ll
//		
//		list.add("foo");
//		list.add("bar");
//		
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
//		
		Item i1 = new Item("mouse", 7.50f);
		Item i2 = new Item("laptop", 6.00f);
		Item i3 = new Item("DVD", 6.50f);
		List<Item> menu = new LinkedList<>();
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		
		menu.stream().forEach(item-> System.out.println(item));
		
		
		
//		Item i1 = new Item("mouse", 7.50f);
//		Item i2 = new Item("laptop", 6.00f);
//		Item i3 = new Item("DVD", 6.50f);
//
//		
//		//java 8=> streams vs manual iteratation
//		
//		
//		Menu menu=new Menu();
//		
//		menu.addItem(i1);
//		menu.addItem(i2);
//		menu.addItem(i3);
//		
//		Iterator<Item> it=menu.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}


	}

}
