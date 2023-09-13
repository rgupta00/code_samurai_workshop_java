package com.dp.behavioural.a.iterator_dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements Iterable<Item> {

	private List<Item>menuItems;
	
	
	public Menu() {
		menuItems=new ArrayList<>();
	}

	public void addItem(Item item) {
		menuItems.add(item);
	}
	@Override
	public Iterator<Item> iterator() {
		return new MenuIterator();
	}

	class MenuIterator implements Iterator<Item>{

		int currentIndex = 0;
		
		@Override
		public boolean hasNext() {
			if (currentIndex >= menuItems.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Item next() {
			return menuItems.get(currentIndex++);
		}

		@Override
		public void remove() {
			menuItems.remove(--currentIndex);
		}
		
	}

}
