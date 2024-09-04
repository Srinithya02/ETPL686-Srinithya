package com.evergent.coreJAVA.Srinithya.CaseStudy2;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		LibraryUser kiduser1 = new KidsUser();
		System.out.println("\n \t\t Test Case-1 \nAge:10");
		try
		{
			kiduser1.registerAccount(10); // o/p - Successful registration 
			kiduser1.requestBook("Kids");// o/p - successfully book is issued
		}
		catch(AgeRestrictionException | BookTypeException e) 
		{
			System.out.println("\n"+e.getMessage());
		}
		try 
		{
			kiduser1.registerAccount(18); // o/p - AgeRegstrictionException
		}
		catch(AgeRestrictionException e)
		{
			System.out.println("Age-18:"+ e);
		}
		try 
		{
			kiduser1.requestBook("Fiction"); // o/p - BookTypeException
		}
		catch(BookTypeException e)
		{
			System.out.println("BookType-Fiction:"+e);
		}
		
		System.out.println("\n\n \t\t Test Case-2 \nAge:23 ");
		LibraryUser adultuser1 = new AdultUser();
		try
		{
			adultuser1.registerAccount(23); // o/p - Successful registration
			adultuser1.requestBook("Fiction");// o/p - successfully book is issued
		}
		catch(AgeRestrictionException | BookTypeException e) 
		{
			System.out.println("\n"+e.getMessage());
		}
		try 
		{
			adultuser1.registerAccount(5); // o/p - AgeRestrictionException
		}
		catch(AgeRestrictionException e) 
		{
			System.out.println("Age-5:" + e);
		}
		try
		{
			adultuser1.requestBook("Kids"); // o/p - BookTypeException
		}
		catch(BookTypeException e)
		{
			System.out.println("BookType-KidsBooks:"+e);
		}

	}

}
