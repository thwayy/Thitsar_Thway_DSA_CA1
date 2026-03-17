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
    
    private String availability;

    public Volunteer(int id, String name, String phone, String availability) {
        super(id, name, phone);
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String getInfo() {
        return "Id: "+getId()+"\nName: "+getName()+"\nPhone: "+getPhone()+"\nAvailability: "+getAvailability()+"\n";
    }
    
    
    
}
