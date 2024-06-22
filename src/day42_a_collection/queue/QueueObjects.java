package day42_a_collection.queue;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue <Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);//Duplicates are allowed
        //queue.add(null); // null is not allowed
       // System.out.println(queue.get(0)); // get (index); ---> comes from List Interface  i can not use it here
        System.out.println(queue);
        // insertion order is not KEPT
        queue.offer(30);
        System.out.println(queue);

        System.out.println(queue.poll()); // FIFO - > First In First Out --> first one was removed
        System.out.println(queue);
        System.out.println(queue.peek());// FIFO - > First In First Out --> first one ready to be removed



    }
}
