package section_3.type_of_linkedList_5;



public class DoublyLinkedList {
    private DoublyNode first;
    private DoublyNode last;
    private int size = 0;

    public void addFirst(int item){         //O(1)
        DoublyNode newNode = new DoublyNode(item);

        if (!hasElement()){
            first = newNode;
            last = newNode;
            size++;
            return;
        }

        newNode.setNext(first);
        newNode.getNext().setPre(newNode);
        first = newNode;
        size++;
    }

    public void addLast(int item){          //O(1)
        DoublyNode newNode = new DoublyNode(item);

        if (!hasElement()){
            first = newNode;
            last = newNode;
            size++;
            return;
        }

        last.setNext(newNode);
        newNode.setPre(last);
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
            node.setPre(null);
            first.setNext(null);
            first = node;
            size--;
        }
    }

    public void deleteLast(){               //O(1)
        if( hasElement()){
            if (first.getNext() == null){
                first = null;
                last = null;
                size--;
                return;
            }

            DoublyNode node = last.getPre();
            last.setPre(null);
            last = node;
            last.setNext(null);
            size--;
        }
    }

    public int indexOf (int item){        //O(n)
        if (hasElement()){
            DoublyNode node = first;
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
            DoublyNode node = first;
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
            DoublyNode node = first;
            int counter = 0;

            while (node != null){
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
            DoublyNode node = first;
            System.out.print("[");
            while (node.getNext() != null){
                System.out.print( + node.getValue() + ",");
                node = node.getNext();
            }
            System.out.println(node.getValue() + "]");
        }
        else
            System.out.println("[]");

    }

    private boolean hasElement(){
        return first != null;
    }

    public int getSize() {
        return size;
    }
}
