package com.hashtable;

/**
 * this interface can be used to get and set the values for Linkedlist
 */
public interface INode<K> {

	K getKey();

	public void setkey(K key);

	public void setNext(INode<K> next);

	public INode<K> getNext();

}