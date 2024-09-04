package com.evergent.coreJAVA.Interface1;

public class BookImpl1 implements Book {
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
		BookImpl1 book1 = new BookImpl1();
		book1.BookAuthor();
		book1.BookTitle();
		book1.BookPrice();
		book1.show();
	}
}
