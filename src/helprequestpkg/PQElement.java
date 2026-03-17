/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helprequestpkg;

import model.HelpRequest;

/**
 *
 * @author Thitsar Thway
 */
public class PQElement {
    private int priorityKey;
    private HelpRequest request;

    public PQElement(int priorityKey, HelpRequest newRequest) {
        this.priorityKey = priorityKey;
        this.request = newRequest;
    }

    public int getPriorityKey() {
        return priorityKey;
    }

    public void setPriorityKey(int priorityKey) {
        this.priorityKey = priorityKey;
    }

    public Object getHelpRequest() {
        return request;
    }

    public void setHelpRequest(HelpRequest newRequest) {
        this.request = newRequest;
    }
    
    public String printHelpRequest(){
        String display = "Request Id: " + request.getRequestId()+ "\nTopic: "+request.getTopic()+"\nDescription: "+request.getDescription()+"\n-----";
        return display;
    }
}
