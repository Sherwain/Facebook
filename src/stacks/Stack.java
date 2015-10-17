package stacks;

public class Stack<E> {
	private int  top, capacity, size;
	private E[] elements;
	
	@SuppressWarnings("unchecked")
	public Stack(){
		this.capacity =  100;
		this.top = this.capacity - 1;
		size = 0;
		elements = (E[]) new Object [this.capacity];
		
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int size){
		this.capacity = size;
		this.top = this.capacity - 1;
		size = 0;
		elements = (E[]) new Object [this.capacity];
	}
	
	public E push(E data){
		if (top < 0){
			resize();
		}
		try{
			elements[top--] = data;
			size++;
			return data;
		}
		catch(Exception e){
			return null;
		}
	}
	
	
	public E pop(){
		if (isEmpty())
			return null;
		E val;
		val = elements[++top];
		size--;
		return val;
	}
	
	public E peek(){
		if (isEmpty())
			return null;
		return elements[top + 1];
	}
	
	@SuppressWarnings("unchecked")
	private void resize(){
		int newSize = capacity * 2;
		E[] temp = (E[]) new Object[capacity * 2];
		
		for (int i = capacity - 1; i > 0; i --){
			temp[i + capacity] = elements[i];
		}
		top = capacity - 1;
		capacity = newSize;
	}
	
	public boolean isEmpty(){
		return capacity -1 == top;
	}
	
	public String toString(){
		if (isEmpty())
			return null;
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (int i = top + 1; i < capacity; i ++){
			str.append(elements[i]);
			if(i + 1 == capacity)
				str.append("]");
			else
				str.append(", ");
		}
		return str.toString();
	}
	
	public int getSize(){
		return this.size;
	}
}
