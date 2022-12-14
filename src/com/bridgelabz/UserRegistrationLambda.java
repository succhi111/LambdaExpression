package com.bridgelabz;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UserRegistrationLambda
{

    public static void main(String[] args)
    {

        Pattern firstnamepattern,lastnamepattern,emailpattern,mobilenopattern,passwordpattern;

        System.out.println("1. Valid First Name :");
        List<String> firstname = Arrays.asList("Suchendra", "Abc", "abc", "abYZS");
        firstnamepattern = Pattern.compile("(^[A-Z])[A-Za-z]{2,}$");

        // Using regex with lambda expression
        List<String> firstnamelist = firstname.stream().filter(p -> firstnamepattern.matcher(p).find()).collect(Collectors.<String>toList());
        firstnamelist.forEach(System.out::println);

        System.out.println("2. Valid Last Name :");
        List<String> lastname = Arrays.asList("Mishra", "Abc", "abc", "abYZS");
        lastnamepattern = Pattern.compile("(^[A-Z])[A-Za-z]{2,}$");

        // Using regex with lambda expression
        List<String> lastnamelist = lastname.stream().filter(p -> lastnamepattern.matcher(p).find()).collect(Collectors.<String>toList());
        lastnamelist.forEach(System.out::println);

        System.out.println("3. Valid Email :");
        List<String> email = Arrays.asList("abc@yahoo.com", "abc.100@yahoo.com", "abc123@.com.com","abc@abc@gmail.com");
        emailpattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");

        // Using regex with lambda expression
        List<String> emaillist = email.stream().filter(p -> emailpattern.matcher(p).find()).collect(Collectors.<String>toList());
        emaillist.forEach(System.out::println);


        System.out.println("4. Valid Mobile No :");
        List<String> mobileno = Arrays.asList("+91 8686868686", "91 8686868686", "918686868686", "+918686868686");
        mobilenopattern = Pattern.compile("[9]{1}[1]{1}\s([7-9][0-9]{9})");

        // Using regex with lambda expression
        List<String> mobilenolist = mobileno.stream().filter(p -> mobilenopattern.matcher(p).find()).collect(Collectors.<String>toList());
        mobilenolist.forEach(System.out::println);

        System.out.println("5. Valid Password :");
        List<String> password = Arrays.asList("SUCHENDRA0907@", "121Pasd@", "suchendra@1", "SUC@08");
        passwordpattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,12}$");

        // Using regex with lambda expression
        List<String> passwordlist = password.stream().filter(p -> passwordpattern.matcher(p).find()).collect(Collectors.<String>toList());
        passwordlist.forEach(System.out::println);

    }
}