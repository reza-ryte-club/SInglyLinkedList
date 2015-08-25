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
          deleteDups(n);//remove duplicate elements using hashtable
       traverse(n);
    }


    static void traverse(Node n){
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }

    }
    
    
     static void deleteDups(Node n){
        Hashtable table = new Hashtable();
        Node newNode = null;
        Node p = null;
        while(n!=null){
            if(table.containsKey(n.data)){
                newNode.next = n.next;
            }
            else{
                table.put(n.data,true);
                newNode = n;
            }
            n = n.next;

        }



    }
}
