package com.evergent.coreJAVA.Interface1;

public class BookImpl2 implements Book {
	public void BookTitle() {
		System.out.println("BookTitle: coreJava");
	}
	public void BookAuthor() {
		System.out.println("BookAuthor:"+cname);
	}
	public void BookPrice() {
		System.out.println("Book Price: Rs 500");
	}
	public void show() {
		System.out.println("Local Method");
	}
	
public static void main(String[] args) {
		Book b2 = new BookImpl2();
		b2.BookAuthor();
		b2.BookTitle();
		b2.BookPrice();
		//b2.show();    //it is error because by using book and bookImpl1 we can get only interface methods
		                //but not subclass methods because this method is not there in the interface 
	}
}
