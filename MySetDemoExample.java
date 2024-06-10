package com.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class MySetDemoExample {

	    public static void main(String[] args) {
	        // HashSet for favorite fruits
	        Set<String> favoriteFruits = new HashSet<>();
	        // LinkedHashSet for favorite vegetables
	        Set<String> favoriteVegetables = new LinkedHashSet<>();

	        // Adding elements to favoriteFruits HashSet
	        favoriteFruits.add("Apple");
	        favoriteFruits.add("Banana");
	        favoriteFruits.add("Orange");
	        favoriteFruits.add("Grapes");
	        favoriteFruits.add("Mango");

	        // Adding elements to favoriteVegetables LinkedHashSet
	        favoriteVegetables.add("Carrot");
	        favoriteVegetables.add("Broccoli");
	        favoriteVegetables.add("Spinach");
	        favoriteVegetables.add("Potato");
	        favoriteVegetables.add("Tomato");

	        // Printing original sets
	        System.out.println("Favorite Fruits: " + favoriteFruits);
	        System.out.println("Favorite Vegetables: " + favoriteVegetables);

	        // Adding a new fruit
	        favoriteFruits.add("Kiwi");
	        System.out.println("After adding Kiwi to favorite fruits: " + favoriteFruits);

	        // Removing a fruit
	        favoriteFruits.remove("Orange");
	        System.out.println("After removing Orange from favorite fruits: " + favoriteFruits);

	        // Checking content
	        System.out.println("Does favorite fruits contain Mango? " + favoriteFruits.contains("Mango"));

	        // Removing an element from favoriteVegetables
	        favoriteVegetables.remove("Spinach");
	        System.out.println("After removing Spinach from favorite vegetables: " + favoriteVegetables);

	        // Deleting an element from favoriteVegetables
	        favoriteVegetables.remove("Carrot");
	        System.out.println("After deleting Carrot from favorite vegetables: " + favoriteVegetables);

	        // Adding a new vegetable
	        favoriteVegetables.add("Cabbage");
	        System.out.println("After adding Cabbage to favorite vegetables: " + favoriteVegetables);
	    }
	}


