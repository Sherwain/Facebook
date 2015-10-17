package datastructure;

import java.util.Map;
import java.util.HashMap;

public class LinkedList<E extends Comparable<?>> {
	private int size;
	private Node<E> tail, head;
	
	public LinkedList(){
		size = 0;
		head = tail = null;
	}
	
	public void add(E data){
		if (head == null){
			setHead(new Node<E>(data, getHead()));
			setTail(getHead());
		}
		else{ 
			Node<E> temp = new Node<E>(data, null);
			getTail().setNext(temp);
			setTail(temp);	
		}
		setSize(1);
	}
	
	public void add(Node<E> node){
		if (head == null){
			setHead(node);
			setTail(getHead());
		}
		else{ 
			getTail().setNext(node);
			setTail(node);	
		}
		setSize(1);
	}
	
	public void addToHead(E data){
		head = new Node<E>(data, head);
		if(size == 0) {
			tail = head;
		}
		size++;
	}
	
	public String toString(){
		if (getHead() == null)
			return "[]";
		
		Node<E> cur = getHead();
		StringBuilder str = new StringBuilder("[");
				
		while (cur != null){
			str.append(cur.getDataValue().toString() + ", ");
			cur = cur.getNext();
		}
		str.replace(str.length() - 2, str.length(), "]");
		return str.toString();
	}
	
	protected void setHead(Node<E> head){
		this.head = head;
	}
	
	protected Node<E> getHead(){
		return head;
	}
	
	private void setTail(Node<E> tail){
		this.tail = tail;
	}
	
	private Node<E> getTail(){
		return this.tail;
	}
	
	private void setSize(int size){
		this.size = this.size + (size);
	}
	
	public int getSize(){
		return size;
	}
	
	public void removeDuplicates(){
		if (size <=1)
			return;
		Map<E, Boolean> map = new HashMap<E, Boolean>();
		Node<E> cur = getHead();
		map.put(cur.getDataValue(), true);
		while(cur.getNext() != null){
			if(map.containsKey(cur.getNext().getDataValue())){
				cur.setNext(cur.getNext().getNext());
				setSize(-1);
			}
			else{
				map.put(cur.getNext().getDataValue(), true);
				cur= cur.getNext();
			}
		}
	}
	
	public void removeDuplicatesInPlace(){
		if (getSize() <= 1)
			return;
		Node<E> outer = getHead(), inner;
		
		while(outer != null){
			inner = outer;
			while(inner.getNext() != null){
				if (inner.getNext().getDataValue().equals(outer.getDataValue())){
					inner.setNext(inner.getNext().getNext());
					setSize(-1);
				}
				else{
					inner = inner.getNext();
				}
			}
			outer = outer.getNext();
		}
	}
	
	public E kthToLast(int kth){
		if (getSize() == 1)
			return getHead().getDataValue();
		int count = 0;
		Node<E> runner = getHead(), tailer = getHead();
		while (runner.getNext() != null){
			if (kth >= count)
				tailer = tailer.getNext();
			
			runner = runner.getNext();
			count++;
		}
		return tailer.getDataValue();
	}
	
	public void deleteNode(Node<E> node){
		if (getHead() == null)
			return;
		if (getHead() == null)
			setHead(null);
		
		node.setDataValue(node.getNext().getDataValue());
		node.setNext(node.getNext().getNext());
	}
	
	public boolean hasLoop(){
		if (head == null || head.getNext() == null)
			return false;
		
		Node<E> runner = head, trailer = head;
		
		while (true){
			trailer = trailer.getNext();
			if (runner.getNext() != null)
				runner = runner.getNext().getNext();
			else
				return false;
			if (runner == null)
				return false;
			if (runner == trailer)
				return true;
		}
	}
	
	public Node<E> loopNode(){
		if (head == null || head.getNext() == null)
			return null;
		Node<E> trailer = head.getNext(), runner = head.getNext();
		
		while (true){
			trailer = trailer.getNext();
			
			if (runner.getNext() != null)
				runner = runner.getNext().getNext();
			else
				return null;
			
			if (runner == null)
				return null;
			
			if (runner == trailer){
				trailer = head.getNext();
				while (runner != trailer){
					runner = runner.getNext();
					trailer = trailer.getNext();
				}
				return trailer;
			}
		}
	}
	
	public Node<E> loopNode1(){
		if (head == null || head.getNext() == null)
			return null;
		Node<E> runner = head.getNext();
		Node<E> trailer = head.getNext();
		
		while(true){
			trailer = trailer.getNext();
			if (trailer == null)
				return null;
			if(runner.getNext() != null)
				runner = runner.getNext().getNext();
			else
				return null;
			if(runner == trailer){
				trailer = head.getNext();
				while(runner != trailer){
					
				}
			}
		}
	}
}
