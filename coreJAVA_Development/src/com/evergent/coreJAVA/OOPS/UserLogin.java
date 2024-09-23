package com.evergent.coreJAVA.OOPS;

public class UserLogin {
	public void LoginData() {
		System.out.println("LoginData");
	}
	public void LoginData(String Uname, String pass) {
		System.out.println("Uname:"+Uname);
		System.out.println("Uname:"+pass);
	}
	public void LoginData(String Uname, String pass,String Capcha) {
		System.out.println("Uname:"+Uname);
		System.out.println("Uname:"+pass);
		System.out.println("Capcha:"+ Capcha);
	}
	public void LoginData(int mobile, String pass) {
		System.out.println("Mobile:"+mobile);
		System.out.println("Uname:"+pass);
	}
	public void show() {
		System.out.println("ShowMethod");
	}
	public static void main(String[] args) {
		UserLogin ul = new UserLogin();
		ul.LoginData();
		ul.LoginData("Nithya", "Nithya123");
		ul.LoginData("Nithya","Nithya123", "ABC");
		ul.LoginData(123456789, "Nithya123");
		ul.show();
	}
}
