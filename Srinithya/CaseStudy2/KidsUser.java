package com.evergent.coreJAVA.Srinithya.CaseStudy2;

class AgeRestrictionException extends Exception{ //AgeRestrictionException
	public AgeRestrictionException(String message) {
		super(message);
	}
}
class BookTypeException extends Exception{ //BookTypeexception
	public BookTypeException(String message) {
		super(message);
	}
}

public class KidsUser implements LibraryUser {

	@Override
	public void registerAccount(int age) throws AgeRestrictionException {
		if(age<12) 
			System.out.println("You have successfully registered under a Kids Account");
		else 
			throw new AgeRestrictionException("Sorry,Age must be less than 12 to register as a kid");
	}
	@Override
	public void requestBook(String btype) throws BookTypeException {
		if(btype.equals("Kids"))
			System.out.println("Book Issued Successfully,Please return the book within 10 days");
		else
			throw new BookTypeException("OOPS! you are allowed to take only kids books");
	}
}
