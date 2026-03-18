/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helprequestpkg;

import java.util.ArrayList;
import model.HelpRequest;

/**
 *
 * @author Thitsar Thway
 */
public class MyPriorityQueue implements PQInterface {
    ArrayList<PQElement> thePQ;
    
    public MyPriorityQueue(){
        thePQ = new ArrayList<>();
    }
    
    @Override
    public void enqueue(int priorityKey, Object request) {
        int index;
        PQElement newElement = new PQElement(priorityKey, (HelpRequest) request);
        index = findInsertPosition(priorityKey);
        if(index == size()){
            thePQ.add(newElement);
        }
        else{
            thePQ.add(index, newElement);
        }
    }

    @Override
    public Object dequeue() {
        return thePQ.remove(0);
    }

    @Override
    public int size() {
        return thePQ.size();
    }

    @Override
    public boolean isEmpty() {
        return thePQ.isEmpty();
    }

    @Override
    public String printQueue() {
        String printString = new String();
        PQElement currentElement;
        for(int i = 0;i<thePQ.size();i++){
            currentElement = thePQ.get(i);
            printString = printString.concat("Priority Key:"+ currentElement.getPriorityKey() +"\n" + currentElement.printHelpRequest()+"\n");
        }
        return printString;
    }
    
    public int findInsertPosition(int newKey){
        boolean isFound = false;
        int position = 0;
        PQElement currentElement;
        while(position < thePQ.size() && isFound == false){
            currentElement = thePQ.get(position);
            if(newKey < currentElement.getPriorityKey()){
                position++;
            }
            else{
                isFound = true;
            }
        }
        return position;
    }
    //for update functionality in the requests GUI
    @Override
    public HelpRequest findById(int id) {
        for (int i = 0; i < thePQ.size(); i++) {
            PQElement element = (PQElement) thePQ.get(i);
            HelpRequest hr = (HelpRequest) element.getHelpRequest();
            if (hr.getRequestId() == id) {
                return hr;
            }
        }
    return null;
    }

    //for the delete functionality in the requests GUI
    @Override
    public void deleteById(int id) {
        for (int i = 0; i < thePQ.size(); i++) {
            PQElement element = (PQElement) thePQ.get(i);
            HelpRequest hr = (HelpRequest) element.getHelpRequest();
            if (hr.getRequestId() == id) {
                thePQ.remove(i);
                return;
            }
        }
    }
    
}
