package com.hashtable;

public class MyMapNode<K, V> implements INode<K>{

	K key;
	V value;
	MyMapNode<K, V> next;
	
	public MyMapNode(K key, V value) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.value = value;
		next = null;
	}
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setkey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}

	@Override
	public void setNext(INode<K> next) {
		// TODO Auto-generated method stub
		this.next = (MyMapNode<K ,V>) next;
	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return next;
	}
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K=").append(key).append(" V=")
			.append(value).append('}');
		if( next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}
	
	
}
