package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello");

        Node lList = new Node(3);
        lList.appendToTail(8);
        lList.appendToTail(6);
        lList.appendToTail(12);

        int in = lList.nodeLength();
        System.out.println(in);
        lList.deleteNode(lList,12);
        in = lList.nodeLength();
        System.out.println(in);

        while(lList!=null){
            System.out.println(lList.data);
            lList = lList.next;
        }


//        System.out.println(lList.next.next.data);

    }
}
