package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestCart {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roller", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd3);
		
		cart.printListOrder();
		
		cart.removeDigitalVideoDisc(dvd3);
		cart.printListOrder();
	}
}
