package OOPS_4;

import java.util.Iterator;

public class Node implements Iterable<Node>{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
    }

    public Node(int data,Node nodes){
        this.data=data;
        this.next=nodes;
    }


    @Override
    public Iterator<Node> iterator() {
        return new Iter(this);
    }

    class Iter implements Iterator<Node>{

        private Node head;
        public Iter(Node head){
            this.head=head;
        };

        @Override
        public  boolean hasNext(){
            return this.head!=null;
        };

        @Override
        public Node next(){
            Node temp=head;
            head=head.next;
            return temp;
        };
    }
}
