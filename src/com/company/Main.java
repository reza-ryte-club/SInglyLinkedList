package com.company;
import com.company.Node;
public class Main {



    public static void main(String[] args) {
	// write your code here
        Node n = new Node(4);
        n.appendToTail(3);
        n.appendToTail(6);


        traverse(n);
        int boo = n.nodeLength();
        System.out.println(boo);

        n.deleteNode(3);
        traverse(n);


        boo = n.nodeLength();
        System.out.println(boo);

        System.out.println("Hello");
    }


    static void traverse(Node n){
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }

    }
}
