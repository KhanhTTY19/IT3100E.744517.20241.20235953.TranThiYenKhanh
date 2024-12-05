package hust.soict.dsai.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private List<Media> itemsInStore = new ArrayList<Media>();
	private static int nbItemInStore;
	
	public static int getNbItemInStore() {
		return nbItemInStore;
	}
		
	public List<Media> getItemsInStore() {
		return itemsInStore;
	}

	public void setItemsInStore(List<Media> itemsInStore) {
		this.itemsInStore = itemsInStore;
	}

	public void addMedia(Media newMedia) {
		if (itemsInStore.contains(newMedia)) {
			System.out.println("Media is existed.");
		}
		else {
			itemsInStore.add(newMedia);
			System.out.println("Added succeccfully.");
		}
	}
	
	public void removeMedia(Media removeMedia) {
		if (itemsInStore.contains(removeMedia)) {
			itemsInStore.remove(removeMedia);
			System.out.println("Removed successfully");
		}
		else {
			System.out.println("Media is not existed.");
		}
	}
	
	public Media searchMediaByTitle(String title) {
		for (Media i : itemsInStore) {
			if (title.equals(i.getTitle())) {
				System.out.println("The media is: " + i.toString());
				return i;
			}
		}
		System.out.println("Media's title is not found.");
		return null;
	}
	
	public Media searchMediaByID(int id) {
		for (Media i : itemsInStore) {
			if (id == i.getId()) {
				System.out.println("The media is: " + i.toString());
				return i;
			}
		}
		System.out.println("Media's id is not found.");
		return null;
	}
	
	public void showStore() {
		for (Media i:this.itemsInStore) {
			System.out.println(i.toString());
		}
	}
}
