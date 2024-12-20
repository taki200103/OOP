package AIMS;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.qtyOrdered < MAX_NUMBERS_ORDERED) {
			int i = this.qtyOrdered;
			this.itemOrdered[i] = disc;
			System.out.println("The disc has been added.");
			this.itemOrdered[i].displayDVDInformation();
			this.qtyOrdered++;
		}
		else {
			System.out.println("The cart is almost full!");
			System.out.println();
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int index = -1; // de la 0 co dia nao
		if(this.qtyOrdered < 0) { // ktra = 0 cung duoc
			System.out.println("The cart is empty!");
			System.out.println();
		}
		else {
			for(int i = 0; i < this.qtyOrdered; i++) {
				if(this.itemOrdered[i].equals(disc)) {
					index = i; // duyet tim kiem , dat lai chi so index 
					break;
				}
			}
			
			if(index != -1) {
				for(int i = index; i < qtyOrdered - 1; i++) {
					this.itemOrdered[i] = this.itemOrdered[i + 1];
				} // dich tu index den cuoi mang
				this.itemOrdered[this.qtyOrdered - 1] = null; 
				// xoa phan tu cuoi cung khi dich mang ve tranh trung 2 phan tu cuoi cung
				this.qtyOrdered--;
				System.out.println("The disc has been removed.");
				System.out.println();
			}
			
			else {
				System.out.println("The disc is not in the cart!");
				System.out.println();
			}
			
		}
	}
	
	public double totalCost() {
		double sum = 0;
		for(int i = 0; i < this.qtyOrdered; i++) {
			sum += this.itemOrdered[i].getCost();
		}
		return sum;
	}
}


