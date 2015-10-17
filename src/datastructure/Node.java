package datastructure;

public class Node <E extends Comparable<?>>{
	private E dataValue;
	Node<E> next;
	
	
	public Node(Node<E> node){ //copy constructor
		this(node.getDataValue(), node.getNext());
	}
	
	public Node(){
        next = null;
        dataValue = null;
    }
	
	
	public Node(E data, Node<E> node){
        this.dataValue = data;
        this.next = node;
    }
	
	public void setNext(Node<E> next){
		this.next = next;
	}
	
	public void setDataValue(E dataValue){
		this.dataValue = dataValue;
	}
	
	
	public E getDataValue(){
		return dataValue;
	}
	
	public Node<E> getNext(){
		return this.next;
	}
	
	public String toString(){
		return "Data: " + this.dataValue.toString();
	}
}
