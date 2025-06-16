package com.example.demo;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<String>();

        //Queue run as FIFO

        System.out.println("The queue is empty: " + myQueue.isEmpty());
        //adding items to queue
        myQueue.offer("Abcd");
        myQueue.offer("efgh");
        myQueue.offer("ijkl");
        myQueue.offer("mnop");

        System.out.println("Adding items to queue: " + myQueue);

        //removing items from queue
        myQueue.poll();   
        System.out.println("Removing head from the queue: " +myQueue);


    }
}
