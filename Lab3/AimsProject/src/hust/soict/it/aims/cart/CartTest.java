package hust.soict.it.aims.cart;

import hust.soict.it.aims.disc.*;

public class CartTest {
	public static void main(String[] args) {
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("A","Animation", "Roger Allers", 87, 19);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("B", "Science Fiction", "Geogre Lucas", 87, 20);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("C", "Animation", 18);
		cart.addDigitalVideoDisc(dvd2, dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("D", "Animation", 24);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("E","Animation", 30);
		DigitalVideoDisc[] list = {dvd4, dvd5};
		cart.addDigitalVideoDisc(list);
		
		//Test the print method
		cart.print();
		
		//Test the search method (by title)
		cart.search("A"); //Two items found
		cart.search("F"); //No item found
		
		//Test the search method (by ID)
		cart.search(1); //One item found
		cart.search(9); //No item found
	}
}