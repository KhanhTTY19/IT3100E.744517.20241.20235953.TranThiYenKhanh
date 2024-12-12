package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.store.Store;

public class TestStore {
	public static void main(String[] args) {
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roller", 87, 19.95f);
		store.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		store.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		store.addDVD(dvd3);
		
		for (int i = 0; i < store.getNbItemInStore(); i++) {
			System.out.println(store.getItemsInStore()[i].toString());
		}
		
		System.out.println(store.getNbItemInStore());
		
		store.removeDVD(dvd2);
		for (int i = 0; i < store.getNbItemInStore(); i++) {
			System.out.println(store.getItemsInStore()[i].toString());
		}
	}
}
