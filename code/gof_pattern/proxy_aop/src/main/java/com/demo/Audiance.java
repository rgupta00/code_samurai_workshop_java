package com.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class Audiance {

	@After("execution(public void doMagic())")
	public void clapping() {
		System.out.println("maza aa gaya");
	}
}
