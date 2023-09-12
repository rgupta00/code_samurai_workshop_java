package com.dp.creational.a.singleton;

import java.io.Serializable;

/*
 	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum
 */
final public class Singleton implements Cloneable, Serializable {

	// Eager vs lazy loading
	private volatile  static Singleton singleton = null;

	private Singleton() {
		if(singleton!=null) {
			throw new IllegalStateException("object alreay exist");
		}
	}

	// t1 t2
	public static Singleton getSingleton() {
		if (singleton == null)
			synchronized (Singleton.class) {
				if(singleton==null)
					singleton = new Singleton();
			}
		return singleton;
	}

	@Override
	protected Singleton clone() throws CloneNotSupportedException {
		return  singleton;
	}

	
	private Object readResolve() {
		System.out.println("it is called");
		  return singleton;
	}
	
}







