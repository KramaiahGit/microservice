package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootProject1ApplicationTests {

	@Test
	void contextLoads() {
		
		System.out.println("welcome");
	}
	
	class A {
		
		private String test ="";
		
		A(){
			
		}
		
		public void dummy(int number) {
			number =10;
			
			if (number ==0) {
				System.out.println("welcome");
			}
			
		}
		
	}

}
