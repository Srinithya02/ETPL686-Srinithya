package com.evergent.corejava.lambda;
 @FunctionalInterface
 interface Person2
 {
	abstract public void eat();
 }

public class Lambda2Prog {

	public static void main(String[] args) {
		 
		Person2 p2=() -> { 
			
			 {
				System.out.println("Rich Food...");
			  } 			
		};
        p2.eat();
	}

}
