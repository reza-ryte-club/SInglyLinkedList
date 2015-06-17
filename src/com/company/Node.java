package com.company;

/**
 * Created by rahmanmdrezaur on 6/17/15.
 */
public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) n = n.next;
        n.next = end;

    }

    public int nodeLength(){
        Node temp = this;
        int counter = 0;
        while (temp!= null) {
            temp = temp.next;
            counter++;
        }

        return counter;

    }


    public Node deleteNode(Node head, int d){
        Node n = head;
        if(n.data==d){
            n.next = n.next.next;
            return head.next;
        }

        while(n.next!=null){
            if(n.next.data == d ){
                n.next = n.next.next;
                return head;

            }
            n = n.next;

        }
        return head;
    }



}
