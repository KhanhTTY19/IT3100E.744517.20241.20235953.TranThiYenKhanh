package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected int id;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isMatchTitle(String name) {
		name.replace(',', ' ');
		String[] word = name.split(" ");
		for (String j : word) {
			if (this.getTitle().toLowerCase().contains(j)) {
				return true;
			}
		}
		return false;
	}

	public int compareTo(Media other) {
		int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        // If titles are the same, compare by cost (higher cost first)
        return Double.compare(other.cost, this.cost);
	}
	
}
