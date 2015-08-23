package com.company;

/**
 * Created by reza on 8/23/15.
 */
public class Node {
    Node next = null;
    int data;

    public Node(int d){
        data = d;
    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next!=null){
            n = n.next;
        }

        n.next = end;
    }


    public int nodeLength(){
        Node temp = this;
        int counter = 0;
        while(temp!=null){
            temp = temp.next;
          counter++;
        }
    return counter;
    }


    public void deleteNode(int d){
        Node n = this;
        if(n.data == d){
            n.next = n.next.next;
        }
        while(n.next!=null){
            if(n.next.data==d){
                n.next = n.next.next;
            }
            n = n.next;
        }

    }



}
