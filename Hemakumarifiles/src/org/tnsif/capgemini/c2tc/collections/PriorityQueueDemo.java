package org.tnsif.capgemini.c2tc.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
			Queue<Integer> priorqueue=new PriorityQueue<>();
			
			priorqueue.add(10);
			priorqueue.add(25);
			priorqueue.add(15);
			priorqueue.add(30);
			System.out.println(priorqueue);
			System.out.println(priorqueue.poll());
			System.out.println(priorqueue);
			System.out.println(priorqueue.poll());
			System.out.println(priorqueue);
			System.out.println(priorqueue.poll());
			System.out.println(priorqueue);
		}
}
