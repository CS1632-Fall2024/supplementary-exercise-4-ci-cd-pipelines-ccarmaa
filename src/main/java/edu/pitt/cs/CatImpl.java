package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int catid;
	private String catname;
	private boolean rented;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		catid = id;
		catname = name;
		rented = false;
	}

	public void rentCat() {
		// TODO: Fill in
		rented = true;
	}

	public void returnCat() {
		// TODO: Fill in
		rented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		catname = name;
	}

	public String getName() {
		// TODO: Fill in
		return catname;
	}

	public int getId() {
		// TODO: Fill in
		return catid;
	}

	public boolean getRented() {
		// TODO: Fill in
		return rented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + catid + ". " + catname;
	}

}