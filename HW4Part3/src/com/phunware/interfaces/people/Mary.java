package com.phunware.interfaces.people;

import com.phunware.interfaces.people.hobbies.Skydiver;

/************************************************
 *	ASSIGNMENT:
 *	Have Mary implement the Skydiver interface
/************************************************/

public class Mary extends Person implements Skydiver{
	public Mary() {
		super("Mary", "Whiters", "Female", 1.65d, 62d, "Blue");
	}

	public void getInPlane() {
	}
	public void releaseParachute() {
	}
	public void jumpFromPlane() {
	}
}
