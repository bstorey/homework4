package com.phunware.objects;

class Artist extends Object {
	// The artist's first name
	String mFirstName;
	// The artist's last name
	String mLastName;

	/*
	 * Artist
	 *
	 * @param firstName (String)
	 * @param lastName (String)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the Artist constructor
	/************************************************/

	public Artist (String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }
}
