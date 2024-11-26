package hust.soict.it.aims;

import hust.soict.it.aims.cart.Cart;
import hust.soict.it.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Frozen", "Animation", 19.20);
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost is: " + anOrder.totalCost());
		System.out.println();
		anOrder.removeDigitalVideoDisc(dvd1);
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.removeDigitalVideoDisc(dvd4);
		anOrder.removeDigitalVideoDisc(dvd3);
		
		anOrder.addDigitalVideoDisc(dvd4);
	}
}