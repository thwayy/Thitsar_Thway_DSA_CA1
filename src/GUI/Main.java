package GUI;

import eventpkg.MyQueue;
import helprequestpkg.MyPriorityQueue;
import model.Event;
import model.HelpRequest;
import model.Resident;
import model.Volunteer;
import personpkg.MySLL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Thitsar Thway
 */
public class Main {
    //declare ADTs
public static MySLL personList = new MySLL();
public static MyQueue eventQueue = new MyQueue();
public static MyPriorityQueue requestQueue = new MyPriorityQueue();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //populate persons 
        Volunteer v1 = new Volunteer(1, "Grace Kelly", "0871234567", "Mondays and Wednesdays");
        Volunteer v2 = new Volunteer(2, "Humphrey Bogart", "0852345678", "Friday evenings");
        Resident r1 = new Resident(3, "John Garfield", "0863456789");
        Resident r2 = new Resident(4, "Gene Tierney", "0894567890");

        //add to SLL
        personList.add(v1);
        personList.add(v2);
        personList.add(r1);
        personList.add(r2);

        //populate events
        Event e1 = new Event();
        e1.setTitle("Smartphone Basics");
        e1.setDate("20/04/2026");
        e1.setVenue("Library");

        Event e2 = new Event();
        e2.setTitle("Online Banking");
        e2.setDate("27/04/2026");
        e2.setVenue("Docklands Community Centre");

        eventQueue.enqueue(e1);
        eventQueue.enqueue(e2);

        // populate help requests
        HelpRequest hr1 = new HelpRequest();
        hr1.setRequestId(1);
        hr1.setTopic("Smartphone");
        hr1.setDescription("Cannot figure out how to download apps");

        HelpRequest hr2 = new HelpRequest();
        hr2.setRequestId(2);
        hr2.setTopic("Online Banking");
        hr2.setDescription("Locked out of bank account");

        requestQueue.enqueue(2, hr1);
        requestQueue.enqueue(5, hr2);
        //launch main gui
        new MainGUI().setVisible(true);

    }

}
