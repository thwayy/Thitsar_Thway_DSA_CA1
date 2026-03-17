/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personpkg;

/**
 *
 * @author Thitsar Thway
 */
public class SLNode {
    private Object element;
    private SLNode next;
    
    public SLNode(Object inElement, SLNode inNode){
        element = inElement;
        next = inNode;
    }
    
    public SLNode getNext(){
        return next;
    }
    
    public void setNext(SLNode inNode){
        next = inNode;
    }
    
    public Object getElement(){
        return element;
    }
    
    public void setElement(Object inElement){
        element = inElement;
    }
    
    public String toString() {
        return element.toString();
    }
}
