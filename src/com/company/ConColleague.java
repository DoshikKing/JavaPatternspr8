package com.company;

public class ConColleague extends Colleague {
    public ConColleague(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }
}
