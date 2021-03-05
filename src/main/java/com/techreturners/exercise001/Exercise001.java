package com.techreturners.exercise001;

import java.io.Console;
import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        //we first uppercase char 0 of word meaning the first letter, then add the rest with substring
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        //using previous exersize get first char from first and last name and make sure they are uppercase.
        return Character.toUpperCase(firstName.charAt(0)) + "." +Character.toUpperCase(lastName.charAt(0)) ;
    }

    public double addVat(double originalPrice, double vatRate) {
        double temp = originalPrice + ((vatRate / 100) * originalPrice);
        //this rounds up to 2 decimal places, number of zeros in round funtion = how many decimal places.
        temp = (double)Math.round(temp * 100d) / 100d;
        return temp;
    }

    public String reverse(String sentence) {
        //we create a temp string and add on the sentence from the last char to the first using a loop.
        String tempString = "";
        //what im trying to do is go from the last char to the first char and add each char to a string i return
        //IntStream.range(sentence.length() -1, 1 ).forEach(i -> tempString += sentence.charAt(i));

        
        for (int i = sentence.length() - 1; i >= 0 ; i-- ){
            tempString += sentence.charAt(i);
        }
        return tempString;
    }

    public int countLinuxUsers(List<User> users) {
         int counter = 0;
        
        //users.forEach((n) -> {if(users.get(i).getType().equals("Linux")){
        //     counter++;
        // }});
        //users.forEach(u -> if(users.get(u).getType().equals("Linux") counter++));
        for(int i = 0; i < users.size(); i++){
             //we use .equals instead of === because equals check the proper values, where as === check the point in memory to see if its the same.
             //For learning this means that if we created 2 strings they wont be at the same address therefor a == b = false; where a.equals(b) will be true.
             if(users.get(i).getType().equals("Linux")){
                 counter++;
             }
         }
        return counter;
    }
}
