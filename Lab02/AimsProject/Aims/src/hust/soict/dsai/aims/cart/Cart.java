package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	public float totalCost() {
		float tempCost = 0;
		for (int i = 0; i < this.itemsOrdered.size(); i++) {
			tempCost += this.itemsOrdered.get(i).getCost();
		}
		return tempCost;
	}
	
	public static int getMaxNumbersOrdered() {
		return MAX_NUMBERS_ORDERED;
	}

	public List<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void printListOrder() {
		float totalCost = totalCost();
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (int i = 0; i < this.itemsOrdered.size(); i++) {
			System.out.print(i+1);
			System.out.println(' ' + this.itemsOrdered.get(i).toString() + "$");
		}
		System.out.println("Total cost: " + totalCost);
		System.out.println("***************************************************");
	}
	
	public Media searchMediaByID(int id) {
		boolean found = false;
		for (Media i : this.itemsOrdered) {
			if (id == i.getId()) {
				System.out.println("Item with ID "+ id + " is:\n" + i.toString());
				found = true;
				return i;
				
			}
		}
		if (found == false) System.out.println("No item with id " + id + " in cart.");
		return null;
	}
	
	public Media searchMediaByTitle(String inp) {
		String usrInp = inp.toLowerCase();;
		boolean found = false;
 		for (int i = 0; i < this.itemsOrdered.size(); i++) {
			if (this.itemsOrdered.get(i).isMatchTitle(usrInp)) {
				System.out.println(this.itemsOrdered.get(i).toString());
				return this.itemsOrdered.get(i);
			}
		}
 		if (!found) System.out.println("No item with title in cart.");
 		return null;
	}
	
	public void addMedia(Media newMedia) {
		if (itemsOrdered.contains(newMedia)) {
			System.out.println("Media is existed.");
		}
		else {
			itemsOrdered.add(newMedia);
			System.out.println("Added succeccfully.");
		}
	}
	
	public void removeMedia(Media removeMedia) {
		if (itemsOrdered.contains(removeMedia)) {
			itemsOrdered.remove(removeMedia);
			System.out.println("Removed successfully");
		}
		else {
			System.out.println("Media is not existed.");
		}
	}
	
	public void sortByTitleCost() {}
	public void sortByCostTitle() {}
	
}
