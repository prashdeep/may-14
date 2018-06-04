package com.edureka.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioirityQueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("a");
		queue.add("n");
		queue.add("g");
		queue.add("t");
	
		queue.add("k");

		queue.add("f");
		
		for (int i = 0; i < 5; i++)
			System.out.println(queue.poll());;
			
		System.out.println(queue.size());
	}

}
