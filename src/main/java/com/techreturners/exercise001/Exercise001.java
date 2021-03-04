package com.techreturners.exercise001;

import java.io.Console;
import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        //we first uppercase char 0 of word meaning the first letter, then add the rest with substring
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        //using previous exersize get first char from first and last name and make sure they are uppercase.
        return Character.toUpperCase(firstName.charAt(0)) + "." +Character.toUpperCase(lastName.charAt(0)) ;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double temp = originalPrice + ((vatRate / 100) * originalPrice);
        //this rounds up to 2 decimal places, number of zeros in round funtion = how many decimal places.
        temp = (double)Math.round(temp * 100d) / 100d;
        return temp;
    }

    public String reverse(String sentence) {
        // Add your code here
        //we create a temp string and add on the sentence from the last char to the first using a loop.
        String tempString = "";
        for (int i = sentence.length() - 1; i >= 0 ; i-- ){
            System.out.println(sentence.charAt(i));
            tempString += sentence.charAt(i);
        }
        return tempString;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int counter = 0;
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getType() == "Linux"){
                counter++;
            }
        }
        return counter;
    }
}
