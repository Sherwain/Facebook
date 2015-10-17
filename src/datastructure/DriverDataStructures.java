package datastructure;


public class DriverDataStructures {
	public static void main(String[] args){
		LinkedList<Integer> num1 = new LinkedList<Integer>();
		LinkedList<Integer> num2 = new LinkedList<Integer>();
		ListUtil<String> util = new ListUtil<String>();
		
		LinkedList<String> cir = new LinkedList<String>();
		
		num1.addToHead(6);
		num1.addToHead(1);
		num1.addToHead(7);
		num2.addToHead(2);
		num2.addToHead(9);
		num2.addToHead(5);
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(util.addNumber(num2.getHead(), num1.getHead()));
		
		Node<String> node1 = new Node<String>("A", null);
		Node<String> node2 = new Node<String>("B", null);
		Node<String> node3 = new Node<String>("C", null);
		Node<String> node4 = new Node<String>("C", null);
		Node<String> node5 = new Node<String>("B", null);
		Node<String> node6 = new Node<String>("A", null);
		
		cir.add(node1);
		cir.add(node2);
		cir.add(node3);
		cir.add(node4);
		cir.add(node5);
		cir.add(node6);
		
		System.out.println(cir.hasLoop());
		System.out.println(util.palindrome(cir.getHead()));
		
		//System.out.println(list);
		//list.addToHead(1009);
		//System.out.println(list);
		//System.out.println(list.kthToLast(2));
		//util.partition(list, 50);
		//System.out.println(list);
		
	}
}
