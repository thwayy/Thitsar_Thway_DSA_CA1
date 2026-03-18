package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Thitsar Thway
 */
public class Volunteer extends Person {
    
    //fields
    private String availability;

    //constructor
    public Volunteer(int id, String name, String phone, String availability) {
        super(id, name, phone);
        this.availability = availability;
    }

    //getters and setters
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    //method to display info
    @Override
    public String getInfo() {
        return "Volunteer Id: " + getId() + "\nVolunteer Name: " + getName() + "\nPhone: " + getPhone() + "\nAvailability: " + getAvailability() + "\n";
    }


}
