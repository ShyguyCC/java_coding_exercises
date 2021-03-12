package com.techreturners.exercise001;

import java.io.Console;
import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        //unable to put this stright into a return as it needs to become a string first then we can return the answer.
        //we now are able to use string buffer to break the sentence down, then reverse and then put it back into a string and put that answer to Answer.
        String Answer = new StringBuffer(sentence).reverse().toString();
        return reverse;
    }

    public int countLinuxUsers(List<User> users) {
        //here we use the filter function to go through the users array and get any that have a getType of linux, then add that to a temp array. we then return the size of that array as thats how many times we have a true to the if statement within the filter.
        List<User> temp = users.stream().filter(u -> u.getType().equals("Linux")).collect(Collectors.toList());
        return temp.size();
    }
}
