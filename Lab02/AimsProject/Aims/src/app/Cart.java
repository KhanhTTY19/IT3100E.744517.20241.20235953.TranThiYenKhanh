package app;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.getQtyOrdered() < this.MAX_NUMBERS_ORDERED) {
			this.setQtyOrdered(qtyOrdered + 1);
			itemOrdered[this.getQtyOrdered()] = disc;
			System.out.println("This disc has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 1; i <= this.qtyOrdered; i++) {
			if (this.itemOrdered[i].equals(disc)) {
				for (int j = i; j < this.qtyOrdered; j++) {
					this.itemOrdered[j] = this.itemOrdered[j + 1];
				}
				this.itemOrdered[this.qtyOrdered] = null;
				this.setQtyOrdered(this.qtyOrdered - 1);
				System.out.println("Disc has been removed from cart.");
				return;
			}
		}
		System.out.println("Unsuccessfully remove disc from cart.");		
	}
	
	public float totalCost() {
		float tempCost = 0;
		for (int i = 1; i <= this.qtyOrdered; i++) {
			tempCost += this.itemOrdered[i].getCost();
		}
		return tempCost;
	}
}