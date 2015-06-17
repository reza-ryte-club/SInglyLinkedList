package com.company;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello");

        Node lList = new Node(3);
        lList.appendToTail(8);
        lList.appendToTail(6);
        lList.appendToTail(8);
        lList.appendToTail(12);
        lList.appendToTail(12);
        lList.appendToTail(12);

        int in = lList.nodeLength();
        System.out.println(in);
        lList.deleteNode(lList,12);
        in = lList.nodeLength();
        System.out.println(in);

        travarseList(lList);
        removeDuplicate(lList);
        travarseList(lList);


        

//        System.out.println(lList.next.next.data);

    }
    
    
     static void travarseList(Node n){
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
         
    }

    static void removeDuplicate(Node n){
        Hashtable table = new Hashtable();
        Node previous =     null;
        while(n!=null) {
            if (table.containsKey(n.data)) {
                previous.next = n.next; // This sets the address of previous node's next  to the next node, hence skips this node
                        
            }
            else {
                table.put(n.data,"poo");
                previous = n;
                
            }
            n = n.next;
            }

        }


}
