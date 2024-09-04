package com.evergent.coreJAVA.Srinithya.CaseStudy2;

public interface LibraryUser {
	void registerAccount(int age) throws AgeRestrictionException;
	void requestBook(String btype) throws BookTypeException;
}
