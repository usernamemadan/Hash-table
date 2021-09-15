package com.hashtable;

import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> bucketArray;
	
	public MyLinkedHashMap() {
		this.numBuckets = 10;
		this.bucketArray = new ArrayList<>(numBuckets);
		for(int i=0 ; i<numBuckets ; i++) {
			this.bucketArray.add(null);
		}
	}
	
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}
	
	public void add(K key, V value) {
		int index=this.getBucketIndex(key); 
		MyLinkedList<K> myLinkedList = this.bucketArray.get(index);

		if (myLinkedList == null){
			myLinkedList = new MyLinkedList<>();
			this.bucketArray.set(index, myLinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) myLinkedList.search(key);
		if (myMapNode == null)
		{ 
			myMapNode = new MyMapNode<>(key,value); 
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}
	
	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.bucketArray.get(index);
		if(myLinkedList == null)
			return null;
		MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return (myMapNode == null) ? null: myMapNode.getValue(); 
	}
	
	@Override
	public String toString() {
		return "MyLinkedHashMap List{" +bucketArray+ '}';
	}

}
