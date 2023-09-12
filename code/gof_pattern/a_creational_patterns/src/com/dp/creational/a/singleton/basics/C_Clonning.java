package com.dp.creational.a.singleton.basics;

public class C_Clonning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//What is clonning and usages?
		Student student=new Student(1, "anil");
		Student studentClonned= (Student) student.clone();
		
		System.out.println(student.hashCode());
		System.out.println(studentClonned.hashCode());
	}

}
