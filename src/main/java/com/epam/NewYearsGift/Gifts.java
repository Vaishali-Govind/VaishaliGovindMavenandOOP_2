package com.epam.NewYearsGift;
import Sweets.sweet;

import java.util.*;

public class Gifts {
     
	private int weight;
	private List<sweet> Sweets = new ArrayList<>();
	public void showGifts() {
		for(sweet sweets : Sweets) {
			System.out.println(sweets);
		}
	}
	public void addGift(sweet sweets) {
		Sweets.add(sweets);
		this.weight += sweets.getWeight(); 
	}
	public void sortByWeight() {
		 Collections.sort(Sweets);
	        System.out.println(("Gifts after sorting by weight: "));
	    }
	
	public int getTotalWeight() {
			return this.weight;
		}
	 public void findByWeight(int from, int to) {
	        for (sweet sweets : Sweets) {
	        	   if (sweets.getWeight() >= from && sweets.getWeight() <= to) {
	                   System.out.println(sweets.getName());
	        	   }
	        }
	 }
}
