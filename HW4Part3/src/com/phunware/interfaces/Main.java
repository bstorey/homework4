package com.phunware.interfaces;

/************************************************
 *	YOU MAY NOT MODIFY THIS FILE
/************************************************/

import com.phunware.interfaces.people.*;
import com.phunware.interfaces.people.hobbies.*;

public class Main extends Object {

	public static void main(String [] args) {
		John john = new John();
		Mary mary = new Mary();
		Albert albert = new Albert();

		john.getInCar();
		john.startEngine();
		john.driveFast();

		mary.getInPlane();
		mary.jumpFromPlane();
		mary.releaseParachute();

		albert.putOnShoes();
		albert.findAPartner();
		albert.salsa();

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/* Nice work, you pass! */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
