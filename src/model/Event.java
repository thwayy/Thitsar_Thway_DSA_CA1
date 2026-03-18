/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Thitsar Thway
 */
public class Event {

    //fields
    private String title;
    private String date;
    private String venue;
    private ArrayList<String> assignedVolunteers = new ArrayList<>();
    
    
    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public ArrayList<String> getAssignedVolunteers() {
        return assignedVolunteers;
    }

    public void setAssignedVolunteers(ArrayList<String> assignedVolunteers) {
        this.assignedVolunteers = assignedVolunteers;
    }

}
