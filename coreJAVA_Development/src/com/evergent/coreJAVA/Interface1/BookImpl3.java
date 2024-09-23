package com.evergent.coreJAVA.Interface1;
//mutiple inheritance : bookImpl1 impliments both book interface and newbook interface
//here the method of myNewData is also written because that interface is extended to NewBook
//which is implimented to this BookImp3 
public class BookImpl3 implements Book,NewBook { 
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
	public void MyNewBook() {
		System.out.println("My new book");
	}
	public void dataInfo() {
		System.out.println("My New Book");
	}
public static void main(String[] args) {
		BookImpl3 book3 = new BookImpl3();
		book3.BookAuthor();
		book3.BookTitle();
		book3.BookPrice();
		book3.show();
		book3.MyNewBook();
		book3.dataInfo();
	}
}
