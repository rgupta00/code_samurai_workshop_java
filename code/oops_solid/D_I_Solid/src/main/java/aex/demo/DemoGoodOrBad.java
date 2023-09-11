package aex.demo;

class Bird {
	void sound() {
		System.out.println("bird sound");
	}

	void swim() {
		System.out.println("default swimming.....");
	}

	void fly() {
		System.out.println("Default flying....");
	}
}

class Eagle extends Bird {

}

class Emu extends Bird {

}

class Duck extends Bird {

}

public class DemoGoodOrBad {

	public static void main(String[] args) {
		
	}
}
