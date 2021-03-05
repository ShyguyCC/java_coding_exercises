package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        //using the get city function in object person we can see if the input person is from manchester. the equals function returns true or false so it will pass its set out test.
        return person.getCity().equals("Manchester");
    }
    //same as previous funciton we can check the persons age with a get function and check if its over the age limit.
    public boolean canWatchFilm(Person person, int ageLimit) {
        //returns true if getage is above the agelimit.
        return person.getAge() >= ageLimit;
    }
    
}
