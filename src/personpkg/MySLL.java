/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personpkg;

/**
 *
 * @author Thitsar Thway
 */
public class MySLL implements LinearListInterface{
    private SLNode head;
    private int size;
    private SLNode currNode;
    private SLNode prevNode;
    
    public MySLL(){
        head = null;
        size = 0;
        currNode = null;
        prevNode = null;
    }
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }
    
    private void setCurrent(int position) {
        prevNode = null;
        currNode = head;
        for(int i=1;i<position;i++){
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    @Override
    public Object get(int position) {
        setCurrent(position);
        return currNode;
    }

    @Override
    public void remove(int position) {
        if(position == 1){
            head = head.getNext();
        }
        else{
            setCurrent(position);
            prevNode.setNext(currNode.getNext());
        }
        size--;
    }

    @Override
    public void add(int position, Object element) {
        if(position == 1){
            SLNode newNode = new SLNode(element, head);
            head = newNode;
        }
        else{
            setCurrent(position);
            SLNode newNode = new SLNode(element, currNode);
            prevNode.setNext(newNode);
        }
        size++;
    }

    @Override
    public void add(Object element) {
        SLNode newNode = new SLNode(element, head);
        if(head==null){
            head = newNode;
        }
        else{
            setCurrent(size);
            currNode.setNext(newNode);
        }
        size++;
    }

    @Override
    public String printList() {
        SLNode tempNode = head;
        String list = "";
        while(tempNode != null){
            list += tempNode.toString();
            tempNode = tempNode.getNext();
        }
        return list;
    }   
    
}
