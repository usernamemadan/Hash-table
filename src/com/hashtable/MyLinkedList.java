package com.hashtable;

public class MyLinkedList<K> {

	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;	
	}
		
	public void append(INode<K> myNode) {
		if(this.head == null) {
			this.head = myNode;
		}
		if(this.tail == null) {
			this.tail = myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;

		}
	}
	
	public INode<K> search(K Key) {
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	
	public String print() {
		return "My Nodes: "+head;
	}
	
}


