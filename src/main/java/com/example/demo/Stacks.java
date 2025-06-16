package com.example.demo;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();

        //Stack run as LIFO
        


        //pushig items into stack
        myStack.push("Abcd");
        myStack.push("efgh");
        myStack.push("ijkl");
        myStack.push("mnop");

        System.out.println(myStack);





        //removing items from stack
        myStack.pop();


        System.out.println(myStack);

    }
}
