package com.javacollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class JavaCollection {
	public static void main(String[] args) {
		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo();
	}

	private static void doListDemo() {
		System.out.println("In doLIstDemo");
		java.util.List<String> List = new LinkedList<>();
		List.add("Ravi");
		List.add("Vijay");
		List.add("Ravi");
		List.add("Ajay");
		
		Iterator<String> itr=List.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	private static void doStackDemo() {
		System.out.println("\nIn doStackDemo");
		Stack<String> stack = new Stack<>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	private static void doQueueDemo() {
		System.out.println("\nIN doQueueDemo");
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("iterating the queue elements: ");
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	
	private static void doSetDemo() {
		System.out.println("\nIn doSetDemo");
		Set<String> set = new LinkedHashSet<>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Amit");
		set.add("Ajay");
		for (String str : set) {
			System.out.println(str);
		}
	}
	
	private static void doMapDemo() {
		Map<Integer,String> map = new HashMap<>();
		map.put(100,"Amit");
		map.put(101, "Vijay");
		map.put(102,"Rahul");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}	
}