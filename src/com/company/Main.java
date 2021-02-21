package com.company;

public class Main {

    public static void main(String[] args) {

        // Mediator
        AppMediator mediator = new AppMediator();
        ConColleague desktop = new ConColleague(mediator);
        MobileColleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello World");
        mobile.send("Hello");

        // Iterator
        NameRepo namesRepository = new NameRepo();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
