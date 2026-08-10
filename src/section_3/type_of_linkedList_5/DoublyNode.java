package section_3.type_of_linkedList_5;

public class DoublyNode {
    private int value;
    private DoublyNode next;
    private DoublyNode pre;
    public DoublyNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public DoublyNode getNext() {
        return next;
    }

    public DoublyNode getPre() {
        return pre;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public void setPre(DoublyNode pre) {
        this.pre = pre;
    }
}
