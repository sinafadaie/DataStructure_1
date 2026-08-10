package section_3.exercise_2;

public class LinkedList {

    private Node first;
    private Node last;
    private int size = 0;

    public void addFirst(int item){         //O(1)
        Node newNode = new Node(item);

        if (!hasElement()){
            first = newNode;
            last = newNode;
            size++;
            return;
        }

        newNode.setNext(first);
        first = newNode;
        size++;
    }

    public void addLast(int item){          //O(1)
        Node newNode = new Node(item);

        if (!hasElement()){
            first = newNode;
            last = newNode;
            size++;
            return;
        }

        last.setNext(newNode);
        last = newNode;
        size++;
    }

    public void deleteFirst(){              //O(1)
        if (hasElement()){
            if (first.getNext() == null){
                first = null;
                last = null;
                size--;
                return;
            }
            var node = first.getNext();
            first.setNext(null);            //for garbage collector!
            first = node;
            size--;
        }
    }

    public void deleteLast(){
        if( hasElement()){
            if (first.getNext() == null){
                first = null;
                last = null;
                size--;
                return;
            }

            Node node = first;
            while ( node.getNext().getNext() != null){      //beautiful
                node = node.getNext();                      //it means, he is the pre of the last!
            }

            last = node;
            node.setNext(null);
            size--;
        }
    }

    public int indexOf (int item){        //O(n)
        if (hasElement()){
            Node node = first;
            int index = 0;
            while (node.getNext() != null){
                if (node.getValue() == item)
                    return index;
                index++;
                node = node.getNext();
            }

            if (node.getValue() == item)     //last node doesn't check in loop
                return index;                //if we used "node != null" on loop condition
                                             //we don't need this extra if!
            return -1;
        }
        else
            return -1;

    }

    public boolean containOf(int value){    //O(n)
        if (hasElement()){
            Node node = first;
            while (node.getNext() != null){
                if(node.getValue() == value)
                    return true;
                node = node.getNext();
            }
            return node.getValue() == value;
        }
        else return false;
    }

    public int[] toArray(){
        if (hasElement()){
            int[] array = new int[size];
            Node node = first;
            int counter = 0;

            while (node != null){                       //this loop will cover last item!
                array[counter] = node.getValue();
                node = node.getNext();
                counter ++;
            }
            return array;
        }
        return new int[0];
    }


    public void print() {                   //O(n)
        if (hasElement()) {
            Node node = first;
            System.out.print("[");
            while (node.getNext() != null){
                System.out.print( + node.getValue() + ",");      //use print instead println to print them on one line
                node = node.getNext();
            }
            System.out.println(node.getValue() + "]");
        }
        else
            System.out.println("[]");

    }

    public boolean hasElement(){
        return first != null;
    }    //it should be private
                                                             //I make it public for 3.6
    public int getSize() {
        return size;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public void setLast(Node last) {
        this.last = last;
    }

}

