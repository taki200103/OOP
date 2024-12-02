package hust.soict.it.aims.media;

import hust.soict.it.aims.book.*;

import hust.soict.it.aims.disc.*;

import java.util.ArrayList;

public class PolymorphismTest {
	public static void main(String[] args) {
		ArrayList<Media> mediaList = new ArrayList<Media>();
		
	    ArrayList<String> authors = new ArrayList<String>();
	    authors.add("summer");
	    authors.add("Gray");
		Book b = new Book("Snow ", "Comic ", 50.99, authors);
	    
		ArrayList<Track> tracks = new ArrayList<Track>();
		Track track1 = new Track("AAA", 30);
		Track track2 = new Track("B", 70);
		tracks.add(track1);
		tracks.add(track2);
		CompactDisc cd = new CompactDisc("A", "Ani", 30.95, 200, "El", "Diana", tracks);
		
		DigitalVideoDisc dvd = new DigitalVideoDisc("Snow", "Animation", 40.15, 150, "Alice");
		
		mediaList.add(dvd);
		mediaList.add(cd);
		mediaList.add(b);
		
		for(Media m : mediaList) {
			System.out.println(m.toString());
		}
	}
}
