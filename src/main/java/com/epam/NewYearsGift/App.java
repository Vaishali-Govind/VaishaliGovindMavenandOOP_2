package com.epam.NewYearsGift;

import java.util.Scanner;

import Sweets.Candy_gums;
import Sweets.Candy_lollipop;
import Sweets.Chocolate_bars;
import Sweets.Chocolate_wafers;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Gifts gift = new Gifts();
        
     gift.addGift(new Candy_gums("milkyway",10,20,120,"fruit"));
     gift.addGift(new Candy_lollipop("littleThings",4,10,100,"milky"));
     gift.addGift(new Chocolate_bars("dairyMilk",6,20,50,"darkChocolate"));
     gift.addGift(new Chocolate_wafers("perk",4,10,30,"milkChocolate"));
    
     System.out.println("Total weight of Gift is:"+gift.getTotalWeight());
     gift.showGifts();
     System.out.println();
     gift.sortByWeight();
     gift.showGifts();
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the starting of the range:");
     int start = sc.nextInt();
     System.out.println("Enter the ending of the range:");
     int end = sc.nextInt();
     gift.findByWeight(start,end);
     
    	 
      }
    
}

