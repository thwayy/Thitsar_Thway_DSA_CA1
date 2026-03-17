/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package helprequestpkg;

import model.HelpRequest;

/**
 *
 * @author Thitsar Thway
 */
public interface PQInterface {
    public void enqueue(int priorityKey, Object request);
    public Object dequeue();
    public int size();
    public boolean isEmpty();
    public String printQueue();
    //helper methods for CRUD operations
    public HelpRequest findById(int id);
    public void deleteById(int id);

}
