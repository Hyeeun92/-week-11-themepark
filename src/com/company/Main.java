package com.company;

public class Main {

    public static void main(String[] args) {

        int people = 90;
        int maxPeople = 600;
        int peopleRide = 40;
        int peopleGetLine = 63;
        int min = 0;

        do {
            people -= peopleRide ;
            people += peopleGetLine;
            min +=5;
            System.out.printf("After %d minutes - total people is %d\n", min, people);
        } while (people < maxPeople);
    }
}
