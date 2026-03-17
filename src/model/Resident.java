package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thitsar Thway
 */
public class Resident extends Person{
    
    public Resident(int id, String name, String phone) {
        super(id, name, phone);
    }

    @Override
    public String getInfo() {
        return "Resident Id: "+getId()+"\nResident Name: "+getName()+"\nPhone: "+getPhone()+"\n";
    }
    
}
