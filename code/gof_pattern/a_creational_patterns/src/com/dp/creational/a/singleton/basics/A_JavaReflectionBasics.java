package com.dp.creational.a.singleton.basics;
import java.util.*;

import com.dp.creational.a.singleton.Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class A_JavaReflectionBasics {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		//What is java reflection, basic examples and usages
		
	
		//java reflection!
//		Class<?> class1=Class.forName("com.dp.creational.a.singleton.basics.Student");
//		
//		
//		Method methods[]=class1.getMethods();
//		for(Method method: methods) {
//			System.out.println(method.getName()+": "+ method.getModifiers()+": "+ Modifier.toString(method.getModifiers()));
//		}
		
		
		//reflection can break encapsulation
		
       Class<?> class1=Class.forName("com.dp.creational.a.singleton.basics.Demo");
	    Constructor constructor[]=class1.getDeclaredConstructors();
		
		constructor[0].setAccessible(true);
		
		Demo demo=(Demo) constructor[0].newInstance();
		
		
	}
}
