package com.hashtable;

public class Main {
	public static void main(String[] args) {
		String statement = "To be or not to be";
		MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
		String[] words = statement.toLowerCase().split(" ");
		for (String string : words) {
			Integer value = myHashMap.get(string);
			if(value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(string, value);
		}
		System.out.println(myHashMap);
		
		
		String statement2 = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String,Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words2 = statement2.toLowerCase().split(" ");
		for (String string : words2) {
			Integer value = myLinkedHashMap.get(string);
			if(value == null)
				value = 1;
			else 
				value = value + 1;
			myLinkedHashMap.add(string, value);
		}
		System.out.println(myLinkedHashMap.toString());
	}
}
