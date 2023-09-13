package com.demo;

import org.springframework.stereotype.Service;

//Cross cutting concern
@Service(value = "magician")
  public class Magician {
	
	public void doMagic() {
		System.out.println("abara ka dabra...");
		
	}
}
