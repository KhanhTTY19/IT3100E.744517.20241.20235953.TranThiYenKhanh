package hust.soict.dsai.store;

import java.util.Arrays;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private static int nbItemInStore;
	
	public static int getNbItemInStore() {
		return nbItemInStore;
	}
	
	public DigitalVideoDisc[] getItemsInStore() {
			return itemsInStore;
		}
	
	public void addDVD(DigitalVideoDisc newDisc) {
		if (this.itemsInStore == null) {
			this.itemsInStore = new DigitalVideoDisc[1];
			this.itemsInStore[0] = newDisc;
			this.nbItemInStore = 1;
		} 
		else { 
			this.nbItemInStore++;
			this.itemsInStore = Arrays.copyOf(this.itemsInStore, this.nbItemInStore);
			itemsInStore[this.nbItemInStore - 1] = newDisc;
		}
		System.out.println("Successfully added an DVD to store.");
	}
	
	public void removeDVD(DigitalVideoDisc oldDisc) {
		for (int i = 0; i < this.nbItemInStore; i++) {
			if (oldDisc == this.itemsInStore[i]) {
				for (int j = i; j < this.nbItemInStore - 1; j++)
				this.itemsInStore[j] = this.itemsInStore[j + 1];
				this.itemsInStore[this.nbItemInStore - 1] = null;
				this.nbItemInStore--;
				System.out.println("Successfully removed DVD.");
				return;
			}
		}
	}

	
}
