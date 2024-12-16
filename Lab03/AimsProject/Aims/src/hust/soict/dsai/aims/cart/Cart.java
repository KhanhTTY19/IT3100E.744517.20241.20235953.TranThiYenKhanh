package hust.soict.dsai.aims.cart;

import java.util.Scanner;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (getQtyOrdered() < this.MAX_NUMBERS_ORDERED) {
			setQtyOrdered(qtyOrdered + 1);
			itemOrdered[getQtyOrdered()-1] = disc;
			System.out.println("This disc has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (DigitalVideoDisc i : dvdList) {
			if (getQtyOrdered() < this.MAX_NUMBERS_ORDERED) {
				setQtyOrdered(qtyOrdered + 1);
				itemOrdered[getQtyOrdered() - 1] = i;
				System.out.println("This disc has been added");
			}
			else {
				System.out.println("The cart is almost full");
				break;
			}
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc, int quantity) {
		for (int i = 0; i < quantity; i++) {
			if (this.qtyOrdered < this.MAX_NUMBERS_ORDERED) {
				setQtyOrdered(qtyOrdered + 1);
				itemOrdered[getQtyOrdered() - 1] = disc;
				
			}
			else {
				System.out.printf("Added %d items because the cart is almost full\n", quantity);
				return;
			}
		}
		System.out.printf("Successfully added %d items to cart\n", quantity);
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 1; i <= this.qtyOrdered; i++) {
			if (this.itemOrdered[i].equals(disc)) {
				for (int j = i; j < this.qtyOrdered; j++) {
					this.itemOrdered[j] = this.itemOrdered[j + 1];
				}
				this.itemOrdered[this.qtyOrdered - 1] = null;
				setQtyOrdered(this.qtyOrdered - 1);
				System.out.println("Disc has been removed from cart.");
				return;
			}
		}
		System.out.println("Unsuccessfully remove disc from cart.");		
	}
	
	public float totalCost() {
		float tempCost = 0;
		for (int i = 0; i < this.qtyOrdered; i++) {
			tempCost += this.itemOrdered[i].getCost();
		}
		return tempCost;
	}
	
	public void printListOrder() {
		float totalCost = totalCost();
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (int i = 0; i < this.qtyOrdered; i++) {
			System.out.print(i+1);
			System.out.println(' ' + this.itemOrdered[i].toString() + "$");
		}
		System.out.println("Total cost: " + totalCost);
		System.out.println("***************************************************");
	}
	
	public void searchDVDByID() {
		int id;
		boolean found = false;
		System.out.println("Input the item's ID: ");
		Scanner inp = new Scanner(System.in);
		id = inp.nextInt();
		inp.close();
		for (DigitalVideoDisc i : this.itemOrdered) {
			if (id == i.getID()) {
				System.out.println("Item with ID "+ id + " is:\n" + i.toString());
				found = true;
				return;
			}
		}
		if (found == false) System.out.println("No item with id " + id + " in cart.");
	}
	
	public void searchDVDsByTitle() {
		String usrInp;
		boolean found = false;
		Scanner inp = new Scanner(System.in);
		usrInp = inp.nextLine().toLowerCase();
 		for (int i = 0; i < this.qtyOrdered; i++) {
			if (this.itemOrdered[i].isMatchTitle(usrInp)) {
				System.out.println(this.itemOrdered[i].toString());
				found = true;
			}
		}
 		if (!found) System.out.println("No item with title in cart.");
	}
	
}
