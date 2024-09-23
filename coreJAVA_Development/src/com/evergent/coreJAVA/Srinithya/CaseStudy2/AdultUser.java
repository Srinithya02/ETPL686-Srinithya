package com.evergent.coreJAVA.Srinithya.CaseStudy2;

public class AdultUser implements LibraryUser{

	@Override
	public void registerAccount(int age) throws AgeRestrictionException{
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}else
			throw new AgeRestrictionException("Sorry, Age must be greater than 12 to register as an adult");
	}
	@Override
	public void requestBook(String btype) throws BookTypeException{
		if(btype.equals("Fiction"))
			System.out.println("Book Issued Successfully,Please return the book within 7 days");
		else
			throw new BookTypeException("OOPS! you are allowed to take only adult Fiction books");
		
	}

}
