package com.phunware.interfaces.people;

import com.phunware.interfaces.people.hobbies.SalsaDancer;

/************************************************
 *	ASSIGNMENT:
 *	Have Albert implement the SalsaDancer interface
/************************************************/

public class Albert extends Person implements SalsaDancer {
	public Albert() {
		super("Albert", "Cobb", "Male", 1.8d, 72d, "Green");
	}

	public void putOnShoes() {
	}
	public void findAPartner() {
	}
	public void salsa() {
	}
}
