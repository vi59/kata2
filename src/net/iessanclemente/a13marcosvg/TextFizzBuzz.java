package net.iessanclemente.a13marcosvg;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextFizzBuzz {

	@Test
	public void canCreateClass() {
		FizzBuzz fb = new FizzBuzz();
	}

	@Test
	public void canEvaluate(){
		FizzBuzz fb = new FizzBuzz();
		fb.evaluate(1); 
	}
}
