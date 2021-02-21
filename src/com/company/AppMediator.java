package com.company;

import java.util.ArrayList;

public class AppMediator implements Mediator {
    private ArrayList<Colleague> colleagues;
    public AppMediator() {
        colleagues = new ArrayList<Colleague>();
    }
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
    public void send(String message, Colleague originator) {
        //let all other screens know that this screen has changed
        for(Colleague colleague: colleagues) {
            //don't tell ourselves
            if(colleague != originator) {
                colleague.receive(message);
            }
        }
    }
}
