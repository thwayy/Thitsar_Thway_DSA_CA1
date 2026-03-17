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
    private String title;
    private String date;
    private String avenue;
    private ArrayList<Volunteer> assignedVolunteers;

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

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public ArrayList<Volunteer> getAssignedVolunteers() {
        return assignedVolunteers;
    }

    public void setAssignedVolunteers(ArrayList<Volunteer> assignedVolunteers) {
        this.assignedVolunteers = assignedVolunteers;
    }
    
}
