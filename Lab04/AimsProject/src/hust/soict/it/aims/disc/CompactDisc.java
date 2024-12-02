package hust.soict.it.aims.disc;

import java.util.List;
import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	private static int nbCompactDiscs = 0;
	
	public CompactDisc(String title, String category, double cost, int length, String director,
			           String artist, List<Track> tracks) {
		super(++nbCompactDiscs, title, category, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Track with title " + track.getTitle() + " has already in the list!");
		}
		else {
			tracks.add(track);
			System.out.println("Add successfully!");
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Remove successfully!");
		}
		else {
			System.out.println("Track with title " + track.getTitle() + "has not in the list yet!");
		}
	}
	
	@Override
	public int getLength() {
		int totalLength = 0;
		for(Track t : tracks) {
			totalLength += t.getLength();
		}
		return totalLength;
	}
	
	@Override
	public void play() {
		System.out.println("CD's title: " + super.getTitle());
		System.out.println("Total length: " + this.getLength());
		for(Track t : tracks) {
			t.play();
		}
	}
	
	@Override
	public String toString() {
		return "CD " + super.toString()
				+ " - Artist: " + this.artist
		        + " - Track: " + this.tracks.toString();
	}
}
