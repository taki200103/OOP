package hust.soict.it.aims.cart;

import hust.soict.it.aims.media.*;

import java.util.ArrayList;


public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsOrdered() {
		return this.itemsOrdered;
	}
	
	public void addMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			System.out.println("Has already in the list!");
		}
		else {
			itemsOrdered.add(media);
			System.out.println("Add successfully!");
		}
	}
	
	public void removeMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Remove successfully");
		}
		else {
			System.out.println("Not in the list yet!");
		}
	}
	
	public double totalCost() {
		double sum = 0;
		for(Media m : itemsOrdered) {
			sum += m.getCost();
		}
		return sum;
	}
	
	public Media search(String keywords) {
		for(Media m : itemsOrdered) {
			if(m.isMatch(keywords)) {
				System.out.println("Found: " + m.toString());
				return m;
			}
		}
		return null;
	}
	
	public Media search(int Id) {
		for(Media m : itemsOrdered) {
			if(m.getId() == Id) {
				System.out.println("Found: " + m.toString());
				return m;
			}
		}
		return null;
	}
	
	public void print() {
		System.out.println("Cart");
		System.out.println("----------------------------");
		for(Media m : itemsOrdered) {
			System.out.println(m.toString());
		}
		System.out.println("----------------------------");
	}
}

