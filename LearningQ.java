package CollectionFW;

import java.util.ArrayDeque;

public class LearningQ {

	public static void main(String args[]) {

		// LinkedList - maintain elemente insertion/deletion order as per we are declaring 
		/*
		 * Queue<Integer> queue = new LinkedList<>();
		 * 
		 * queue.offer(1); queue.offer(2); queue.offer(7);
		 * 
		 * System.out.println(queue);
		 * 
		 * //retrive head element from Q System.out.println(queue.peek());
		 * 
		 * queue.clear(); queue.remove(); queue.poll(); System.out.println(queue);
		 * 
		 * }
		 */

		// priorityQueue - uses HEAP DS and keep smallest element at head of Q 
		
		/*
		 * PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); pq.offer(500);
		 * pq.offer(200); pq.offer(50); pq.offer(100); pq.offer(5);
		 * 
		 * System.out.println(pq);
		 * 
		 * pq.poll(); System.out.println(pq);
		 */
		
		//ArrayDQ - provide same as other queue functionalities just provide some extra function offerfirst/last... and add/remove elements as per declartions.
		
		ArrayDeque<Integer>dq = new ArrayDeque<Integer>();
		dq.offer(500);
		dq.offer(200);
		dq.offer(50);
		dq.offer(100);
		dq.offer(5);

		System.out.println(dq);
		dq.offerFirst(1);
		dq.offerLast(1000);
		
		System.out.println(dq);
		
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
	}
}