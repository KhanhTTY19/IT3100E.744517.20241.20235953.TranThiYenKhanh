package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(String bookTitle, String bookCategory, float bookCost) {
		this.title = bookTitle;
		this.category = bookCategory;
		this.cost = bookCost;
		
	}

	public List<String> getAuthors() {
		return authors;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("This author is existed in list.");
		} 
		else {
			authors.add(authorName);
			System.out.println("Successfully added author to the list.");
		}
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Successfully removed author from the list.");
		}
		else {
			System.out.println("This author is not existed in list.");
		}
	}
	
}
