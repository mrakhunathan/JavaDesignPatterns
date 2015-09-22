package user;

import source.DataBase;

public class UseSingleton {
	public static void main(String args[]) throws Exception {
		// DataBase db; // Works always
		// DataBase myObj = new DataBase(); // Works if the Constructor is not
		// Private
		DataBase myObj = DataBase.getDataBaseInstance();
		
		myObj.setS1("String s1");
		myObj.setS2("String s2");

		System.out.println("S1=" + myObj.getS1());
		System.out.println("S2=" + myObj.getS2());

		// myObj = new DataBase(); //Might Reinitialize
		// Try making Database's constructor as public, uncomment the above line and try.
		
		System.out.println("S1=" + myObj.getS1());
		System.out.println("S2=" + myObj.getS2());
	}
}
