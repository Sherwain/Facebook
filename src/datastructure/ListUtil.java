package datastructure;

import java.util.Stack;


public class ListUtil <E extends Comparable<E>>{
	private LinkedList<E> list;
	private Node<E> head;
	
	public ListUtil(){
		list = new LinkedList<E>();
		head = new Node<E>();
	}
	
	public void partition(LinkedList<E> list1, E partition){
		list = new LinkedList<E>();
		head = new Node<E>(list1.getHead());
		Node<E> curr = head;
		list.addToHead(partition);
		int count = 0;
		while (curr != null){
			if (curr.getDataValue().compareTo(partition) == 0){
				count ++;
			}
			if (curr.getDataValue().compareTo(partition) < 0){
				list.addToHead(curr.getDataValue());
			}
			else if (curr.getDataValue().compareTo(partition) == 0 && count > 1){
				list.addToHead(curr.getDataValue());
				count++;
			}
			else if (curr.getDataValue().compareTo(partition) > 0){
				list.add(curr.getDataValue());
			}
			curr = curr.getNext();
		}
				
		list1.setHead(list.getHead());
	}
	
	public LinkedList<Integer> addNumber(Node<E> num1, Node<E> num2){
		LinkedList<Integer> ans = new LinkedList<Integer>();
		Integer units = 0, tenths = 0, result;
		
		while(num1 != null){
			
			result = Integer.valueOf(num1.getDataValue().toString()) + Integer.valueOf(num2.getDataValue().toString()) + tenths;
			units = result % 10;
			tenths = result / 10;
			ans.add(units);
			if (num1.getNext() == null && tenths > 0){
				ans.add(tenths); 
			}			
			num1 = num1.getNext();
			num2 = num2.getNext();
		}
		return ans;
	}
	
	public Node<E> findLoopStart(LinkedList<E> linkedList) {
        if (linkedList == null || linkedList.getHead() == null) {
            return null;
        }

        Node<E> loopStartNode = null;
        Node<E> slow = linkedList.getHead();
        Node<E> fast = linkedList.getHead();

        while (slow != null && fast != null) {
            slow = slow.getNext();
            if (fast.getNext() == null) {
                loopStartNode = null;
                break;
            }
            fast = fast.getNext().getNext();

            // If slow and fast point to the same node, it means that the
            // linkedList contains a loop.
            if (slow == fast) {

                slow = linkedList.getHead();

                while (slow != fast) {
                    // Keep incrementing the two pointers until they both
                    // meet again. When this happens, both the pointers will
                    // point to the beginning of the loop
                    slow = slow.getNext(); // Can't be null, as we have a loop
                    fast = fast.getNext(); // Can't be null, as we have a loop
                }

                loopStartNode = slow;
                break;
            }
        }

        return loopStartNode;
    }
	
	public boolean palindrome(Node<E> node){
		if (node == null)
			return false;
		
		if (node.getNext() == null){
			return true;
		}
		Stack<E> stack = new Stack<E>();
		Node<E> runner = new Node<E>(node);
		Node<E> tail = node;
		int count = 1;
		while(runner != null){
			if (count % 2 == 0){
				stack.push(tail.getDataValue());
				tail = tail.getNext();
			}
			count++;
			runner = runner.getNext();
		}
		runner = new Node<E>(tail);
		if (count % 2 == 0)
			runner = runner.getNext();
		System.out.println("Stack: " + stack);
		while(runner != null){
			E val = stack.pop();
			System.out.println("val: " + val + ". list: " + runner.getDataValue());
			if (runner.getDataValue().compareTo(val) != 0)
				return false;
			runner = runner.getNext();
		}
		return true;
	}
}
