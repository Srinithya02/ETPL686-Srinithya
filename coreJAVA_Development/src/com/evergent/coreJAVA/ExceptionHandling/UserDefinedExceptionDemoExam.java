package com.evergent.coreJAVA.ExceptionHandling;
class InvalidShoeException extends Exception{
	public InvalidShoeException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionDemoExam{
	public static void checkShoeNo(int ShoeNo) throws InvalidShoeException{
    	if(ShoeNo>9 || ShoeNo<5) {
			throw new InvalidShoeException("ShoeNo must be Between 5 and 9");
    	}else {
			System.out.println("Your Shoe size is available");
		}
	}
	public static void main(String[] args) {
		try {
			checkShoeNo(49);
		}catch(InvalidShoeException e){
			System.out.println("InvalidShoeException: "+ e.getMessage());
			System.out.println(e);
	    }
		System.out.println("program continues after handling exception");
}
}