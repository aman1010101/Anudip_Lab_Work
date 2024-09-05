package com;

import java.util.HashSet;

/*--Creating an RealEstate Class---*/
class RealEstate {
	/*---HashSet to store elements---*/
	private HashSet<String> properties;

	/*--- Constructor to initialize the HashSet--*/
	public RealEstate() {
		properties = new HashSet<>();
	}

	/*--Method to add an element to the HashSet--*/
	public void addProperty(String property) {
		boolean isAdded = properties.add(property);
		if (isAdded) {
			System.out.println(property + " added to the list");
		} else {
			System.out.println(property + " is already present in the list.");
		}
	}

	/*-- Method to display all elements in the HashSet--*/
	public void displayProperties() {
		System.out.println("Current properties in the HashSet: " + properties);
	}
}

public class RealEstatePortal {

	public static void main(String[] args) {
		// Create an object of RealEstateHashSet
		RealEstate propertySet = new RealEstate();

		/*--- Adding properties to the HashSet..--*/
		propertySet.addProperty("Flat");
		propertySet.addProperty("Land");
		propertySet.addProperty("Shop");

		propertySet.addProperty("Flat");// Trying to add a duplicate element

		/*--Display all properties----*/
		propertySet.displayProperties();
	}
}
