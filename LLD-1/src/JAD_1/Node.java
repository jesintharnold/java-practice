package JAD_1;

import java.util.Iterator;

class Node implements Iterable<Integer>{
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ite(this);
    }

    class ite implements  Iterator<Integer>{

        private Node items;

        public  ite(Node item){
          this.items=item;
        };

        @Override
        public boolean hasNext() {
            return (items!=null);
        }

        @Override
        public Integer next() {
            Integer temp=items.data;
            items=items.next;
            return temp;
        }
    };

}