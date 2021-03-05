package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        //using the get city function in object person we can see if the input person is from manchester.
        if(person.getCity().equals("Manchester")){
            return true;
        }
        return false;
    }
    //same as previous funciton we can check the persons age with a get function and check if its over the age limit.
    public boolean canWatchFilm(Person person, int ageLimit) {
        if(person.getAge() >= ageLimit){
            return true;
        }
        return false;
    }
    
}
