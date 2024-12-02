package hust.soict.it.aims.disc;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title, String category, double cost, int length, String director) {
		super(++nbDigitalVideoDiscs, title, category, cost, length, director);		
	}
	
	public String toString() {
		return "DVD " + super.toString();
	}
	
	public boolean isMatch(String keywords) {
		String[] splitKeywords = keywords.toLowerCase().split("\\s+");
		String toLowerTitle = super.getTitle().toLowerCase();
		
		for(String s : splitKeywords) {
			if(toLowerTitle.contains(s)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}

