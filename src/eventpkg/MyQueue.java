/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventpkg;

import java.util.ArrayList;
import model.Event;

/**
 *
 * @author Thitsar Thway
 */
public class MyQueue implements QueueInterface {

    ArrayList<Event> theQueue;

    public MyQueue() {
        theQueue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    @Override
    public int size() {
        return theQueue.size();
    }

    @Override
    public Object frontElement() {
        if (!theQueue.isEmpty()) {
            return theQueue.get(0);
        } else {
            return null;
        }
    }

    @Override
    public void enqueue(Object newItem) {
        theQueue.add(0, (Event) newItem);
    }

    @Override
    public Object dequeue() {
        if (!theQueue.isEmpty()) {
            return theQueue.remove(0);
        } else {
            return null;
        }
    }

}
