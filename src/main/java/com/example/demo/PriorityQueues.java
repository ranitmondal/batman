package com.example.demo;

import java.util.PriorityQueue;
import java.util.Queue;

class PriorityQueues {
    public static void main(String[] args) {
        Queue<Double> myPriorityQueue = new PriorityQueue<Double>();

        // PriorityQueues run as FIFO

        System.out.println("The myPriorityQueue is empty: " + myPriorityQueue.isEmpty());
        // adding items to queue
        myPriorityQueue.offer(3.0);
        myPriorityQueue.offer(1.2);
        myPriorityQueue.offer(2.7);
        myPriorityQueue.offer(6.8);

        while (!myPriorityQueue.isEmpty()) {
            System.out.println("Adding items to queue: " + myPriorityQueue.poll());
        }



        Queue <String> myStringPriorityQueue = new PriorityQueue<String>();

        // PriorityQueues run as FIFO

        System.out.println("The myStringPriorityQueue is empty: " + myStringPriorityQueue.isEmpty());
        // adding items to queue
        myStringPriorityQueue.offer("fgdf");
        myStringPriorityQueue.offer("dfd");
        myStringPriorityQueue.offer("ijkl");
        myStringPriorityQueue.offer("mnoasfsdap");

        while (!myStringPriorityQueue.isEmpty()) {
            System.out.println("Adding items to queue: " + myStringPriorityQueue.poll());
        }




       

    }
}
